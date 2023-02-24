package com.powerdb.powerMserviceDB.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerdb.powerMserviceDB.Dao.PowerDao;

import com.powerdb.powerMserviceDB.entity.Powers;


@Service
public class PowerServiceImpl implements PowerService {
	
	//List<Powers> lst = List.of( new Powers(1L,"recon","reveal enemy",1013L),
			//new Powers(2L,"blind","blind enemy",1014L),
			//new Powers(3L,"poison","reduces enemy health",1015L));
	
	@Autowired
	private PowerDao pgd;

	@Override
	public List<Powers> getPowerOfAgent(long agentId) {
		// TODO Auto-generated method stub
		
		//Optional<Powers> record=pgd.findById(agentId);
		//Powers recordEntity = record.get();
		
		//ArrayList<Powers> lst = new ArrayList<Powers>();
		//lst.add(recordEntity);
		return pgd.findByagentid(agentId);
		
		//return lst.stream().filter(power -> power.getAgentid().equals(agentId)).collect(Collectors.toList());
	}
	
	

}
