package com.power.power_Mservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.power.power_Mservice.entity.Powers;


@Service
public class PowerServiceImpl implements PowerService {
	
	List<Powers> lst = List.of( new Powers(1L,"recon","reveal enemy",1013L),
			new Powers(2L,"blind","blind enemy",1014L),
			new Powers(3L,"poison","reduces enemy health",1015L));

	@Override
	public List<Powers> getPowerOfAgent(long agentId) {
		// TODO Auto-generated method stub
		return lst.stream().filter(power -> power.getAgentid().equals(agentId)).collect(Collectors.toList());
	}
	
	

}
