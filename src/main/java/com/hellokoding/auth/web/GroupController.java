package com.hellokoding.auth.web;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Organizer;
import com.hellokoding.auth.repository.GraderRepository;
import com.hellokoding.auth.repository.GroupRepository;
import com.hellokoding.auth.service.GraderService;



@Controller
@ControllerAdvice
public class GroupController {
	
	@Autowired
    private GroupRepository groupRepository;
	
	
	
	
	

}
