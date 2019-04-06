package com.capgemini.capstore.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart
{
	@Id
	@Column(name="cart_id")
	private String cart_id;
	
	@ManyToMany(mappedBy="cart_product")
//	@JoinTable(name="cart_product",
//		joinColumns=@JoinColumn(name="cart_id"),
//		inverseJoinColumns=@JoinColumn(name="prod_id")
//	)
	private List<Product> products = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="cart_order",
			joinColumns=@JoinColumn(name="cart_id"),
			inverseJoinColumns=@JoinColumn(name="order_id"))
	private List<Orders> cart_order;
	public Cart() 
	{
		super();
	}
	public Cart(String cart_id, List<Product> products, List<Orders> cart_order) {
		super();
		this.cart_id = cart_id;
		this.products = products;
		this.cart_order = cart_order;
	}
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Orders> getCart_order() {
		return cart_order;
	}
	public void setCart_order(List<Orders> cart_order) {
		this.cart_order = cart_order;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", products=" + products + ", cart_order=" + cart_order + "]";
	}
	
}
