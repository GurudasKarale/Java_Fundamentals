package com.agent.agent_Mservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agent.agent_Mservice.entity.Agents;

@Service
public class AgentServiceImpl implements AgentService  {

	
	List<Agents> lst  =  List.of(new Agents(1013l,"SOVA","non-duelist"),
			                      new Agents(1014l,"omen","duelist") ,
			                      new Agents(1015l,"viper","duelist")); 
	
	@Override
	public Agents getAgent(Long id) {
		// TODO Auto-generated method stub
		
		return lst.stream().filter(agent->agent.getAgentId().equals(id)).findAny().orElse(null);
		//return null;
	}

	
	
}
