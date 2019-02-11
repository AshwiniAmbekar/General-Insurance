package com.lti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.BuyInsuranceEntity;
import com.lti.service.BuyInsuranceService;

@RestController
public class BuyInsuranceController {

	@Autowired(required = true)
	private BuyInsuranceService buyInsuranceService;

	@RequestMapping(path = "/buyInsuranceEntity/add", method = RequestMethod.POST)
	public String addIntoService(@RequestBody BuyInsuranceEntity buyInsurance) {
		buyInsuranceService.add(buyInsurance);
		return "Details filled successfully";
	}

	/*@RequestMapping(path = "/buyInsuranceEntity/all", method = RequestMethod.GET)
	public List<BuyInsuranceEntity> fetchAllFromService() {
		return buyInsuranceService.fetchAll();
	}*/
}
