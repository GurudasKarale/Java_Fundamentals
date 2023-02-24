package com.powerdb.powerMserviceDB.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.powerdb.powerMserviceDB.entity.Powers;

public interface PowerDao extends JpaRepository<Powers,Long> {
	
	@Query("SELECT p FROM Powers p where p.agentid=?1")
	List<Powers> findByagentid(long agentId);

}
