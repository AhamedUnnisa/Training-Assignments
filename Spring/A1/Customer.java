package com.springcore;

public class Customer {
	private int customerid;
	private String customername;
	private int customerContact;
	private Address customerAddress;
	public Customer(int customerid, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerid=customerid;
		this.customername=customerName;
		this.customerContact=customerContact;
		this.customerAddress=customerAddress;
	}
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
	public Customer() {
		super();
	}
	
    public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	
	
	}


