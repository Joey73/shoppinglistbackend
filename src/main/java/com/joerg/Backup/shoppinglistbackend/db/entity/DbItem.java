package com.joerg.shoppinglistbackend.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

// @Entity
// @Table(name = "items")
// @NamedQuery(name = "find_all_items", query = "select i from DbItem i")
public class DbItem {
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;

	
	public DbItem() {
		super();
	}

	
	public DbItem(Long id, @NotBlank String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DbItem [id=" + id + ", name=" + name + "]";
	}
	*/
}
