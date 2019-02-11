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
import com.lti.repository.RegistrationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class RegistrationTest {
	
@Autowired
		private RegistrationRepository registrationRepository;
		
		@Test
		@Transactional
		public void registerUser() {
		    RegistrationEntity register = new RegistrationEntity();
			register.setFirstName("Anvesha");
			register.setLastName("Shrivastava");
			register.setEmailid("anvesha4here@gmail.com");
			register.setPassword("anvesha@123");
			registrationRepository.insert(register);
		}

		@Test
		@Transactional
		public void fetchAllUser() {
		    RegistrationEntity register1 = new RegistrationEntity();
			register1.getFirstName();
			register1.getLastName();
			register1.getEmailid();
			register1.getPassword();
			registrationRepository.fetchAll();	
		}
		
		@Test
		@Transactional
		public void loginUser() {
		    RegistrationEntity login = new RegistrationEntity();
			login.getEmailid();
			login.getPassword();
			registrationRepository.fetchAll();	
		}
	}
	
	
	
	
	
	
	
	
	


