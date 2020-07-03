package com.asiainfo.entity;

public class Product {
	private Long pid;
	private String productName;
	private String dbSource;

	public Product() {
		super();
	}

	public Product(String productName) {
		super();
		this.productName = productName;
	}

	public Product(Long pid, String productName, String dbSource) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.dbSource = dbSource;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDbSource() {
		return dbSource;
	}

	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", dbSource=" + dbSource + "]";
	}

}
