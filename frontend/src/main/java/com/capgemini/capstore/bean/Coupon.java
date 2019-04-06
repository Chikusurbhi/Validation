package com.capgemini.capstore.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="coupon")
public class Coupon
{	
	@Id
	@Column(name="coupon_id",length=10)
	private String coupon_id;
	@Column(name="coupon_code",length=6)
	private String coupon_code;
	@Column(name="description",length=50)
	private String description;
	@Column(name="expiry_date",length=50)
	@Temporal(TemporalType.DATE)
	private Date expiry_date;
	@Column(name="coupon_applied",length=5)
	private boolean coupon_applied;
	
	@ManyToMany
	@JoinTable(name="product_coupon"
					,joinColumns=@JoinColumn(name="prod_id")
					,inverseJoinColumns=@JoinColumn(name="coupon_id")
			   )
	private List<Product> prod_coupon;
	
	public Coupon() 
	{
		super();
	}

	public Coupon(String coupon_id, String coupon_code, String description, Date expiry_date, boolean coupon_applied,
			List<Product> prod_coupon) {
		super();
		this.coupon_id = coupon_id;
		this.coupon_code = coupon_code;
		this.description = description;
		this.expiry_date = expiry_date;
		this.coupon_applied = coupon_applied;
		this.prod_coupon = prod_coupon;
	}

	public String getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public boolean isCoupon_applied() {
		return coupon_applied;
	}

	public void setCoupon_applied(boolean coupon_applied) {
		this.coupon_applied = coupon_applied;
	}

	public List<Product> getProd_coupon() {
		return prod_coupon;
	}

	public void setProd_coupon(List<Product> prod_coupon) {
		this.prod_coupon = prod_coupon;
	}

	@Override
	public String toString() {
		return "Coupon [coupon_id=" + coupon_id + ", coupon_code=" + coupon_code + ", description=" + description
				+ ", expiry_date=" + expiry_date + ", coupon_applied=" + coupon_applied + ", prod_coupon=" + prod_coupon
				+ "]";
	}

	
}

