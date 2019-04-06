package com.capgemini.capstore.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capstore_admin")
public class Admin
{
	@Id
	@Column(name="mobile_no",length=10)
	private String mobile_no;
	@Column(name="name",length=50)
	private String name;
	@Column(name="password",length=20)
	private String password;
	@Column(name="email",length=70)
	private String email;
	
	
	public Admin()
	{
		super();
	}

	public Admin(String mobileNo, String name, String email, String password) 
	{
		super();
		this.mobile_no = mobileNo;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getMobileNo() {
		return mobile_no;
	}

	public void setMobileNo(String mobileNo) {
		this.mobile_no = mobileNo;
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

	@Override
	public String toString() {
		return "Admin [mobileNo=" + mobile_no + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
