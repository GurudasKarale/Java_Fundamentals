package com.power.power_Mservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.power.power_Mservice.entity.Powers;
import com.power.power_Mservice.service.PowerService;

@RestController
@RequestMapping("/power")
public class PowerController {
	
	@Autowired
	private PowerService powerservice;
	
	@RequestMapping("/agent/{agentId}")
	public List<Powers> getPowers(@PathVariable("agentId") long agentId){
		
		 return this.powerservice.getPowerOfAgent(agentId); 
	}

}
