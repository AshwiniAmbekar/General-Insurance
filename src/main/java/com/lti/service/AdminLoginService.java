package com.lti.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.AdminEntity;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.GenericRepository;
@Service
public class AdminLoginService {
        
	    //Asking spring to create an object for me
		@Autowired
		private GenericRepository registrationRepository;
		
		@Transactional
		public List<AdminEntity> fetchAll() {
			return registrationRepository.fetchAll(AdminEntity.class);
		}
		
		@Transactional
		public boolean confirmAdminLogin(AdminEntity adminEntity) {
			String email=adminEntity.getUserName();
			String password=adminEntity.getPassword();
			List<AdminEntity> userList = registrationRepository.fetchAll(AdminEntity.class);
			
			//verifying the credentials
			for(AdminEntity re:userList) {
				if(email.equals(re.getUserName())) {
					if(password.equals(re.getPassword())) {
						boolean flag=true;
						return flag;
					}
				}
			}
			return false;
			}
		}


