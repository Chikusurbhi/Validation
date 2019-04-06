package com.capgemini.capstore.bean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="customer")
public class Customer
{
	@Id
	@Column(name="customer_mobile_no",length=10)
	private String customer_mobile_no;
	@Column(name="name",length=50)
	private String name;
	@Column(name="email",length=70)
	private String email;
	@Column(name="password",length=20)
	private String password;
	@Column(name="gender",length=6)
	private String gender;
	@Column(name="dob",length=20)
	@Temporal(TemporalType.DATE)
	private Date dob;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="wishlist_id")
	private WishList wishlist;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	private Cart cart;
	@OneToMany(mappedBy="customer_card",cascade=CascadeType.ALL)
	private List<SavedCardDetails> cardDetail=new ArrayList<>();
	@Column(name="active",length=5)
	private boolean active;
	@OneToMany(mappedBy="customerAddress",cascade=CascadeType.ALL)
	private List<Address> adresses=new ArrayList<>();
	
	@ManyToMany(mappedBy="customerFeedback")
//	@JoinTable(name="customer_feedback"
//			,joinColumns=@JoinColumn(name="feedback_id")
//			,inverseJoinColumns= 
//			{
//					@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
//			})
	private List<Feedback> feedback=new ArrayList<>();
	
	@ManyToMany(mappedBy="customerResponse")
//	@JoinTable(name="customer_feedback"
//			,joinColumns=@JoinColumn(name="feedback_id")
//			,inverseJoinColumns= 
//			{
//					@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
//			})
	private List<Response> Response=new ArrayList<>();

	
	
	public Customer() 
	{
		super();
	}



	public Customer(String customer_mobile_no, String name, String email, String password, String gender, Date dob,
			WishList wishlist, Cart cart, List<SavedCardDetails> cardDetail, boolean active, List<Address> adresses,
			List<Feedback> feedback, List<Response> response) {
		super();
		this.customer_mobile_no = customer_mobile_no;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.wishlist = wishlist;
		this.cart = cart;
		this.cardDetail = cardDetail;
		this.active = active;
		this.adresses = adresses;
		this.feedback = feedback;
		Response = response;
	}



	public String getCustomer_mobile_no() {
		return customer_mobile_no;
	}



	public void setCustomer_mobile_no(String customer_mobile_no) {
		this.customer_mobile_no = customer_mobile_no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public WishList getWishlist() {
		return wishlist;
	}



	public void setWishlist(WishList wishlist) {
		this.wishlist = wishlist;
	}



	public Cart getCart() {
		return cart;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}



	public List<SavedCardDetails> getCardDetail() {
		return cardDetail;
	}



	public void setCardDetail(List<SavedCardDetails> cardDetail) {
		this.cardDetail = cardDetail;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public List<Address> getAdresses() {
		return adresses;
	}



	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}



	public List<Feedback> getFeedback() {
		return feedback;
	}



	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}



	public List<Response> getResponse() {
		return Response;
	}



	public void setResponse(List<Response> response) {
		Response = response;
	}



	@Override
	public String toString() {
		return "Customer [customer_mobile_no=" + customer_mobile_no + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", gender=" + gender + ", dob=" + dob + ", wishlist=" + wishlist
				+ ", cart=" + cart + ", cardDetail=" + cardDetail + ", active=" + active + ", adresses=" + adresses
				+ ", feedback=" + feedback + ", Response=" + Response + "]";
	}

	
	
}

