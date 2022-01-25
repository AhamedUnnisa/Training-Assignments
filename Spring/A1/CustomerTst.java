package com.springcore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTst {
	private Address Address;
	Customer cust=new Customer(5,"joe",1234,Address);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCustomerAddress() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerid() {
		int expected=5;
		int actual=cust.getCustomerid();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCustomername() {
		String expected="joe";
		String actual=cust.getCustomername();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerContact() {
		int expected=1234;
		int actual=cust.getCustomerContact();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

}
