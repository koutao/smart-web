package org.smart4j.chapter2.test;

import org.junit.Before;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import junit.framework.Assert;

public class CustomerServiceTest {

	public final CustomerService customerService;
	
	public CustomerServiceTest(){
		this.customerService = new CustomerService();
	}
	
	@Before
	public void init(){
		// TODO 初始化数据库
	}
	
	public void getCustomerTest(){
		long id=1;
		Customer customer = customerService.getCustomer(id);
		Assert.assertNotNull(customer);
	}
}
