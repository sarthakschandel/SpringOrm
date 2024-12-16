package com.sarthak.spring.springorm.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // mandatory as it makes this bean an Entity/Model/ the thing that needs to be
		// mapped onto db table
@Table(name = "Product") // optional
public class Product {

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

	@Id // mandatory as this marks it as the primary key in the Db
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String desc;

	@Column(name = "price")
	private double price;
	// with all 4 annotations used above, now this bean becomes the Enity/Model

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
