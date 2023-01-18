package com.SpringRest.SpringRest.services;

import java.util.List;

import com.SpringRest.SpringRest.entities.Agents;

public interface AgentsService {

	
	public List<Agents> getAgents();
	public Agents getSpecificAgents(long aid);
	public Agents addAgent(Agents agn);
	
	
}
