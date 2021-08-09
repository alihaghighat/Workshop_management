package com.hellokoding.auth.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.auth.entity.Administrator;
import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Organizer;
import com.hellokoding.auth.entity.Payment;
import com.hellokoding.auth.entity.Role;
import com.hellokoding.auth.entity.RoleType;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.entity.Workshop;
import com.hellokoding.auth.entity.WorkshopRelation;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.PaymentRepository;
import com.hellokoding.auth.repository.RoleRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRelationRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.OfferredWorkshopService;
import com.hellokoding.auth.service.RoleService;
import com.hellokoding.auth.service.UserService;

@Controller
@ControllerAdvice
public class AdministratorController {
	
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
    private WorkshopRelationRepository workshopRelationRepository;
    
    @Autowired
    private RoleService roleService;
    
    @Autowired
    private PaymentRepository paymentRepository;
    
	@GetMapping("/administrator")
    public String Check(Model model , @ModelAttribute("userProfile")User user) {
		
		boolean isAdminstrator = false;
		
		
			System.err.println("\n"+user.getRoles()+"\n");
			for (Role  role : roleRepository.findAll()) {
				
				if ( role.getRoleType().equals(RoleType.ADMINISTRATOR)) {
					isAdminstrator = true;
					
				}
				
			}
		
		
		if (isAdminstrator == false) {
			
			return "home";
		}
		
		
		
		
		
		model.addAttribute("workshop_numbers", workshopRepository.findAll().size());
    	model.addAttribute("participant_numbers",participantRepository.findAll().size() );
    	model.addAttribute("grader_numbers",graderRepository.findAll().size());
    	model.addAttribute("organizer_numbers", organizerRepository.findAll().size());

    	if ( user != null && user.getOfferedWorkshops() != null )
    		model.addAttribute("my_recently_workshops",user.getOfferedWorkshops().subList(0, 10));
    	else {
    		model.addAttribute("my_recently_workshops", new ArrayList<OfferedWorkshop>() );
		}
		
		return "administrator";
    }
	
	
	
	
	@GetMapping("/administrator-users")
	public String administratorUser(Model model) {
		
		model.addAttribute("all_users",userRepository.findAll());
		model.addAttribute("user_administrator",new User());
		
		
		return "administrator-users";
	}
	
	@GetMapping("/administrator-form")
	public String AdministratorForm(Model model) {
		
		
		return "administrator-form";
	}
	

	@GetMapping("/addAdministrator")
	public String addAdministratorPost(@RequestParam("username")String username , Model model) {
		
		List<User> users = userRepository.findByUsername(username);
		if ( users.size() > 0 ) {
			
			Administrator role = new Administrator();
			role.setActive(true);
			role.setRoleType(RoleType.ADMINISTRATOR);
			role.setUser(users.get(0));
			
			users.get(0).getRoles().add(role);
			roleRepository.save(role);
			
			model.addAttribute("alert_message", "User not found!!!");
			
		}else {
			
			model.addAttribute("alert_message", "User not found!!!");
		}
		return "administrator";
	}
	

	

	@GetMapping("/administrator-see-all-roles")
	public String administratorUserRoles(Model model,@RequestParam("id")Long id) {
		User user = userService.findById(id);
		List<String> subjects = new ArrayList<String>();
		model.addAttribute("user_info", user);
		model.addAttribute("age",Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(user.getBirthDate().substring(0, 4)));
		
		String subject;
		
			 subject =  "-";
			 List<Role> roles = roleRepository.findAll();
			 List<Role> ret_Roles = new ArrayList<Role>();
			 for (Role role : roles) {
				OfferedWorkshop temp = roleService.findRoleOfferedWorkShop(role);
				if ( role.getUser().getId() == id) {
					ret_Roles.add(role);
				}
				if (temp != null)
					subjects.add(temp.getWorkshop().getSubject());
			
				else {
					subjects.add("-");
				}
			
		}
		model.addAttribute("all_roles" ,ret_Roles);
		model.addAttribute("all_roles_subjects", subjects);
		return "administrator-see-all-roles";
	}
	
