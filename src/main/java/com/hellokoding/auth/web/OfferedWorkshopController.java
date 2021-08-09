package com.hellokoding.auth.web;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.RoleRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.OfferredWorkshopService;
import com.hellokoding.auth.service.RoleService;
import com.hellokoding.auth.service.UserService;

@Controller
@ControllerAdvice
public class OfferedWorkshopController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private WorkshopRepository workshopRepository;
    
    @Autowired
    private ParticipantRepository participantRepository; 
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private GraderRepository graderRepository;
    
    @Autowired
    private OrganizerRepository organizerRepository;
    
    @Autowired
    private OfferedWorkshopRepository offeredWorkshopRepository;
    
    @Autowired
    private OfferredWorkshopService offerredWorkshopService;
    
    @Autowired
    private OfferredWorkshopService offeredworkshopService;
    
    @Autowired
    private RoleService roleService;
    
    @GetMapping("/workshop-info")
    public String workshopInfo(Model model , @RequestParam("id")long id) {
    	OfferedWorkshop offeredWorkshop = offeredworkshopService.findById(id);
    	
    	if ( offeredWorkshop != null ) {
    		
    		model.addAttribute("subject", offeredWorkshop.getWorkshop().getSubject());
    		model.addAttribute("date","   " + offeredWorkshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getBeginDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getBeginDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + offeredWorkshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getEndDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getEndDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getEndDate().get(Calendar.MINUTE)
                     );
    		model.addAttribute("info",offeredWorkshop.getWorkshop().getInfo());
    		model.addAttribute("price", offeredWorkshop.getPrice());
    		model.addAttribute("orgUsername", offeredWorkshop.getOrganizer().getUser().getUsername());
    		
    		
    	}
    	
    	
    	return "workshop-info";
    }
    
    @GetMapping("/my-workshop-info")
    public String myWorkshopInfo(Model model) {
    	
    	return "workshop-info";
    }
    

    
  
}
