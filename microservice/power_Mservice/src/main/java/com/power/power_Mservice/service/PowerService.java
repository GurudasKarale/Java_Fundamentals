package com.power.power_Mservice.service;

import java.util.List;

import com.power.power_Mservice.entity.Powers;

public interface PowerService {
	
	public List<Powers> getPowerOfAgent(long agentId);

}
