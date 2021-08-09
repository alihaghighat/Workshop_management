package com.hellokoding.auth.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.Group;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.OfferedWorkshopRepository;


@Transactional
@Service
public class GraderServiceImpl implements GraderService {


		@Autowired
		private GraderRepository graderRepository;

		@Autowired
		private OfferedWorkshopRepository offeredWorkshopRepository;
		
//		@Override
//		public List<Grader> findAll() {
//			return graderRepository.findAll();
//		}
		
		@Override
		public OfferedWorkshop findWorkshopOfAGrader(Grader grader) {
			
		for (OfferedWorkshop offeredWorkshop : offeredWorkshopRepository.findAll()) {
			
			for (Group group : offeredWorkshop.getGroups()) {
				
				if(group.getGraders().contains(grader)) {
					return offeredWorkshop;
				}
				
				
			}
		
			
		}
			
		return null;
		}
		
		
		
		

	}
