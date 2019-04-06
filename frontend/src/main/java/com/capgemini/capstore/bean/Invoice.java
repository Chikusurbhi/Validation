package com.capgemini.capstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice
{
	@Id
	@Column(name="invoice_id")
	private String invoice_id;
	@Column(name="payment_options")
	private String payment_options;
	@Column(name="transaction_id")
	private long transaction_id;
	
	public Invoice() 
	{
		super();
	}

	public Invoice(String invoice_id, String payment_options, long transaction_id) {
		super();
		this.invoice_id = invoice_id;
		this.payment_options = payment_options;
		this.transaction_id = transaction_id;
	}

	public String getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getPayment_options() {
		return payment_options;
	}

	public void setPayment_options(String payment_options) {
		this.payment_options = payment_options;
	}

	public long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

	@Override
	public String toString() {
		return "Invoice [invoice_id=" + invoice_id + ", payment_options=" + payment_options + ", transaction_id="
				+ transaction_id + "]";
	}

	
}
