package com.capgemini.capstore.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product
{
	@Id
	@Column(name="prod_id",length=10)
	private String prod_id;
	@Column(name="name",length=70)
	private String name;
	@Column(name="sizes",length=5)
	private String sizes;
	@Column(name="inital_quantity",length=5)	
	private int initial_quantity;
	@Column(name="available_quantity",length=5)	
	private int available_quantity;
	@Column(name="price",length=6)
	private double price;
	@Column(name="rating",length=5)
	private double rating;
	@Column(name="prodCategory",length=50)
	private String prodCategory;
	@Column(name="discount",length=5)
	private double prodDiscount;
	
	@ManyToMany(mappedBy="prod_coupon")
//	@JoinTable(name="product_coupon",
//				joinColumns=@JoinColumn(name="prod_id")
//				,inverseJoinColumns=@JoinColumn(name="coupon_id"))
	private List<Coupon> prodCoupon;
	
	
	
	@ManyToMany
	@JoinTable(name="merchant_product",joinColumns=@JoinColumn(name="merchant_id"),
				inverseJoinColumns=@JoinColumn(name="prod_id"))
	private List<Merchant> merchant_product;
	
	
	@ManyToMany
	@JoinTable(name="prod_images",joinColumns=@JoinColumn(name="prod_id"),
			inverseJoinColumns=@JoinColumn(name="image_id"))
	private List<Image> prod_images;

	
	@ManyToMany(mappedBy="prod_feedback")
//	@JoinTable(name="product_feedback"
//			,joinColumns=@JoinColumn(name="prod_id")
//			,inverseJoinColumns= @JoinColumn(name="feedback_id")
//			)
	private List<Feedback> prodFeedback;
	
	@ManyToMany(mappedBy="wishlist_prod")
//	@JoinTable(name="wishlist_product",
//				joinColumns=@JoinColumn(name="prod_id"),
//				inverseJoinColumns=@JoinColumn(name="wishlist_id"))
	private List<WishList> wishlist;
	
	@ManyToMany(mappedBy="orders_product")
//	@JoinTable(name="orders_product",
//				joinColumns=@JoinColumn(name="order_id"),
//				inverseJoinColumns=@JoinColumn(name="prod_id"))
	private List<Orders> ordersProduct;
	
	@ManyToMany
	@JoinTable(name="cart_product",
				joinColumns=@JoinColumn(name="cart_id"),
				inverseJoinColumns=@JoinColumn(name="prod_id"))
	private List<Cart> cart_product;

	@ManyToMany(mappedBy="prod_images")
//	@JoinTable(name="prod_images",
//			joinColumns=@JoinColumn(name="image_id"),
//			inverseJoinColumns=@JoinColumn(name="prod_id")
//			)
	private List<Product> productImg;
	
	public Product() 
	{
		super();
	}

	public Product(String prod_id, String name, String sizes, int initial_quantity, int available_quantity,
			double price, double rating, String prodCategory, double prodDiscount, List<Coupon> prodCoupon,
			List<Merchant> merchant_product, List<Image> prod_images, List<Feedback> prodFeedback,
			List<WishList> wishlist, List<Orders> ordersProduct, List<Cart> cart_product, List<Product> productImg) {
		super();
		this.prod_id = prod_id;
		this.name = name;
		this.sizes = sizes;
		this.initial_quantity = initial_quantity;
		this.available_quantity = available_quantity;
		this.price = price;
		this.rating = rating;
		this.prodCategory = prodCategory;
		this.prodDiscount = prodDiscount;
		this.prodCoupon = prodCoupon;
		this.merchant_product = merchant_product;
		this.prod_images = prod_images;
		this.prodFeedback = prodFeedback;
		this.wishlist = wishlist;
		this.ordersProduct = ordersProduct;
		this.cart_product = cart_product;
		this.productImg = productImg;
	}

	public String getProd_id() {
		return prod_id;
	}

	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public int getInitial_quantity() {
		return initial_quantity;
	}

	public void setInitial_quantity(int initial_quantity) {
		this.initial_quantity = initial_quantity;
	}

	public int getAvailable_quantity() {
		return available_quantity;
	}

	public void setAvailable_quantity(int available_quantity) {
		this.available_quantity = available_quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public double getProdDiscount() {
		return prodDiscount;
	}

	public void setProdDiscount(double prodDiscount) {
		this.prodDiscount = prodDiscount;
	}

	public List<Coupon> getProdCoupon() {
		return prodCoupon;
	}

	public void setProdCoupon(List<Coupon> prodCoupon) {
		this.prodCoupon = prodCoupon;
	}

	public List<Merchant> getMerchant_product() {
		return merchant_product;
	}

	public void setMerchant_product(List<Merchant> merchant_product) {
		this.merchant_product = merchant_product;
	}

	public List<Image> getProd_images() {
		return prod_images;
	}

	public void setProd_images(List<Image> prod_images) {
		this.prod_images = prod_images;
	}

	public List<Feedback> getProdFeedback() {
		return prodFeedback;
	}

	public void setProdFeedback(List<Feedback> prodFeedback) {
		this.prodFeedback = prodFeedback;
	}

	public List<WishList> getWishlist() {
		return wishlist;
	}

	public void setWishlist(List<WishList> wishlist) {
		this.wishlist = wishlist;
	}

	public List<Orders> getOrdersProduct() {
		return ordersProduct;
	}

	public void setOrdersProduct(List<Orders> ordersProduct) {
		this.ordersProduct = ordersProduct;
	}

	public List<Cart> getCart_product() {
		return cart_product;
	}

	public void setCart_product(List<Cart> cart_product) {
		this.cart_product = cart_product;
	}

	public List<Product> getProductImg() {
		return productImg;
	}

	public void setProductImg(List<Product> productImg) {
		this.productImg = productImg;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", name=" + name + ", sizes=" + sizes + ", initial_quantity="
				+ initial_quantity + ", available_quantity=" + available_quantity + ", price=" + price + ", rating="
				+ rating + ", prodCategory=" + prodCategory + ", prodDiscount=" + prodDiscount + ", prodCoupon="
				+ prodCoupon + ", merchant_product=" + merchant_product + ", prod_images=" + prod_images
				+ ", prodFeedback=" + prodFeedback + ", wishlist=" + wishlist + ", ordersProduct=" + ordersProduct
				+ ", cart_product=" + cart_product + ", productImg=" + productImg + "]";
	}

	
}
