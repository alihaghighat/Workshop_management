package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.Participant;

public interface ParticipantRepository  extends JpaRepository<Participant, Long>{

}
