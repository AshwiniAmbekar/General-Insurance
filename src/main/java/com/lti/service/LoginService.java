package com.lti.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.RegistrationRepository;

@Service
public class LoginService {
	
	//Asking spring to create an object for me
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Transactional
	public List<RegistrationEntity> fetchAll() {
		return registrationRepository.fetchAll();
	}
	
	@Transactional
	public boolean confirmLogin(RegistrationEntity registrationEntity) {
		String email=registrationEntity.getEmailid();
		String password=registrationEntity.getPassword();
		
		List<RegistrationEntity> userList = registrationRepository.fetchAll();
		
		for(RegistrationEntity re:userList) {
			if(email.equals(re.getEmailid())) {
				if(password.equals(re.getPassword())) {
					boolean flag=true;
					return flag;
				}
			}
		}
		return false;
	}
}
