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
@Table(name="feedback")
public class Feedback
{
	@Id
	@Column(name="feedback_id",length=10)
	private String feedback_id;
	@Column(name="description")
	private String description;
	@Column(name="rating")
	private double rating;
	
	@ManyToMany
	@JoinTable(name="merchant_feedback"
			,joinColumns=@JoinColumn(name="feedback_id")
			,inverseJoinColumns= {
					@JoinColumn(name="merchant_id",referencedColumnName="merchant_mobile_no")
					}
			)
	private List<Merchant> merchantFeedback=new ArrayList<>(); 
	@ManyToMany
	@JoinTable(name="merchant_feedback"
			,joinColumns=@JoinColumn(name="feedback_id")
			,inverseJoinColumns= 
			{
					@JoinColumn(name="customer_id",referencedColumnName="customer_mobile_no")
			})
	private List<Customer> customerFeedback=new ArrayList<>();
	@ManyToMany
	@JoinTable(name="product_feedback"
			,joinColumns=@JoinColumn(name="feedback_id")
			,inverseJoinColumns= @JoinColumn(name="prod_id")
			)
	private List<Product> prod_feedback=new ArrayList<>(); 

	public Feedback() 
	{
		super();
	}

	public Feedback(String feedback_id, String description, double rating, List<Merchant> merchantFeedback,
			List<Customer> customerFeedback, List<Product> prod_feedback) {
		super();
		this.feedback_id = feedback_id;
		this.description = description;
		this.rating = rating;
		this.merchantFeedback = merchantFeedback;
		this.customerFeedback = customerFeedback;
		this.prod_feedback = prod_feedback;
	}

	public String getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(String feedback_id) {
		this.feedback_id = feedback_id;
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

	public List<Merchant> getMerchantFeedback() {
		return merchantFeedback;
	}

	public void setMerchantFeedback(List<Merchant> merchantFeedback) {
		this.merchantFeedback = merchantFeedback;
	}

	public List<Customer> getCustomerFeedback() {
		return customerFeedback;
	}

	public void setCustomerFeedback(List<Customer> customerFeedback) {
		this.customerFeedback = customerFeedback;
	}

	public List<Product> getProd_feedback() {
		return prod_feedback;
	}

	public void setProd_feedback(List<Product> prod_feedback) {
		this.prod_feedback = prod_feedback;
	}

	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", description=" + description + ", rating=" + rating
				+ ", merchantFeedback=" + merchantFeedback + ", customerFeedback=" + customerFeedback
				+ ", prod_feedback=" + prod_feedback + "]";
	}

}
