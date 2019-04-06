package com.capgemini.capstore.bean;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class WishList 
{
	@Id
	@Column(name="wishlist_id")
	private String wishlist_id;
	@ManyToMany
	@JoinTable(name="wishlist_product",
				joinColumns=@JoinColumn(name="prod_id"),
				inverseJoinColumns=@JoinColumn(name="wishlist_id"))
	private List<Product> wishlist_prod=new ArrayList<>();
	
	public WishList()
	{
		super();
	}

	public WishList(String wishlist_id, List<Product> wishlist_prod) {
		super();
		this.wishlist_id = wishlist_id;
		this.wishlist_prod = wishlist_prod;
	}

	public String getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(String wishlist_id) {
		this.wishlist_id = wishlist_id;
	}

	public List<Product> getWishlist_prod() {
		return wishlist_prod;
	}

	public void setWishlist_prod(List<Product> wishlist_prod) {
		this.wishlist_prod = wishlist_prod;
	}

	@Override
	public String toString() {
		return "WishList [wishlist_id=" + wishlist_id + ", wishlist_prod=" + wishlist_prod + "]";
	}

	
	
}
