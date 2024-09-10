package com.airlineCrew.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlineCrew.entity.Crew;
import com.airlineCrew.repository.CrewRepository;
@Service
public class CrewServiceImpl implements CrewService{

	@Autowired
	private CrewRepository crewRepository;
	
	@Override
	public String upsert(Crew crew) {
		crewRepository.save(crew);
		return "success";
	}

	@Override
	public Crew getById(Integer cId) {
	Optional<Crew>	findById=crewRepository.findById(cId);
	if(findById.isPresent()) {
		return 	findById.get();
	}
		return null;
	}

	@Override
	public List<Crew> getAllCrews(Crew crew) {
		return 	crewRepository.findAll();
		
	}

	@Override
	public String deleteById(Integer cId) {
	if(crewRepository.existsById(cId)) {
		crewRepository.deleteById(cId);
		return "delete success";
	}else {

		return "no record found";
	}
	
	}
	

}
