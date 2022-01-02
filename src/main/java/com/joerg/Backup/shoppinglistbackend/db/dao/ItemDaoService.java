package com.joerg.shoppinglistbackend.db.dao;

// import java.util.ArrayList;
// import java.util.List;

import javax.persistence.EntityManager;
// import javax.persistence.PersistenceContext;
// import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.joerg.shoppinglistbackend.db.entity.DbItem;
// import com.joerg.shoppinglistbackend.rest.ItemDto;

// @Component
// @Repository
// @Transactional
public class ItemDaoService {
	@Autowired
	EntityManager em;

	/*
	public List<ItemDto> findAll() {
		List<ItemDto> itemDtoList = new ArrayList<ItemDto>();
		TypedQuery<DbItem> namedQuery = this.em.createNamedQuery("find_all_items", DbItem.class);
		List<DbItem> dbItemList = namedQuery.getResultList();
		for (DbItem dbItem : dbItemList) {
			itemDtoList.add(new ItemDto(dbItem.getId(), dbItem.getName()));
		}
		return itemDtoList;
	}
	
	public ItemDto saveItem(ItemDto itemDto) {
		DbItem dbItem = this.em.merge(new DbItem(itemDto.getId(), itemDto.getName()));
		return new ItemDto(dbItem.getId(), dbItem.getName());
	}
	
	public void deleteItemById(Long id) {
		DbItem dbItem = em.find(DbItem.class, id);
		this.em.remove(dbItem);
	}
	*/
}
