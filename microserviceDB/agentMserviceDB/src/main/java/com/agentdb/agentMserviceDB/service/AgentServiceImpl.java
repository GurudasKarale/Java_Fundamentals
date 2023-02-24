package com.agentdb.agentMserviceDB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agentdb.agentMserviceDB.Dao.AgentsDao;
import com.agentdb.agentMserviceDB.entity.Agents;

@Service
public class AgentServiceImpl implements AgentService  {

	
	//List<Agents> lst  =  List.of(new Agents(1013l,"SOVA","non-duelist"),
			                      //new Agents(1014l,"omen","duelist") ,
			                      //new Agents(1015l,"viper","duelist")); 
	@Autowired
	private AgentsDao agd;
	
	@Override
	public Agents getAgent(Long id) {
		// TODO Auto-generated method stub
		
		Optional<Agents> record=agd.findById(id);
		Agents recordEntity = record.get();
		return recordEntity;
		
		//return lst.stream().filter(agent->agent.getAgentId().equals(id)).findAny().orElse(null);
		//return null;
	}

	
	
}
