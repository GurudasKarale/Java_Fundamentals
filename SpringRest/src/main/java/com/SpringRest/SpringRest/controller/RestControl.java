package com.SpringRest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringRest.entities.Agents;
import com.SpringRest.SpringRest.services.AgentsService;

@RestController
public class RestControl {
	
	@Autowired
	private AgentsService as;

	@GetMapping("/home")
	public String home() {
		
		return "This is home page";
	}
	
	@GetMapping(path="/agents",produces="application/json")
	public List<Agents> getAgents(){
		
		return this.as.getAgents();
		
	}
	
	@GetMapping(path="/agents/{aid}",produces="application/json")
	public Agents getSpecificAgents(@PathVariable("aid") String aid) {
		
		return this.as.getSpecificAgents(Long.parseLong(aid));
	}
	
	@PostMapping(path="/agentss",consumes="application/json")
	public Agents addAgent(@RequestBody Agents agn) {
		
		return this.as.addAgent(agn);
	}
	
}
