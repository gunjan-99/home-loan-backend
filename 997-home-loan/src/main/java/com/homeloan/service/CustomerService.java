package com.homeloan.service;
/*
 * @author: Gunjan Vora
 * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.homeloan.dao.CustomerDao;
import com.homeloan.model.Customer;


@Component
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public int register ( Customer customer) {
			Customer updatedCustomer= (Customer)customerDao.save(customer);
			return updatedCustomer.getId();
	}
	

}
