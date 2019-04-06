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
@Table(name="images")
public class Image 
{
	@Id
	@Column(name="image_id")
	private String image_id;
	@Column(name="url")
	private String url;
	
	@ManyToMany(mappedBy="prod_images")
//	@JoinTable(name="prod_images",
//			joinColumns=@JoinColumn(name="image_id"),
//			inverseJoinColumns=@JoinColumn(name="prod_id")
//			)
	private List<Product> productImg;
	
	public Image()
	{
		super();
	}

	public Image(String image_id, String url, List<Product> productImg) {
		super();
		this.image_id = image_id;
		this.url = url;
		this.productImg = productImg;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Product> getProductImg() {
		return productImg;
	}

	public void setProductImg(List<Product> productImg) {
		this.productImg = productImg;
	}

	@Override
	public String toString() {
		return "Image [image_id=" + image_id + ", url=" + url + ", productImg=" + productImg + "]";
	}

	
}
