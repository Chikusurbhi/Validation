package com.capgemini.capstore;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.capstore.repository.IUserDAO;


@Controller
@RequestMapping("controller")
public class ValidationController {
	

@Autowired
IUserDAO daoRef;

	@RequestMapping(method = RequestMethod.GET,value="login")
	public String login(ModelMap modelMap ,/* HttpSession session,*/HttpServletRequest request) {
	
		return "cart/login";
	}
	@RequestMapping(method = RequestMethod.POST,value="validateUser")
	public String validate(@RequestParam(value="mobileNo") String mobileNo,@RequestParam(value="password") String password) {
		
		System.out.println(mobileNo);
		System.out.println(password);
		String destination=daoRef.validateUser(mobileNo, password);
		System.out.println(destination);
		return "cart/"+destination;
	}
	
}
