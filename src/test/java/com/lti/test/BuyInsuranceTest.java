package com.lti.test;
import java.util.Date;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import com.lti.entity.BuyInsuranceEntity;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.GenericRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BuyInsuranceTest {
	
		@Autowired(required=true)
		private GenericRepository registrationRepository;
		
		@Test
		@Transactional
		public void buyInsurance() {
			BuyInsuranceEntity buy=new BuyInsuranceEntity();
			buy.setPlanType(3);
			buy.setDateAndTime(new Date());
			buy.setRegistrationNumber(45345L);
			buy.setVehicleType("Farrari");
			buy.setVehicleModel("Farrari234");
			buy.setDrivingLicence(3453L);
			buy.setEngineNumber(345);
			registrationRepository.insert(buy);
		}

		@Test
		@Transactional
		public void fetchAllUser() {
			RegistrationEntity register1=new RegistrationEntity();
			register1.getFirstName();
			register1.getLastName();
			register1.getEmail();
			register1.getPassword();
			registrationRepository.fetchAll(RegistrationEntity.class);	
		}
}

		
	/*	@Test
		@Transactional
		public void loginUser() {
			
			boolean flag=false;
			String email="ashwini@19";
			String password="ash";
			
			List<RegistrationEntity> userList = registrationRepository.fetchAll();
			
			for(RegistrationEntity re:userList) {
				if(email.equals(re.getEmailid())) {
					if(password.equals(re.getPassword())) {
						flag= true;
					}
				}	
			}
			String flag1=Boolean.toString(flag);
			if(flag1.equals("true")) {
				System.out.println("User is valid");
			}
			else
				System.out.println("User is invalid");
		}
	}*/
	
	
	
	
	
	
	
	
	


