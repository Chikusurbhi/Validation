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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="response")
public class Response
{
	@Id
	@Column(name="response_id",length=10)
	private String response_id;
	@Column(name="description")
	private String description;
	@Column(name="rating")
	private double rating;
	
	@ManyToMany
	@JoinTable(name="merchant_response"
			,joinColumns=@JoinColumn(name="response_id")
			,inverseJoinColumns= {
					@JoinColumn(name="merchant_id",referencedColumnName="merchant_mobile_no")
					}
			)
	private List<Merchant> merchantResponse;

	@ManyToMany
	@JoinTable(name="merchant_response"
			,joinColumns=@JoinColumn(name="response_id")
			,inverseJoinColumns= 
			{
					@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
			})
	private List<Customer> customerResponse=new ArrayList<>();

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(String response_id, String description, double rating, List<Merchant> merchantResponse,
			List<Customer> customerResponse) {
		super();
		this.response_id = response_id;
		this.description = description;
		this.rating = rating;
		this.merchantResponse = merchantResponse;
		this.customerResponse = customerResponse;
	}

	public String getResponse_id() {
		return response_id;
	}

	public void setResponse_id(String response_id) {
		this.response_id = response_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Merchant> getMerchantResponse() {
		return merchantResponse;
	}

	public void setMerchantResponse(List<Merchant> merchantResponse) {
		this.merchantResponse = merchantResponse;
	}

	public List<Customer> getCustomerResponse() {
		return customerResponse;
	}

	public void setCustomerResponse(List<Customer> customerResponse) {
		this.customerResponse = customerResponse;
	}

	@Override
	public String toString() {
		return "Response [response_id=" + response_id + ", description=" + description + ", rating=" + rating
				+ ", merchantResponse=" + merchantResponse + ", customerResponse=" + customerResponse + "]";
	}

}
