package com.hellokoding.auth.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.GraderRequest;
import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Organizer;
import com.hellokoding.auth.entity.RoleType;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.RequestRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.OfferredWorkshopService;
import com.hellokoding.auth.service.RoleService;
import com.hellokoding.auth.service.SecurityService;



@Controller
@ControllerAdvice
public class GraderController {
	
//	@Autowired
//    private GraderRepository graderRepository;
	
	@Autowired
	private GraderRepository graderRepository;
	
	@Autowired
    private OfferredWorkshopService offerredWorkshopService;
    
    @Autowired
    private OfferredWorkshopService offeredworkshopService;
    
    @Autowired
    private RoleService roleService;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private SecurityService securityService;
	
    @Autowired
    private WorkshopRepository workshopRepository;
    
    @Autowired
    private ParticipantRepository participantRepository;
    
    @Autowired
    private OrganizerRepository organizerRepository;
    
    @Autowired
    private RequestRepository requestRepository;
    
    @Autowired
    private OfferedWorkshopRepository offeredWorkshopRepository;
    
    
	@PostMapping("/organizer-grader")
    public String graders(Model model,@RequestParam("id")long id) {
		
		List<Grader> graders = graderRepository.findAll();
        model.addAttribute("graderList", graders);
        
        List<String> subjects = new ArrayList<String>();
        for (Grader grader : graders) {
        	subjects.add(roleService.findGraderOfferedWorkShop(grader).getWorkshop().getSubject());
		}
        
        

        model.addAttribute("subjects", subjects);
        
        return "organizer-grader";
    }
	
	@GetMapping("/grader")
	public String showGrader(Model model , @RequestParam("id")int id) {
		model.addAttribute("workshop_numbers", workshopRepository.findAll().size());
    	model.addAttribute("participant_numbers",participantRepository.findAll().size() );
    	model.addAttribute("grader_numbers",graderRepository.findAll().size());
    	model.addAttribute("organizer_numbers", organizerRepository.findAll().size());
    	model.addAttribute("id",id);
		
		return "grader";
	}
	
	@GetMapping("/grader-form")
	public String graderForm(Model model) {
		
		return "grader-form";
	}
	
	@GetMapping("grader-workshop")
	public String graderWorkshop(Model model,@RequestParam("id")int id ) {
		List<Grader> graders = graderRepository.findAll();
		if ( graders.size() >= 0 ){
			
			model.addAttribute("id", id);
			Grader o = null ;
			for (Grader grader : graders) {
				if ( grader.getId() == id) {
					o = grader;
					break;
				}
			}
			if ( o != null) {
			OfferedWorkshop workshop = roleService.findGraderOfferedWorkShop(o);
			
			model.addAttribute("subject",workshop.getWorkshop().getSubject() );
			model.addAttribute("price", workshop.getPrice());
			model.addAttribute("orgUsername",workshop.getOrganizer().getUser().getUsername());
			String string = "   from " + 
                    workshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getBeginDate().get(Calendar.MONTH) + "-" + workshop.getBeginDate().get(Calendar.YEAR) + "  " +workshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + workshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getEndDate().get(Calendar.MONTH) + "-" + workshop.getEndDate().get(Calendar.YEAR) + "  " +workshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getEndDate().get(Calendar.MINUTE)
                    ;
			model.addAttribute("date", string);
			}else {
				System.err.println("\nERORRRRRRRRRRRRRR\n");
			}
		}else {
			System.err.println("\nThere is no organizer\n");
		}
		
		
		return "grader-workshop";
	}
	
