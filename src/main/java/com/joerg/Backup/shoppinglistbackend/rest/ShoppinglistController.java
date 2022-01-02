package com.joerg.shoppinglistbackend.rest;

import java.net.URI;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.joerg.shoppinglistbackend.db.repository.ItemRepository;
import com.joerg.shoppinglistbackend.model.Item;

@RestController
public class ShoppinglistController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// @Autowired
	// ItemDaoService itemDaoService;
	
	@Autowired
    ItemRepository itemRepository;
	
	@GetMapping(path = "/items")
	public List<Item> getAllItems() {
		logger.info("getAllItems() called");
		return this.itemRepository.findAll();
	}
	
	@PostMapping(path = "/items")
	public ResponseEntity<Object> createItem(@RequestBody Item item) {
		logger.info("createItem(itemDto) called, with item: {}", item);
		// ItemDto savedItemDto = this.itemDaoService.saveItem(itemDto);
		Item savedItem = this.itemRepository.save(item);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedItem.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path = "/items/{id}")
	public ResponseEntity<Void> deleteItemById(@PathVariable Long id) {
		logger.info("deleteItemById(id) called, with id: {}", id);
		// this.itemDaoService.deleteItemById(id);
		this.itemRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
