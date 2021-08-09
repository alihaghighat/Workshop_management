package com.hellokoding.auth.web;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.hellokoding.auth.entity.ContactPoint;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.repository.ContactPointRepository;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.SecurityService;
import com.hellokoding.auth.service.SecurityServiceImpl;
import com.hellokoding.auth.service.UserService;
import com.hellokoding.auth.validator.UserValidator;


@Controller
@ControllerAdvice 
public class UserController  {
    @Autowired
    private UserRepository userRepository;

	@Autowired
    private UserService userService;
	


	
	@Autowired
    private UserDetailsService userDetailsService;
	
    @Autowired
    private SecurityService securityService;

    @Autowired
    private SecurityServiceImpl securityServiceImpl;
    
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ContactPointRepository contactPointRepository;
    
    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private WorkshopRepository workshopRepository;
    
    @Autowired
    private ParticipantRepository participantRepository; 
    
    @Autowired
    private GraderRepository graderRepository;
    
    @Autowired
    private OrganizerRepository organizerRepository;
    
    @Autowired
    private OfferedWorkshopRepository offeredWorkshopRepository;
    
    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }
    
    @GetMapping("/profileUpdate")
    public String profileUp(Model model) {

    
    	return "profile";
    }
    
    @GetMapping("/profile")
    public String profile(Model model) {
    	System.out.println("\nLogged in username : "+securityServiceImpl.findLoggedInUsername()+"\n");
    List<User> users = userRepository.findByUsername(securityServiceImpl.findLoggedInUsername() ); 	
    User user = null;
    if (users.size() > 0 ) {
		user = users.get(0);
    	
	}	
    
    
    	model.addAttribute("userProfile", user);
    	if ( user != null ) {
    		
    		model.addAttribute("birthDateForm",user.getBirthDate());
    		System.out.println("\nUser : "+user.getUsername()+"\n");	
    	}else {
    		System.out.println("\nUser : "+securityServiceImpl.findLoggedInUsername()+"Not found\n");
		}
        return "profile";
    }
    
    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {
    	
    	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
   	
    }
    
    
    @PostMapping("/profileUpdate")
    @Transactional
    public String saveProfile(@Valid @ModelAttribute("userProfile") User userProfile, BindingResult bindingResult , Model model  ) {
    	
    	userValidator.editValidate(userProfile, bindingResult);
    	
    	
        if (bindingResult.hasErrors()) {
            return "profile";
        }
        
        
        User theUser;
        String username = securityService.findLoggedInUsername();
List<User> users = userRepository.findByUsername(username); 
        System.out.println("\nSm_mE : found users for username : " + securityService.findLoggedInUsername() +" : "+users);
        if ( users.size() > 0 ) {
        	theUser = users.get(0);
        	userProfile.setId(theUser.getId());
        	
        	List<ContactPoint> contactPoints;
            int i = 0;
            for (ContactPoint contactPoint : userProfile.getContactPoints()) {
            	contactPoints = contactPointRepository.findByType(contactPoint.getType());
            	if (contactPoints.size() > 0 ) {
            		contactPoints.get(0).setContactData(contactPoint.getContactData());
            	}
    		
            	if ( i >= 4 ) {
            		break;
            	}
            	
            	i++;
            }
            
            userProfile.setContactPoints(theUser.getContactPoints());
            entityManager.merge(userProfile);
            model.addAttribute("userProfile", userProfile);
    		model.addAttribute("birthDateForm",userProfile.getBirthDate());
    	
    		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	          
            if (userDetails instanceof UserDetails) {
            
            	Authentication authentication = new UsernamePasswordAuthenticationToken(userProfile.getUsername(), userProfile.getPassword(), ((UserDetails) userDetails).getAuthorities() ) ;
        		
        		SecurityContextHolder.getContext().setAuthentication(authentication);

            }
    		
        }
        else {
			theUser = null;
		}
       
        model.addAttribute("userProfile", userProfile);
        return "redirect:/home";
    }
    
    
    
    
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("userForm") User userForm, BindingResult bindingResult  ) {
    	
    	userValidator.validate(userForm, bindingResult);
    	
    	if (  userForm != null )
    	//   userForm.contactPoints.add(contactOneForm);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
    	
     
        userService.save(userForm);
        
        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
    
    @GetMapping("/check")
    public String Check(Model model, String error, @RequestParam(name="username", required=false)String username, @RequestParam(name="bestFriendName", required=false)String bestFriendName ) {
        if (error != null)
            model.addAttribute("error", "Your username or best friend name is invalid.");
        
        User user = userRepository.findByUsername(username).get(0);
        if ( user.getBestFriendName().equals(bestFriendName)) {
        	return "redirect:/reset";
        }
        
			model.addAttribute("error","This name does not math with your best friend name");
			return "check";
		
    }
    
    
    @GetMapping({"/","/home"})
    public String home(Model model , @ModelAttribute("userProfile") User user ) {
    	
    	model.addAttribute("workshop_numbers", workshopRepository.findAll().size());
    	model.addAttribute("participant_numbers",participantRepository.findAll().size() );
    	model.addAttribute("grader_numbers",graderRepository.findAll().size());
    	model.addAttribute("organizer_numbers", organizerRepository.findAll().size());
    	
    	List<OfferedWorkshop> offeredWorkshops = new ArrayList<OfferedWorkshop>();
    	User userProfile = userService.findByUsername(securityService.findLoggedInUsername());
    	List<String> dates = new ArrayList<String>();
    	String str;
    	for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
			for (User user1 : offeredWorkshop.getUsers()) {
				if ( user1.getId() == userProfile.getId() ) {
				
					offeredWorkshops.add(offeredWorkshop);
					str ="   from " + 
		                    offeredWorkshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getBeginDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getBeginDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getBeginDate().get(Calendar.MINUTE)
		                    + " to " + offeredWorkshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getEndDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getEndDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getEndDate().get(Calendar.MINUTE)
		                    ;
					dates.add(str);
				}
			}
		}

    	
    	
    	if ( user != null && user.getOfferedWorkshops() != null ) {
    		if ( offeredWorkshops.size() > 10 )
    			model.addAttribute("my_recently_workshops",offeredWorkshops.subList(0, 10));
    		else {
    			model.addAttribute("my_recently_workshops",offeredWorkshops);
			}
    	}
    	else {
    
    		model.addAttribute("my_recently_workshops", new ArrayList<OfferedWorkshop>() );
		}
    	
       return "home";
		
    }
    
   
    
}
