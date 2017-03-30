package org.smart4j.chapter2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{

	private static final long serialVersionUID = 469548448923747459L;
	private CustomerService customerService;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		customerService = new CustomerService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Customer> customerList = customerService.getCustomerList();
		req.setAttribute("customerList", customerList);
		req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
	}
}
