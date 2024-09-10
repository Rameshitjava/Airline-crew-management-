package com.airlineCrew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.airlineCrew.entity.Crew;
import com.airlineCrew.service.CrewService;
@RestController
public class CrewController {
	
	@Autowired
	private CrewService crewService;
	
	@PostMapping("/crew")
	public ResponseEntity<String> createcrew(@RequestBody Crew crew){
	String	status=crewService.upsert(crew);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		}
	@GetMapping("/crew/{cId}")
	public ResponseEntity<Crew> getcrew(@PathVariable Integer cId){
		Crew  crew=crewService.getById(cId);
		return new ResponseEntity<>(crew,HttpStatus.OK);
	}
	@GetMapping("/crew")
	public ResponseEntity<List<Crew>> getAllCrews(Crew crew){
		List<Crew> allcrews= crewService.getAllCrews(crew);
		return new ResponseEntity<>(allcrews,HttpStatus.OK);
		
	}
	@PutMapping("/crew")
	public ResponseEntity<String> updatecrew(@RequestBody Crew crew){
		String status=crewService.upsert(crew);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	@DeleteMapping("/crew/{cId}")
	public ResponseEntity<String> deletecrew(@PathVariable Integer cId){
		
		String  status=crewService.deleteById(cId);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}

}
