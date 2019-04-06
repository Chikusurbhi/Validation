package com.capgemini.capstore.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="merchant")
public class Merchant 
{
	@Id
	@Column(name="merchant_mobile_no")
	private String merchant_mobile_no;
	@Column(name="merchant_name",length=50)
	private String merchant_name;
	@Column(name="email",length=70)
	private String email;
	@Column(name="password",length=20)
	private String password;
	@Column(name="merchant_type",length=50)
	private String merchant_type;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="merchantAddress")
	private List<Address> addresses=new ArrayList<>();
	
	@ManyToMany(mappedBy="merchantFeedback")
//	@JoinTable(name="merchant_feedback"
//			,joinColumns=@JoinColumn(name="feedback_id")
//			,inverseJoinColumns= 
//			{
//					@JoinColumn(name="merchant_id",referencedColumnName="merchant_mobile_no")
//					,@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
//			}
//			)
	private List<Feedback> feedback=new ArrayList<>();
	
	@ManyToMany(mappedBy="merchantResponse")
//	@JoinTable(name="merchant_response"
//			,joinColumns=@JoinColumn(name="response_id")
//			,inverseJoinColumns= 
//			{
//					@JoinColumn(name="merchant_id",referencedColumnName="merchant_mobile_no")
//					,@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
//			}
//			)
	private List<Response> response=new ArrayList<>();
	
	@ManyToMany(mappedBy="merchant_product")
//	@JoinTable(name="merchant_product"
//					,joinColumns=@JoinColumn(name="merchant_id")
//					,inverseJoinColumns= {@JoinColumn(name="prod_id")}
//			  )
	private List<Product> products = new ArrayList<>();
 	
	public Merchant() 
	{
		super();
	}

	public Merchant(String merchant_mobile_no, String merchant_name, String email, String password,
			String merchant_type, List<Address> addresses, List<Feedback> feedback, List<Response> response,
			List<Product> products) {
		super();
		this.merchant_mobile_no = merchant_mobile_no;
		this.merchant_name = merchant_name;
		this.email = email;
		this.password = password;
		this.merchant_type = merchant_type;
		this.addresses = addresses;
		this.feedback = feedback;
		this.response = response;
		this.products = products;
	}

	public String getMerchant_mobile_no() {
		return merchant_mobile_no;
	}

	public void setMerchant_mobile_no(String merchant_mobile_no) {
		this.merchant_mobile_no = merchant_mobile_no;
	}

	public String getMerchant_name() {
		return merchant_name;
	}

	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
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

	public String getMerchant_type() {
		return merchant_type;
	}

	public void setMerchant_type(String merchant_type) {
		this.merchant_type = merchant_type;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Merchant [merchant_mobile_no=" + merchant_mobile_no + ", merchant_name=" + merchant_name + ", email="
				+ email + ", password=" + password + ", merchant_type=" + merchant_type + ", addresses=" + addresses
				+ ", feedback=" + feedback + ", response=" + response + ", products=" + products + "]";
	}

	
}
