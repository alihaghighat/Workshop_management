package com.hellokoding.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.GraderRequest;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Role;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired 
	private OfferredWorkshopService offerredWorkshopService;
	
	@Autowired
	private OfferedWorkshopRepository offeredWorkshopRepository;
	
	@Override
	public OfferedWorkshop findRoleOfferedWorkShop(Role role) {
		
		for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
			
			if ( offerredWorkshopService.findWorkshopRoles(offeredWorkshop).contains(role)) {
				return offeredWorkshop;
			}
		}
		return null;
	}

	@Override
	public OfferedWorkshop findGraderOfferedWorkShop(Grader grader) {
		
		
		for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
			
			for (GraderRequest graderRequest : offeredWorkshop.getGraderRequests()) {
				if ( graderRequest.getGrader().getId() == grader.getId()) {
					return offeredWorkshop;
				}
			}
			
		}
		return null;
	}

}
