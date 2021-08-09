package com.hellokoding.auth.service;

import com.hellokoding.auth.entity.Grader;
import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Role;

public interface RoleService {
	
	OfferedWorkshop findRoleOfferedWorkShop(Role role);
	OfferedWorkshop findGraderOfferedWorkShop(Grader grader);

}