	@GetMapping("/administrator-workshop")
	public String administratorSeeAllWorkshops(Model model) {
		
		List<OfferedWorkshop> offeredWorkshops = offeredWorkshopRepository.findAll(); 
		model.addAttribute("all_workshops" , offeredWorkshops );
		
		List<Long> gradernumList = new ArrayList<Long>();
		List<Long> participantnumList = new ArrayList<Long>();
		List<String> dates = new ArrayList<String>();
		String str;
		long graders;
		long participants;
		for (OfferedWorkshop offeredWorkshop : offeredWorkshops) {
			graders = 0;
			participants = 0;
			for (Group group : offeredWorkshop.getGroups() ) {
				graders += group.getGraders().size();
				participants += group.getParticipants().size();
			}
			str ="   from " + 
                    offeredWorkshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getBeginDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getBeginDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + offeredWorkshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getEndDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getEndDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getEndDate().get(Calendar.MINUTE)
                    ;
			dates.add(str);
			
			gradernumList.add(graders);
			participantnumList.add(participants);
			
			
		}
		model.addAttribute("graders_number", gradernumList);
		model.addAttribute("participants_number", participantnumList);
		model.addAttribute("dates", dates);
		return "administrator-workshop";
	}
	
	@GetMapping("/add-workshop")
	public String addANewWorkshopPage(Model model) {
		model.addAttribute("all_courses", workshopRepository.findAll());
		model.addAttribute("all_users", userRepository.findAll());
		
		return "add-workshop";
	}
	
	@GetMapping("/add-new-workshop")
    public String addANewWorkshop(@RequestParam("subject")String subject, 
    		@RequestParam("organizerUsername")String organizerUsername ,@RequestParam("beginDate")String beginDate ,@RequestParam("endDate")String endDate,
    		@RequestParam("location")String location,@RequestParam("price")int price,Model model) {
		
			
		OfferedWorkshop offeredWorkshop = new OfferedWorkshop();
		
		
		List<User> users = userRepository.findByUsername(organizerUsername);
		
		if ( users.size() > 0){
			
			Organizer organizer = new Organizer();
			organizer.setActive(true);
			organizer.setRoleType(RoleType.ORGANIZER);
			
			if ( users.get(0).getOfferedWorkshops() == null)
				users.get(0).setOfferedWorkshops(new ArrayList<OfferedWorkshop>());
			
			users.get(0).getOfferedWorkshops().add(offeredWorkshop);
			
			organizer.setUser(users.get(0));
			offeredWorkshop.setUsers(new ArrayList<User>());
			offeredWorkshop.getUsers().add(users.get(0));
			roleRepository.save(organizer);
			offeredWorkshop.setOrganizer(organizer);
	
			Calendar calendar = Calendar.getInstance();
			int year = Integer.parseInt(beginDate.substring(0, 4));
			int month = Integer.parseInt(beginDate.substring(5, 7));
			int day = Integer.parseInt(beginDate.substring(8, 10));
			calendar.set(year, month, day);
			offeredWorkshop.setBeginDate(calendar);
			offeredWorkshop.setLocation(location);
			calendar = Calendar.getInstance();
			year = Integer.parseInt(beginDate.substring(0, 4));
			month = Integer.parseInt(beginDate.substring(5, 7));
			 day = Integer.parseInt(beginDate.substring(8, 10));
			calendar.set(year, month, day);
			offeredWorkshop.setEndDate(calendar);
			offeredWorkshop.setPrice(price);
			
			Workshop workshop = workshopRepository.findBySubject(subject);
			if ( workshop != null ) {
				offeredWorkshop.setWorkshop(workshop);
				model.addAttribute("alert_message", "The workshop has been successfully added");
				offeredWorkshopRepository.save(offeredWorkshop);
			}else {
				model.addAttribute("alert_message", "The course not found!!!");
			}
		}else {
			model.addAttribute("alert_message", "The user not found!!!");
		}
		
			return "administrator";
		}
		

		
		
		
		
		
		
		

	
	@GetMapping("/add-course")
	public String addANewCourse(Model model) {
		
		model.addAttribute("all_courses", workshopRepository.findAll());
	
		return "add-course";
	}
	
