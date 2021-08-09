package com.hellokoding.auth.service;

import java.util.List;

import com.hellokoding.auth.entity.OfferedWorkshop;
import com.hellokoding.auth.entity.Role;
import com.hellokoding.auth.entity.Workshop;

public interface OfferredWorkshopService {

	public List<Role> findWorkshopRoles(OfferedWorkshop offeredworkshop);
	public OfferedWorkshop findById(Long id);
	
}
