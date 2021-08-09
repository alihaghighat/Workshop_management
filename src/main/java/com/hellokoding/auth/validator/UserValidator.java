package com.hellokoding.auth.validator;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hellokoding.auth.entity.ContactPoint;
import com.hellokoding.auth.entity.User;

import com.hellokoding.auth.repository.ContactPointRepository;
import com.hellokoding.auth.service.UserService;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;
    
    @Autowired
    ContactPointRepository contactPointRepository;
    
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsername()== null || user.getUsername().length() < 6 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        

        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }
        
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsEmail", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsPhoneNumber", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsAddress", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsFatherPhoneNumber", "NotEmpty");
        
        
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthDate", "NotEmpty");
        

      List<ContactPoint> contactPoints = contactPointRepository.findAll();

      int counter = 1;
      for (ContactPoint contactPoint : contactPoints ) {
    	  

      	if ( user.getContactPointsEmail() != null && user.getContactPoints() != null && contactPoint.getContactData() != null && user.getContactPointsEmail().equals(contactPoint.getContactData()) ){
      		
      		
      			counter++;
      	}
			
      }
      
     
      if ( counter > 1 ) {
    	  errors.rejectValue("ContactPointsEmail", "emailExist");
      }

        
        String birth = user.getBirthDate();
        if ( birth != null ) {
        	
	        Calendar nowCalendar = Calendar.getInstance();
	        int bc = Integer.parseInt(birth.substring(0, 4));
	        int nc = nowCalendar.get(Calendar.YEAR);
	        if ( bc >= nc  || nc - bc < 6  ) {
	        	
	        	
	       
	        	errors.rejectValue("birthDate", "invDate");
	        }
        }
        
        
        

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword() == null || user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (user.getPasswordConfirm() == null || !(user.getPasswordConfirm().equals(user.getPassword()))) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
    
    
    public void editValidate(User user, Errors errors) {
         

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsername()== null || user.getUsername().length() < 6 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        
        User checkUser = userService.findByUsername(user.getUsername());
        
        if (   checkUser != null  && user != null && checkUser.getContactPointsEmail() != null && !checkUser.getContactPointsEmail().equals(user.getContactPointsEmail()) ) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }
        
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsEmail", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsPhoneNumber", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsAddress", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ContactPointsFatherPhoneNumber", "NotEmpty");
        
        
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthDate", "NotEmpty");
        

      List<ContactPoint> contactPoints = contactPointRepository.findAll();
		
      int counter = 1;
      for (ContactPoint contactPoint : contactPoints ) {
    	  

      	if ( user.getContactPointsEmail() != null && user.getContactPoints() != null && contactPoint.getContactData() != null && user.getContactPointsEmail().equals(contactPoint.getContactData()) ){
      		
      		if(user.getContactPointsEmail() instanceof String && contactPointRepository.findByContactData(user.getContactPointsEmail()).size() > 1 && contactPointRepository.findByContactData(user.getContactPointsEmail()).get(1 ).getContact_id() != contactPoint.getContact_id())
      			counter++;
      	}
			
		}
      
      
      if ( counter > 1 ) {
    	  errors.rejectValue("ContactPointsEmail", "emailExist");
      }

        
        String birth = user.getBirthDate();
        if ( birth != null ) {
        	
	        Calendar nowCalendar = Calendar.getInstance();
	        int bc = Integer.parseInt(birth.substring(0, 4));
	        int nc = nowCalendar.get(Calendar.YEAR);
	        if ( bc >= nc  || nc - bc < 6  ) {
	        	
	        	
	       
	        	errors.rejectValue("birthDate", "invDate");
	        }
        }
        
        
        


    }
    
    
    
}
