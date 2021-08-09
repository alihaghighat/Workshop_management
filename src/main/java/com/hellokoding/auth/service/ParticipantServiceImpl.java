package com.hellokoding.auth.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Participant;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;


@Transactional
@Service
public class ParticipantServiceImpl implements ParticipantService {


		@Autowired
		private GraderRepository graderRepository;

		@Autowired
		private OfferedWorkshopRepository offeredWorkshopRepository;
		

		


		@Override
		public OfferedWorkshop findWorkshopOfAParticipant(Participant participant) {
			
			
			for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
				
				for (Group group : offeredWorkshop.getGroups()) {
					
					if(group.getParticipants().contains(participant)) {
						return offeredWorkshop;
					}
					
					
				}
			
			
		}
			return null;
		}
		
		

	}
