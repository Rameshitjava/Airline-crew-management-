package com.airlineCrew.service;

import java.util.List;

import com.airlineCrew.entity.Crew;

public interface CrewService {
	
	
	public String upsert(Crew crew);
	
	public Crew  getById(Integer cId);
	
	public List<Crew> getAllCrews(Crew crew);
	
	public String deleteById(Integer cId);

}
