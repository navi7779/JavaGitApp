package com.lti.junitdemo;

public class Product {

	private int prdId;
	private String prdName;
	private String brandName = "LTI Infotech";
	
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
	
		
	}
	
	
	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public Product() {
		super();
	}
	
	public int getPrdId() {
		return prdId;
	}
	
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	
	public String getPrdName() {
		return prdName;
	}
	
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}


	
	
}