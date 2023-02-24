package com.agentdb.agentMserviceDB.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agentdb.agentMserviceDB.entity.Agents;

public interface AgentsDao extends JpaRepository<Agents,Long>{
	
	//@Query("SELECT a FROM Agents a where aname='SOVA'")
	//List<Agents> findAll();

}
