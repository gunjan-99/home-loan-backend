package com.homeloan.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.homeloan.dao.AdminDao;
import com.homeloan.exception.AdminServiceException;
import com.homeloan.model.Admin;

@Component
@Transactional
public class AdminService {

	@Autowired
	AdminDao adminDao= new AdminDao();

	public Admin login(Admin adminn) {
		try {
			int id=adminDao.isValidUser(adminn.getId(), adminn.getPassword());
			Admin admin= adminDao.fetchById(Admin.class, id);
			return admin;
		}catch(NoResultException e){
			throw new AdminServiceException("Invalid Email/ Password");
		}
	}
}
