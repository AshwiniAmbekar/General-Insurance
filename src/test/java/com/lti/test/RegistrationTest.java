package com.lti.test;

import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.GenericRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class RegistrationTest {
	
		@Autowired(required=true)
		private GenericRepository registrationRepository;
		
		@Test
		@Transactional
		public void registerUser() {
			RegistrationEntity register=new RegistrationEntity();
			register.setUserName("fgsdf");
			register.setFirstName("barakobama");
			register.setLastName("obama");
			register.setGender("");
			register.setMobile(454L);
			register.setEmail("obama@gmail.com");
			register.setPassword("obama@19");
			register.setConfirmPassword("erfersdf");
			register.setAddress("ertew");
			register.setCity("erff");
			registrationRepository.insert(register);
		}

		@Test
		@Transactional
		public void fetchAllUser() {
			RegistrationEntity register1=new RegistrationEntity();
			register1.getUserName();
			register1.getFirstName();
			register1.getLastName();
			register1.getGender();
			register1.getMobile();
			register1.getEmail();
			register1.getPassword();
			register1.getConfirmPassword();
			register1.getAddress();
			register1.getCity();
			registrationRepository.fetchAll(RegistrationEntity.class);	
		}
		
	}
	
	
	
	
	
	
	
	
	


