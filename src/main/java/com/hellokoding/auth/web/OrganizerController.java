package com.hellokoding.auth.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.validator.constraints.ISBN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.auth.entity.GraderRequest;
import com.hellokoding.auth.entity.Installment;
import com.hellokoding.auth.entity.InstallmentPayment;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Organizer;
import com.hellokoding.auth.entity.Payment;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OrganizerRepository;
import com.hellokoding.auth.repository.ParticipantRepository;
import com.hellokoding.auth.repository.PaymentRepository;
import com.hellokoding.auth.repository.UserRepository;
import com.hellokoding.auth.repository.WorkshopRepository;
import com.hellokoding.auth.service.RoleService;
import com.hellokoding.auth.service.SecurityService;

@Controller
@ControllerAdvice
public class OrganizerController {

	@Autowired
    private WorkshopRepository workshopRepository;
    
    @Autowired
    private ParticipantRepository participantRepository; 
    
    @Autowired
    private GraderRepository graderRepository;
    
    @Autowired
    private OrganizerRepository organizerRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private SecurityService securityService;
    
    @Autowired 
    private RoleService roleService;
    
    @Autowired
    private PaymentRepository paymentRepository;
    
	@GetMapping("/organizer")
	public String showOrganizer(Model model,@RequestParam("id")int id) {
		model.addAttribute("workshop_numbers", workshopRepository.findAll().size());
    	model.addAttribute("participant_numbers",participantRepository.findAll().size() );
    	model.addAttribute("grader_numbers",graderRepository.findAll().size());
    	model.addAttribute("organizer_numbers", organizerRepository.findAll().size());
    	model.addAttribute("id",id);
		return "organizer";
	
	}
	
	@GetMapping("/organizer-form")
	public String organizerForm(Model model) {
		
		
		
		
		
		return "organizer-form";
	}
	


	
	@GetMapping("/user-organizer")
    public String userOrganizer(Model model) {
		List<User> user = userRepository.findByUsername(securityService.findLoggedInUsername());
		List<Organizer> stdList = new ArrayList<Organizer>();
		for (Organizer p : organizerRepository.findAll()) {
			
			if ( p.getUser().getId() == user.get(0).getId()) {
				stdList.add(p);
			}
		}
		
    	
		model.addAttribute("students", stdList);
		List<OfferedWorkshop> offeredWorkshops = new ArrayList<OfferedWorkshop>();
		OfferedWorkshop workshop;
		String str;
		List<String> dates = new ArrayList<String>();
		for (Organizer participant : stdList) {
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
		return "user-organizer";
	}
	
	@GetMapping("/organizer-workshop")
	public String participantWorkshop(Model model,@RequestParam("id")int id) {
		
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
			}else {
				System.err.println("\nERORRRRRRRRRRRRRR\n");
			}
		}else {
			System.err.println("\nThere is no organizer\n");
		}
		
		
		return "organizer-workshop";
	}
	
	@GetMapping("/organizer-payment")
	public String organizerPays(Model model,@RequestParam("id")int id) {
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
			
			List<Payment> payments = workshop.getPayments();
			model.addAttribute("pays", payments);
			ArrayList<Integer> pay_max_numbers = new ArrayList<Integer>();
			ArrayList<Integer> pay_numbers = new ArrayList<Integer>();
			
			for (Payment payment : payments) {
				
				if ( payment instanceof InstallmentPayment ) {
					
					
					pay_max_numbers.add(((InstallmentPayment) payment).getInstallments().size());
					int count = 0;
					for (Installment install : ((InstallmentPayment) payment).getInstallments()) {
						if ( install.isPayed())
							count++;
					}
					pay_numbers.add(count);
					
					
					
				}else {
					pay_max_numbers.add(1);
					if ( payment.isPayed() == true)
						pay_numbers.add(1);
					else {
						pay_numbers.add(0);
					}
				}
				
			}
			
			model.addAttribute("maxes", pay_max_numbers);
			model.addAttribute("values", pay_numbers);
			}else {
				System.err.println("\nERORRRRRRRRRRRRRR\n");
			}
		}else {
			System.err.println("\nThere is no organizer\n");
		}
		
		
		
		
		
		return "organizer-payment";
	}
	
	
	@GetMapping("/savePayment")
	public String savePayment(Model model,@RequestParam("id")int id,@RequestParam("pay_number")int pay_num) {
		
		List<Payment> payments = paymentRepository.findAll();
		Payment payment = null;
		for (Payment p : payments) {
			
			if ( p.getPayment_id() == id) {
				payment = p;
			}
		}
		
		if ( payment != null ) {
			
			if ( payment instanceof InstallmentPayment) {
				InstallmentPayment installmentPayment = (InstallmentPayment) payment;
				if ( installmentPayment.getInstallments().size() == pay_num ) {
					installmentPayment.setPayed(true);
					for (Installment installment : installmentPayment.getInstallments()) {
						installment.setPayed(true);
					}
					
				}else {
					installmentPayment.setPayed(false);
					for (int i = 0; i <  installmentPayment.getInstallments().size(); i++) {
						if ( i < pay_num ) {
							installmentPayment.getInstallments().get(i).setPayed(true);
							
						}else {
							installmentPayment.getInstallments().get(i).setPayed(false);
						}
						
						
					}
					
					
				}
				
			}else {// is cash payment
				
				if(pay_num == 1) {
					
					payment.setPayed(true);
					
				}else if( pay_num == 0) {
					payment.setPayed(false);;
				}
				
				
			}
			
			paymentRepository.save(payment);
			
		}else {
			
		}
		
		
		
		
		return "home";
	}
	
	
	
	
	
}
