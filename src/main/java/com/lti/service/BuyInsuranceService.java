package com.lti.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.BuyInsuranceEntity;
import com.lti.repository.GenericRepository;

@Service
public class BuyInsuranceService {

	@Autowired
	private GenericRepository genericRepository;
	
    @Transactional
	public void add(BuyInsuranceEntity buyInsurance) {
		genericRepository.insert(buyInsurance);	
	}

	public List<BuyInsuranceEntity> fetchAll() {
		return genericRepository.fetchAll(BuyInsuranceEntity.class);
	}
}
