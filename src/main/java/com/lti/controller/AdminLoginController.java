package com.lti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.AdminEntity;
import com.lti.entity.RegistrationEntity;
import com.lti.service.AdminLoginService;

import com.lti.service.LoginService;
@CrossOrigin
@RestController
public class AdminLoginController {
        @Autowired
		private AdminLoginService adminLoginService;
		@RequestMapping(path= "/adminlogin/verify", method=RequestMethod.POST)
		public void verify(@RequestBody AdminEntity adminEntity) {
			boolean flag=adminLoginService.confirmAdminLogin(adminEntity);
			String flag1=Boolean.toString(flag);
			if(flag1.equals("true")) {
				System.out.println("Admin access permitted");
			}
			else
				System.out.println("Admin access not permitted");
			
		}
}
	
	
	
	
	
	
	