	@GetMapping("/add-new-course")
	public String addANewCourse(@RequestParam("subject")String subject ,@RequestParam("info")String info, Model model) {
		
	List<Workshop> workshops = workshopRepository.findAll();
	
	
	for (Workshop workshop : workshops) {
		if(workshop.getSubject().equals(subject)) {
			model.addAttribute("alert_message" , "This course already exist!!!");
			return null;
		}
	}
	
		Workshop newWorkshop = new Workshop();
		newWorkshop.setSubject(subject);
		newWorkshop.setInfo(info);
		workshopRepository.save(newWorkshop);
	
		model.addAttribute("all_courses", workshopRepository.findAll());
		return "add-workshop";
	}
	

	
	@GetMapping("/course-preRequired")
	public String courseReq(Model model,@RequestParam("id")int id) {
		
		model.addAttribute("workshop_id", id);
		List<Workshop> workshops = workshopRepository.findAll();
		if ( id <= workshops.size() )
			model.addAttribute("pre_courses",workshops.get( id - 1 ).getWorkshopRelations());
		
		model.addAttribute("all_courses", workshops);
		return "course-preRequired";
	}
	
	@GetMapping("/add_preRequired")
	public String addPerReq(Model model,@RequestParam("id")int id , @RequestParam("workshop_id")int workshop_id) {
		
		
		List<Workshop> workshops = workshopRepository.findAll();
		if ( id <= workshops.size()) {
			WorkshopRelation workshopRelation = new WorkshopRelation();
			workshopRelation.setPreRequired(workshops.get(id - 1));
			
			if (workshops.get(workshop_id - 1).getWorkshopRelations() == null ) 
				workshops.get(workshop_id - 1).setWorkshopRelations(new ArrayList<WorkshopRelation>());
			
			workshopRelationRepository.save(workshopRelation);
			int count = 0;
			
			for (WorkshopRelation wr : workshops.get(workshop_id-1).getWorkshopRelations()) {
				
				if ( wr.getPreRequired().getId() == workshops.get(id-1).getId()) {
					count++;
				}
			}
			
			if ( workshop_id != id && count <= 0)
				workshops.get(workshop_id - 1).getWorkshopRelations().add(workshopRelation);
			 
			workshopRepository.save(workshops.get(workshop_id-1));
			
			return "home";
		}else {
			System.out.println("\nNot Found\n");
		}
		
		return "home";
	}
	
	
	@GetMapping("/remove_preRequired")
	public String removePreReq(Model model , @RequestParam("id")int id,@RequestParam("workshop_id")int workshop_id) {
		List<Workshop> workshops = workshopRepository.findAll();
		if ( id <= workshops.size()) {
			WorkshopRelation workshopRelation = null ;
			for (WorkshopRelation wr : workshops.get(workshop_id - 1).getWorkshopRelations()) {
				if ( wr.getPreRequired().getId() == id) {
					workshopRelation = wr;
				}
			}
			
			if ( workshopRelation != null) {
				workshops.get(workshop_id-1).getWorkshopRelations().remove(workshopRelation);
				workshopRelationRepository.delete(workshopRelation);
				workshopRepository.save(workshops.get(workshop_id-1));
				System.out.println("\nDone\n");
				
			}
			
			return "home";
		}else {
			System.out.println("\nNot Found\n");
		}
		
			
		
		
		return "home";
	}
	
	@GetMapping("/administrator-payment")
	public String adminstratorShowPays(Model model) {
		
		List<Payment> payments = paymentRepository.findAll();
		List<OfferedWorkshop> offeredWorkshops = new ArrayList<OfferedWorkshop>();
		List<User> users = new ArrayList<User>() ;
		List<String> dates = new ArrayList<String>();
		String str;
		OfferedWorkshop offeredWorkshop;
		for (Payment payment : payments) {
			
			users.add(payment.getParticipant().getUser());
			offeredWorkshop = roleService.findRoleOfferedWorkShop(payment.getParticipant());
			offeredWorkshops.add(offeredWorkshop);
			str ="   from " + 
                    offeredWorkshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getBeginDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getBeginDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + offeredWorkshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ offeredWorkshop.getEndDate().get(Calendar.MONTH) + "-" + offeredWorkshop.getEndDate().get(Calendar.YEAR) + "  " +offeredWorkshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +offeredWorkshop.getEndDate().get(Calendar.MINUTE)
                    ;
			dates.add(str);
		}
		
		model.addAttribute("pays",payments);
		model.addAttribute("users", users);
		model.addAttribute("workshops",offeredWorkshops);
		model.addAttribute("dates", dates);
		
		
		
		return "administrator-payment";
	}
	
	
	
	
}
