package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lti.entity.LoginDTO;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.RegistrationRepository;


@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Transactional
	public void add(RegistrationEntity registration) {
		registrationRepository.insert(registration);
	}
	
	@Transactional
	public List<RegistrationEntity> fetchAll() {
		return registrationRepository.fetchAll();
	}
	@Transactional
	public void giveAccess(LoginDTO login ) {
		
		
	}
	
}
