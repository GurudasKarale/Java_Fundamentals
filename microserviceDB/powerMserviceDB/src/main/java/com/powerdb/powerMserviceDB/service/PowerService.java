package com.powerdb.powerMserviceDB.service;

import java.util.List;

import com.powerdb.powerMserviceDB.entity.Powers;

public interface PowerService {
	
	public List<Powers> getPowerOfAgent(long agentId);

}
