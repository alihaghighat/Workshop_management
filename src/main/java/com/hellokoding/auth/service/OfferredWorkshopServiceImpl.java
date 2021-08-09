package com.hellokoding.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Role;
import com.hellokoding.auth.entity.Workshop;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;

@Service
public class OfferredWorkshopServiceImpl implements OfferredWorkshopService {

	@Autowired
	private OfferedWorkshopRepository offeredWorkshopRepository;

	@Override
	public List<Role> findWorkshopRoles(OfferedWorkshop offeredworkshop) {
		List<Role> roles = new ArrayList<Role>();
		
		for ( Group group : offeredworkshop.getGroups() ) {
			roles.addAll( group.getGraders());
			
			roles.addAll( group.getParticipants());
		}
		
		roles.add(offeredworkshop.getOrganizer());
		
		return roles;
	}
	
	
	
	@Override
	public OfferedWorkshop findById(Long id) {
	List<OfferedWorkshop> workshops = offeredWorkshopRepository.findAll();
		
		for (OfferedWorkshop  workshop : workshops) {
			if ( workshop.getId() == id) {
				return workshop;
			}
		}
		return null;
	}
	


}
