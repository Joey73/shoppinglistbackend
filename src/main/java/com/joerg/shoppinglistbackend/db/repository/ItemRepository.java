package com.joerg.shoppinglistbackend.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joerg.shoppinglistbackend.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
