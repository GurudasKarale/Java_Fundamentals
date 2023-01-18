package com.SpringRest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.dao.AgentsDao;
import com.SpringRest.SpringRest.entities.Agents;
import java.util.Optional;

@Service
public class AgentsServiceImple implements AgentsService {
	
	//List<Agents> list;
	
	@Autowired
	private AgentsDao agd;

	public AgentsServiceImple() {
		
		//list = new ArrayList<>();
		//list.add(new Agents(101,"Viper","Poison orb"));
		//list.add(new Agents(102,"SOVA","Recon"));
	}
	
	@Override
	public List<Agents> getAgents() {
		// TODO Auto-generated method stub
		//return list;
		return agd.findAll();
	}

	
	@Override
	public Agents getSpecificAgents(long aid) {
		
		//Agents a = null;
		
		//for(Agents it:list) {
			
		//	if(it.getAid()==aid) {
		//		a=it;
		//		break;
		//	}
		//}
		
		//return a;
		Optional<Agents> record=agd.findById(aid);
		Agents recordEntity = record.get();
		return recordEntity;
	}

	
	@Override
	public Agents addAgent(Agents agn) {
		
		//list.add(agn);
		agd.save(agn);
		return agn;
	}
	

}