	@GetMapping("/user-grader")
	public String userGrader(Model model) {
		List<User> user = userRepository.findByUsername(securityService.findLoggedInUsername());
		List<Grader> stdList = new ArrayList<Grader>();
		for (Grader p : graderRepository.findAll()) {
	
			if (user.size() > 0 && p.getUser().getId() == user.get(0).getId()) {
				stdList.add(p);
			}
		}
		System.out.println("\n\n\n");
		System.out.println(stdList);
		System.out.println("\n\n\n");
		model.addAttribute("students", stdList);
		List<OfferedWorkshop> offeredWorkshops = new ArrayList<OfferedWorkshop>();
		OfferedWorkshop workshop;
		String str;
		List<String> dates = new ArrayList<String>();
		for (Grader g : stdList) {
			
			workshop = roleService.findGraderOfferedWorkShop(g);
			
			
			if ( workshop != null ) {
				str ="   from " + 
	                    workshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getBeginDate().get(Calendar.MONTH) + "-" + workshop.getBeginDate().get(Calendar.YEAR) + "  " +workshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getBeginDate().get(Calendar.MINUTE)
	                    + " to " + workshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getEndDate().get(Calendar.MONTH) + "-" + workshop.getEndDate().get(Calendar.YEAR) + "  " +workshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getEndDate().get(Calendar.MINUTE)
	                    ;
				dates.add(str);
				offeredWorkshops.add(workshop);
				
			}
		}
		
		model.addAttribute("dates", dates);
		model.addAttribute("workshops", offeredWorkshops);
		
		
		System.err.println("\n\n\n\n");
		
		System.out.println(stdList);
		System.out.println(dates);
		System.out.println(offeredWorkshops);
		System.err.println("\n\n\n\n");
		System.err.println("\n\nERROR1\n\n");
		return "user-grader";
	}
	
	
	@GetMapping("/grader-join-workshop")
	public String graderJoinWorkshop(Model model) {
List<User> users = userRepository.findByUsername(securityService.findLoggedInUsername());
		
		
		if ( users.size() > 0) {
			User user = users.get(0);
			
			model.addAttribute("participant_id", user.getId());
			
		}
		
		String str;
		ArrayList<String> dates = new ArrayList<String>();
		List< OfferedWorkshop> offeredWorkshops = offeredWorkshopRepository.findAll();
		for (OfferedWorkshop offeredWorkshop : offeredWorkshops) {
			str ="   from " + 
                    offeredWorkshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getBeginDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getBeginDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + offeredWorkshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getEndDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getEndDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getEndDate().get(Calendar.MINUTE)
                    ;
			dates.add(str);
		}
		
		model.addAttribute("workshops", offeredWorkshops);
		model.addAttribute("dates", dates);

		return"grader-join-workshop";
	}
	
	
	@GetMapping("/grader-join-new-workshop")
	public String graderJoinNewWorkshop(Model model,@RequestParam("id")int id,@RequestParam("info")String info ) {
		List<OfferedWorkshop> offeredWorkshops = offeredWorkshopRepository.findAll();
		
		List<User> user = userRepository.findByUsername(securityService.findLoggedInUsername());
		if ( offeredWorkshops.size() >= id ) {
			

			OfferedWorkshop offeredWorkshop = null;
			for (OfferedWorkshop o : offeredWorkshops) {
				
				System.out.println("\no.getId() == "+o.getId()+"\n");
				if ( o.getId() == id ) {
					offeredWorkshop = o;
				}
				
				
			
			
			}
			
			if ( offeredWorkshop != null ) {
				GraderRequest graderRequest = new GraderRequest();
				Grader grader = new Grader();
				grader.setActive(false);
				grader.setRoleType(RoleType.GRADER);
				if (user.size() > 0 ) {
					grader.setUser(user.get(0));
				}
				else {
					grader.setUser(null);
				}
				
				
				graderRequest.setDate(Calendar.getInstance());
				graderRequest.setInfo(info);
				graderRequest.setGrader(grader);
				
				
				if ( offeredWorkshop.getGraderRequests() == null)
					offeredWorkshop.setGraderRequests(new ArrayList<GraderRequest>());
				offeredWorkshop.getGraderRequests().add(graderRequest);
				
				graderRepository.save(grader);
				offeredWorkshop.getGraderRequests().add(graderRequest);
				
				
				userGrader(model);
				return "user-grader";
			}
			
		}else {
			
			
			
		}

		
		return graderJoinWorkshop(model);
		
	}
	
	
	@GetMapping("/acceptGrader")
	public String acceptGrader(Model model,@RequestParam("id")int id,@RequestParam("o_id")int o_id) {
		
		GraderRequest grader = null ;
		List<GraderRequest> graderRequests = requestRepository.findAll();
		for (GraderRequest graderRequest : graderRequests) {
			if ( graderRequest.getId() == id ) {
				graderRequest.setAccepted(true);
				grader = graderRequest;
				
			}
		}
		
		if (grader != null  ) {
			
			OfferedWorkshop offeredWorkshop = roleService.findGraderOfferedWorkShop(grader.getGrader());
			if ( offeredWorkshop.getGroups() == null)
				offeredWorkshop.setGroups(new ArrayList<Group>());
			
			if ( offeredWorkshop.getGroups().size() <= 0) {
				Group group = new Group();
				offeredWorkshop.getGroups().add(group);
			}
			if ( offeredWorkshop.getGroups().get(0).getGraders()  == null )
				offeredWorkshop.getGroups().get(0).setGraders(new ArrayList<Grader>());
			offeredWorkshop.getGroups().get(0).getGraders().add(grader.getGrader());
			offeredWorkshopRepository.save(offeredWorkshop);
		}
		
		
		return "home";
	}
	
	
	@GetMapping("/rejectGrader")
	public String rejectGrader(Model model,@RequestParam("id")int id,@RequestParam("o_id")int o_id) {
		

		List<GraderRequest> graderRequests = requestRepository.findAll();
		for (GraderRequest graderRequest : graderRequests) {
			if ( graderRequest.getId() == id ) {
				graderRequest.setAccepted(false);
				
			}
		}
		
		
		return "home";
	}
	
