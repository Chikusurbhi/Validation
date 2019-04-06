package com.capgemini.capstore.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orders")
public class Orders
{
	@Id
	@Column(name="order_id",length=10)
	private String order_id;
	@Column(name="purchase_date",length=50)
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="delivery_address")
	private Address delivery_address;
	@Column(name="deliver_date",length=50)
	@Temporal(TemporalType.DATE)
	private Date delivery_date;
	@OneToOne(cascade=CascadeType.ALL)
	private  Invoice  invoice;	
	@Column(name="status",length=20)
	private String orderStatus;
	@Column(name="subtotal",length=10)
	private Double subTotal;
	@Column(name="payment_acc_no",length=16)
	private long payment_acc_no;
	
	@Column(name="payment_option",length=20)
	private String payment_option;
	
	@ManyToMany
	@JoinTable(name="orders_product",
	joinColumns=@JoinColumn(name="order_id"),
	inverseJoinColumns=@JoinColumn(name="prod_id"))
	private List<Product> orders_product  = new ArrayList<>();
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="cart_order")
//	@JoinTable(name="cart_order",
//			joinColumns=@JoinColumn(name="order_id"),
//			inverseJoinColumns=@JoinColumn(name="cart_id"))
	private List<Cart> cart;
	
	public Orders() 
	{
		super();
	}

	public Orders(String order_id, Date purchaseDate, Address delivery_address, Date delivery_date, Invoice invoice,
			String orderStatus, Double subTotal, long payment_acc_no, String payment_option,
			List<Product> orders_product, List<Cart> cart) {
		super();
		this.order_id = order_id;
		this.purchaseDate = purchaseDate;
		this.delivery_address = delivery_address;
		this.delivery_date = delivery_date;
		this.invoice = invoice;
		this.orderStatus = orderStatus;
		this.subTotal = subTotal;
		this.payment_acc_no = payment_acc_no;
		this.payment_option = payment_option;
		this.orders_product = orders_product;
		this.cart = cart;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Address getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(Address delivery_address) {
		this.delivery_address = delivery_address;
	}

	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public long getPayment_acc_no() {
		return payment_acc_no;
	}

	public void setPayment_acc_no(long payment_acc_no) {
		this.payment_acc_no = payment_acc_no;
	}

	public String getPayment_option() {
		return payment_option;
	}

	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}

	public List<Product> getOrders_product() {
		return orders_product;
	}

	public void setOrders_product(List<Product> orders_product) {
		this.orders_product = orders_product;
	}

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", purchaseDate=" + purchaseDate + ", delivery_address="
				+ delivery_address + ", delivery_date=" + delivery_date + ", invoice=" + invoice + ", orderStatus="
				+ orderStatus + ", subTotal=" + subTotal + ", payment_acc_no=" + payment_acc_no + ", payment_option="
				+ payment_option + ", orders_product=" + orders_product + ", cart=" + cart + "]";
	}

}