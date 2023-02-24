package com.agentdb.agentMserviceDB.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Agents {
	
	@Id
	private Long agentId;
	private String name;
	private String type;
	
	@Transient
	List<Powers> power = new ArrayList<>(); 
	
	
	public Agents(Long agentId, String name, String type, List<Powers> power) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.type = type;
		this.power = power;
	}
	
	public Agents(Long agentId, String name, String type) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.type = type;
	}
	
	

	public Agents() {
		super();
	}

	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Powers> getPower() {
		return power;
	}

	public void setPower(List<Powers> power) {
		this.power = power;
	}
	
	
    


}
