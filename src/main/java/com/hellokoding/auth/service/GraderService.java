package com.hellokoding.auth.service;

import java.util.List;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Workshop;

public interface GraderService {

	//public List<Grader> findAll();
	
	public  OfferedWorkshop findWorkshopOfAGrader( Grader grader);
		
		
	
	
}
