package com.agent.agent_Mservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.agent.agent_Mservice.entity.Agents;
import com.agent.agent_Mservice.service.AgentService;

@RestController
@RequestMapping("/agent")
public class Agentcontroller {
	
	@Autowired
	private AgentService agentservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{agentId}")
	public Agents getAgent(@PathVariable("agentId") long agentId) {
		
		Agents agnt = this.agentservice.getAgent(agentId);
		
		//http://localhost:9002/power/agent/1013
		
		List pwrlst = this.restTemplate.getForObject("http://localhost:9002/power/agent/" +agnt.getAgentId(), List.class);
		
		agnt.setPower(pwrlst);
		return agnt;
		
	}

}
