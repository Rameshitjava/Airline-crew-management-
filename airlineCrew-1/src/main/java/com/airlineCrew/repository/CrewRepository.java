package com.airlineCrew.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlineCrew.entity.Crew;

public interface CrewRepository extends JpaRepository<Crew, Integer> {
	
	
	

}
