package com.hellokoding.auth.service;

import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.entity.Workshop;

public interface WorkshopService {
	Workshop findById(Long id);
}
