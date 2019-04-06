package com.capgemini.capstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "savedcard")
public class SavedCardDetails 
{
	@Id
	@Column(name="sno")
	private String sno;
	@Column(name="card_holder_name",length=50)
	private String cardHolderName;
	@Column(name="cardno",length=16)
	private String CardNumber;
	@Column(name="expirymonth",length=2)
	private  int expirymonth;
	@Column(name="expiry_year",length=4)
	private int expiry_year;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer_card;
	
	public SavedCardDetails() 
	{
		super();
	}

	public SavedCardDetails(String sno, String cardHolderName, String cardNumber, int expirymonth, int expiry_year,
			Customer customer_card) {
		super();
		this.sno = sno;
		this.cardHolderName = cardHolderName;
		CardNumber = cardNumber;
		this.expirymonth = expirymonth;
		this.expiry_year = expiry_year;
		this.customer_card = customer_card;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public int getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(int expirymonth) {
		this.expirymonth = expirymonth;
	}

	public int getExpiry_year() {
		return expiry_year;
	}

	public void setExpiry_year(int expiry_year) {
		this.expiry_year = expiry_year;
	}

	public Customer getCustomer_card() {
		return customer_card;
	}

	public void setCustomer_card(Customer customer_card) {
		this.customer_card = customer_card;
	}

	@Override
	public String toString() {
		return "SavedCardDetails [sno=" + sno + ", cardHolderName=" + cardHolderName + ", CardNumber=" + CardNumber
				+ ", expirymonth=" + expirymonth + ", expiry_year=" + expiry_year + ", customer_card=" + customer_card
				+ "]";
	}

	
}
