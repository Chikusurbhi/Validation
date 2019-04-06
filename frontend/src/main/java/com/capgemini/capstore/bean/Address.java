package com.capgemini.capstore.bean;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	@Id
	@Column(name="adress_id",length=10)
	private String address_id;
	@Column(name="houseNo",length=10)
	private String houseNo;
	@Column(name="area",length=20)
	private String area;
	@Column(name="city",length=20)
	private String city;
	@Column(name="pincode",length=6)
	private String pincode;
	@Column(name="states",length=30)
	private String states;
	@Column(name="landmark",length=50)
	private String landmark;
	@Column(name="name",length=50)
	private String name;
	@Column(name="alternate_mobile",length=10)
	private String alternate_mobile_no;
	@Column(name="address_type",length=10)
	private String address_type;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customerAddress;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="merchant_id")
	private Merchant merchantAddress;
	
	public Address()
	{
		super();
	}

	public Address(String address_id, String houseNo, String area, String city, String pincode, String states,
			String landmark, String name, String alternate_mobile_no, String address_type, Customer customer_id,
			Merchant merchant_id) {
		super();
		this.address_id = address_id;
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.states = states;
		this.landmark = landmark;
		this.name = name;
		this.alternate_mobile_no = alternate_mobile_no;
		this.address_type = address_type;
		this.customerAddress = customer_id;
		this.merchantAddress = merchant_id;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternate_mobile_no() {
		return alternate_mobile_no;
	}

	public void setAlternate_mobile_no(String alternate_mobile_no) {
		this.alternate_mobile_no = alternate_mobile_no;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public Customer getCustomer_id() {
		return customerAddress;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customerAddress = customer_id;
	}

	public Merchant getMerchant_id() {
		return merchantAddress;
	}

	public void setMerchant_id(Merchant merchant_id) {
		this.merchantAddress= merchant_id;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", houseNo=" + houseNo + ", area=" + area + ", city=" + city
				+ ", pincode=" + pincode + ", states=" + states + ", landmark=" + landmark + ", name=" + name
				+ ", alternate_mobile_no=" + alternate_mobile_no + ", address_type=" + address_type + ", customer_id="
				+ customerAddress + ", merchant_id=" + merchantAddress+ "]";
	}

	
	
}
