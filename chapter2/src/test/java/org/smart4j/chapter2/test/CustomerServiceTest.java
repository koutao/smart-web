package org.smart4j.chapter2.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CustomerServiceTest {

	public final CustomerService customerService;
	
	public CustomerServiceTest(){
		this.customerService = new CustomerService();
	}
	
	@Before
	public void init() throws Exception{
		String file = "sql/customer_init.sql";
		DatabaseHelper.executeSqlFile(file);
	}
	
	@Test
	public void getCustomerTest(){
		long id=1;
		Customer customer = customerService.getCustomer(id);
		Assert.assertNotNull(customer);
	}
	
	@Test
	public void getCustomerListTest(){
		List<Customer> customers = customerService.getCustomerList();
		Assert.assertEquals(2, customers.size());
	}
	
	@Test
	public void createCustomerTest(){
		Map<String, Object> fieldMap = new HashMap<String, Object>();
		fieldMap.put("name", "customer100");
		fieldMap.put("contact", "John");
		fieldMap.put("telephone", "13512345678");
		boolean result = customerService.createCustomer(fieldMap);
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void updateCustomerTest(){
		long id = 1;
		Map<String, Object> fieldMap = new HashMap<String, Object>();
		fieldMap.put("contact", "Eric");
		boolean result = customerService.updateCustomer(id, fieldMap);
		Assert.assertTrue(result);
	}
	
	@Test
	public void deleteCustomerTest(){
		long id = 1;
		boolean result = customerService.deleteCustomer(id);
		Assert.assertTrue(result);
	}
}
