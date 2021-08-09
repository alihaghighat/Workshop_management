package com.hellokoding.auth.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Organizer;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;
import com.hellokoding.auth.repository.OrganizerRepository;


@Transactional
@Service
public class OrganizerServiceImpl implements OrganizerService {


		@Autowired
		private OrganizerRepository organizerRepository;

		@Autowired
		private OfferedWorkshopRepository offeredWorkshopRepository;
		
		
		@Override
		public  OfferedWorkshop findWorkshopOfAOrganizer( Organizer organizer) {
			
		for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
				
				if(offeredWorkshop.getOrganizer().equals(organizer)) {
					return offeredWorkshop;
				}
		
			
		}
			
		return null;
		}
		
		
		
		

	}
