package com.lti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.RegistrationEntity;
import com.lti.service.RegistrationService;


@RestController
public class RegistrationController {
	
@Autowired(required=true)
private RegistrationService registrationService;

@RequestMapping(path= "/registrationentity/add", method=RequestMethod.POST)
public String addIntoService(@RequestBody RegistrationEntity registration) {
	registrationService.add(registration);
	return "Registration done successfully";
}

@RequestMapping(path= "/registrationentity/all", method=RequestMethod.GET)
public List<RegistrationEntity> fetchAllFromService( ) {
	return registrationService.fetchAll();
}
	
}
