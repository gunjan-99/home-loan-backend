package com.homeloan.dao;
/*
 * @author: Gunjan Vora
 * 
 */
import org.springframework.stereotype.Component;

@Component
public class CustomerDao extends GenericDao {
	
// if there is no customer with the given combination, this version will throw an exception.
	public int isValidUser(String email, String password) {
		return (Integer) entityManager
				.createQuery("select c.id from Customer c where c.email=: em and c.password =: pw")
				.setParameter("em", email).setParameter("pw", password).getSingleResult();

	}
}
