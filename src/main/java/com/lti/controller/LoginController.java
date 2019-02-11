package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.RegistrationEntity;
import com.lti.service.LoginService;


@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(path= "/login/verify", method=RequestMethod.POST)
	public void verify(@RequestBody RegistrationEntity registrationEntity) {
		boolean flag=loginService.confirmLogin(registrationEntity);
		String flag1=Boolean.toString(flag);
		if(flag1.equals("true")) {
			System.out.println("User is valid");
		}
		else
			System.out.println("User is invalid");
		
	}
	}



