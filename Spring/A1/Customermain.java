package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Customermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
        System.out.println("by using springcontainer");
        Customer c=(Customer)context.getBean("customer1");
        System.out.println(c);
    }
}

	
