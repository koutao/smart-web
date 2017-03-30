package org.smart4j.chapter2.service;

import java.util.List;
import java.util.Map;

import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;


public class CustomerService {
	
	/**
	 * 获取用户列表
	 * @return
	 */
	public List<Customer> getCustomerList(){
		String sql = "SELECT * FROM customer";
		return DatabaseHelper.queryEntityList(Customer.class, sql);
	}
	
	/**
	 * 获取用户详情
	 * @param id
	 * @return
	 */
	public Customer getCustomer(long id){
		String sql = "SELECT * FROM customer WHERE id=?";
		return DatabaseHelper.queryEntity(Customer.class, sql, id);
	}
	
	/**
	 * 创建用户
	 * @param fieldMap
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> fieldMap){
		return DatabaseHelper.insertEntity(Customer.class, fieldMap);
	}
	
	/**
	 * 编辑用户
	 * @param id
	 * @param fieldMap
	 * @return
	 */
	public boolean updateCustomer(long id, Map<String, Object> fieldMap){
		return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public boolean deleteCustomer(long id){
		return DatabaseHelper.deleteEntity(Customer.class, id);
	}
}
