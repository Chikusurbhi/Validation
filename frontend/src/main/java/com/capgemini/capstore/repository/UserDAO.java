package com.capgemini.capstore.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.capstore.bean.Admin;
import com.capgemini.capstore.bean.Customer;
import com.capgemini.capstore.bean.Merchant;


@Repository
@Transactional
public class UserDAO implements IUserDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String validateUser(String email,String password) {
		// TODO Auto-generated method stub
		System.out.println(email);
		System.out.println(password);
		Merchant m=entityManager.find(Merchant.class, email);
		if(m!=null && m.getPassword().equals(password))
		{
			return "merchantpage";
		}
		
			Customer c=entityManager.find(Customer.class, email);
			if(c!=null && c.getPassword().equals(password))
			{
				return "customerpage";
			}
			
			Admin a=entityManager.find(Admin.class,email);
			if(a!=null && a.getPassword().equals(password))
			{
				return "adminpage";
			}
		return "login";	
	}
	
	

}
