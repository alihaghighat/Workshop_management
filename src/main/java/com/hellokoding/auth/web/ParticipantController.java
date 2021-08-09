package com.hellokoding.auth.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.criteria.From;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.Installment;
import com.hellokoding.auth.entity.InstallmentPayment;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Participant;
import com.hellokoding.auth.entity.Payment;
import com.hellokoding.auth.entity.RoleType;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.entity.Workshop;
import com.hellokoding.auth.entity.WorkshopRelation;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.PaymentRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.RoleService;
import com.hellokoding.auth.service.SecurityService;

@Controller
@ControllerAdvice
public class ParticipantController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	 @Autowired
	    private WorkshopRepository workshopRepository;
	    
	    
	    @Autowired
	    private GraderRepository graderRepository;
	    
	    @Autowired
	   private OrganizerRepository organizerRepository;
	 
	    @Autowired
	    private RoleService roleService;
	    
	    
	    @Autowired
	    private OfferedWorkshopRepository offeredWorkshopRepository;
	    
	    
	    @Autowired
	    private PaymentRepository paymentRepository;
	    
	    @Autowired
	    private UserRepository userRepository;
	    
	    @Autowired
	    private SecurityService securityService;
	    
	@GetMapping("/participant")
	public String showParticipant(Model model,@RequestParam("id")long id) {
		
		model.addAttribute("workshop_numbers", workshopRepository.findAll().size());
    	model.addAttribute("participant_numbers",participantRepository.findAll().size() );
    	model.addAttribute("grader_numbers",graderRepository.findAll().size());
    	model.addAttribute("organizer_numbers", organizerRepository.findAll().size());
		model.addAttribute("id", id);
    	List<Participant> participants = participantRepository.findAll();
    	
    	if ( participants.size() > id )
    		model.addAttribute("participant",participants.get((int)id) );
		return "participant";
	}
	
	@GetMapping("/show-student")
	public String showSTD(@RequestParam("id")long id ,Model model) {
		
		
		model.addAttribute("students", participantRepository.findAll());
		
		
		return "show-student";
	}
	
	@GetMapping("participant-form")
	public String participantForm(Model model) {
		
		return "participant-form";
	}
	
	@GetMapping("/participant-grader")
	public String participantGrader(Model model , @RequestParam("id")int id) {
		Participant participant ;
		List<Participant> participants = participantRepository.findAll();
		if ( participants.size() > id) {
			
			participant = participants.get(id);
			model.addAttribute("participant", participant);
			OfferedWorkshop offeredWorkshop = roleService.findRoleOfferedWorkShop(participant);
			if ( offeredWorkshop != null) {
				int i = 0;
				for (Group group : offeredWorkshop.getGroups()) {
					if ( group.getParticipants().contains(participant)) {
						model.addAttribute("graders", group.getGraders());
						model.addAttribute("group_num", i);
					}
					i+=1;
				}
				
				model.addAttribute("workshop", offeredWorkshop);
			}
			
		}
		
		
		return "participant-grader";
	}
	
	@GetMapping("/participant-payment")
	public String participantPays() {
		
		return "participant-payment";
	}
	
	@GetMapping("/participant-workshop")
	public String participantWorkshop(Model model,@RequestParam("id")int id) {
		
		List<Participant> participants = participantRepository.findAll();
		if ( participants.size() >= 0 ){
			
			model.addAttribute("id", id);
			Participant pa = null ;
			for (Participant participant : participants) {
				if ( participant.getId() == id) {
					pa = participant;
					break;
				}
			}
			OfferedWorkshop workshop = roleService.findRoleOfferedWorkShop(pa);
			for (Payment p : workshop.getPayments()) {
				System.out.println("\n"+p.getParticipant().getId()+" "+id+"\n");
				if ( p.getParticipant().getId() == id ) {
					
					model.addAttribute("isPayed", p.isPayed());
				}
			}
			model.addAttribute("subject",workshop.getWorkshop().getSubject() );
			model.addAttribute("price", workshop.getPrice());
			model.addAttribute("orgUsername",workshop.getOrganizer().getUser().getUsername());
			String string = "   from " + 
                    workshop.getBeginDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getBeginDate().get(Calendar.MONTH) + "-" + workshop.getBeginDate().get(Calendar.YEAR) + "  " +workshop.getBeginDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getBeginDate().get(Calendar.MINUTE)
                    + " to " + workshop.getEndDate().get(Calendar.DAY_OF_MONTH) + "-"+ workshop.getEndDate().get(Calendar.MONTH) + "-" + workshop.getEndDate().get(Calendar.YEAR) + "  " +workshop.getEndDate().get(Calendar.HOUR_OF_DAY) + ":" +workshop.getEndDate().get(Calendar.MINUTE)
                    ;
			model.addAttribute("date", string);
			
		}
		
		
		return "participant-workshop";
	}
	
	@GetMapping("/user-participant")
    public String userParticipant(Model model) {
		List<User> user = userRepository.findByUsername(securityService.findLoggedInUsername());
		List<Participant> stdList = new ArrayList<Participant>();
		for (Participant p : participantRepository.findAll()) {
			
			if ( p.getUser().getId() == user.get(0).getId()) {
				stdList.add(p);
			}
		}
		
    	
		model.addAttribute("students", stdList);
		List<OfferedWorkshop> offeredWorkshops = new ArrayList<OfferedWorkshop>();
		OfferedWorkshop workshop;
		String str;
		List<String> dates = new ArrayList<String>();
		for (Participant participant : stdList) {
			workshop = roleService.findRoleOfferedWorkShop(participant);
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
		
    	 return"user-participant";
    }
	
	@GetMapping("/join-workshop")
	public String joinWorkshop(Model model) {
		
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
		
		return "join-workshop";
	}
	
	@GetMapping("/join-new-workshop")
	public String joinNewWorkshop(Model model,@RequestParam("id")int id ,@RequestParam("install_number")int install_num ) {
		
		List<OfferedWorkshop> offeredWorkshops = offeredWorkshopRepository.findAll();
		
		if ( offeredWorkshops.size() >= id ) {
			
			System.out.println("\nid == "+id+"\n");
			OfferedWorkshop offeredWorkshop = null;
			for (OfferedWorkshop o : offeredWorkshops) {
				
				System.out.println("\no.getId() == "+o.getId()+"\n");
				if ( o.getId() == id ) {
					offeredWorkshop = o;
				}
			}
			
			if ( install_num > 1 && install_num < 7 && offeredWorkshop != null ) {
				
				InstallmentPayment payment = new InstallmentPayment();
				ArrayList<Installment> installments = new ArrayList<Installment>();
				Installment installment;
				
				payment.setAmount(offeredWorkshop.getPrice());
				
				for (int i = 0; i < install_num ; i++) {
					installment = new Installment();
					installment.setPayed(false);
					installment.setAmount((payment.getAmount()/install_num));
					installments.add(installment);
				}
				
				payment.setInstallments(installments);
				payment.setPayed(false);
				
				Participant participant = new Participant();
				participant.setActive(false);
				participant.setRoleType(RoleType.PARTICIPANT);
				List<User> users = userRepository.findByUsername(securityService.findLoggedInUsername());
				if ( users.size() > 0)
					participant.setUser(users.get(0));
				
				
				if ( offeredWorkshop.getGroups() == null )
					offeredWorkshop.setGroups(new ArrayList<Group>());
				if ( offeredWorkshop.getGroups().size() == 0)
					offeredWorkshop.getGroups().add(new Group());
				if ( offeredWorkshop.getGroups().get(0).getParticipants() == null )
					offeredWorkshop.getGroups().get(0).setParticipants(new ArrayList<Participant>());
				offeredWorkshop.getGroups().get(0).getParticipants().add(participant);
				if (offeredWorkshop.getPayments() == null)
					offeredWorkshop.setPayments(new ArrayList<Payment>());

					
					
					payment.setParticipant(participant);
					
					offeredWorkshop.getPayments().add(payment);
					paymentRepository.save(payment);
					offeredWorkshop.getGroups().get(0).getParticipants().add(participant);


					userParticipant(model);
					return "user-participant";
				
					
				}else if (offeredWorkshop != null){
					
					Payment payment = new Payment();
					
					
					payment.setAmount(offeredWorkshop.getPrice());
					
					payment.setPayed(false);
					
					Participant participant = new Participant();
					participant.setActive(false);
					participant.setRoleType(RoleType.PARTICIPANT);
					List<User> users = userRepository.findByUsername(securityService.findLoggedInUsername());
					if ( users.size() > 0)
						participant.setUser(users.get(0));
					
					
					if ( offeredWorkshop.getGroups() == null )
						offeredWorkshop.setGroups(new ArrayList<Group>());
					if ( offeredWorkshop.getGroups().size() == 0)
						offeredWorkshop.getGroups().add(new Group());
					if ( offeredWorkshop.getGroups().get(0).getParticipants() == null )
						offeredWorkshop.getGroups().get(0).setParticipants(new ArrayList<Participant>());
					offeredWorkshop.getGroups().get(0).getParticipants().add(participant);
					if (offeredWorkshop.getPayments() == null)
						offeredWorkshop.setPayments(new ArrayList<Payment>());

						
						
						payment.setParticipant(participant);
						
						offeredWorkshop.getPayments().add(payment);
						paymentRepository.save(payment);


					
					
					
				}
				
			}else {
				
				System.err.println("\nofferedWokshop not found\n");
				
			}
		
		
		return "join-workshop";
	}
	
	@GetMapping("see-preRequired")
	public String seePreReq(Model model,@RequestParam("id")int id) {
		List<Workshop> allList = workshopRepository.findAll();
		List<WorkshopRelation> workshops = allList.get(id - 1).getWorkshopRelations(); 
		model.addAttribute("workshop_relation", workshops);
		
		return "see-preRequired";
	}
	
	
}