	@GetMapping("/organizer-grader")
    public String groups(Model model,@RequestParam("id")int id) {
    
		List<Organizer> organizers = organizerRepository.findAll();
		if ( organizers.size() >= 0 ){
			
			model.addAttribute("id", id);
			Organizer o = null ;
			for (Organizer organizer : organizers) {
				if ( organizer.getId() == id) {
					o = organizer;
					break;
				}
			}
			if ( o != null) {
			OfferedWorkshop workshop = roleService.findRoleOfferedWorkShop(o);
			
			model.addAttribute("subject",workshop.getWorkshop().getSubject() );
			model.addAttribute("price", workshop.getPrice());
			model.addAttribute("orgUsername",workshop.getOrganizer().getUser().getUsername());
			String string = "   from " + 
                    workshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getBeginDate().get(Calendar.MONTH) + "-" + workshop.getBeginDate().get(Calendar.YEAR) + "  " +workshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + workshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getEndDate().get(Calendar.MONTH) + "-" + workshop.getEndDate().get(Calendar.YEAR) + "  " +workshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getEndDate().get(Calendar.MINUTE)
                    ;
			model.addAttribute("date", string);
			
			ArrayList<String> d = new ArrayList<String>();
			for (GraderRequest graderRequest : workshop.getGraderRequests()) {
				
				string =  graderRequest.getDate().get(Calendar.DAY_OF_MONTH) + "-"+ graderRequest.getDate().get(Calendar.MONTH) + "-" + graderRequest.getDate().get(Calendar.YEAR) + "  " +graderRequest.getDate().get(Calendar.HOUR_OF_DAY) + ":" +graderRequest.getDate().get(Calendar.MINUTE);
				d.add(string);
			}
			
			model.addAttribute("d", d);
			model.addAttribute("requests",workshop.getGraderRequests());
	        model.addAttribute("o_id", id);

			
			
			}else {
				System.err.println("\nERORRRRRRRRRRRRRR\n");
			}
		}else {
			System.err.println("\nThere is no organizer\n");
		}
		
        return "organizer-grader";
    }
	@GetMapping("/About-us")
	 public String aboutus() {
		return "About-us";
	}

}
