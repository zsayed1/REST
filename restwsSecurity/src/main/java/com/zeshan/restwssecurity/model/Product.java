package com.zeshan.restwssecurity.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prod")
public class Product {
	
	private int productid;
	private String productName;
	private float weight;
	private String type;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
}
