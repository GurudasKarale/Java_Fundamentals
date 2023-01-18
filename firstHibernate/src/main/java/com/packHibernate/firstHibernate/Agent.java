package com.packHibernate.firstHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agent {
	
	@Id
	private int aid;
	private String name;
	private int strength;
	//@OneToOne
	//private Powers power;  //agent knows about the power as , power's object is updated in agent class.
	@OneToMany
	private List<Powers> power = new ArrayList<Powers>();
	
	public List<Powers> getPower() {
		return power;
	}
	public void setPower(List<Powers> power) {
		this.power = power;
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Agent [aid=" + aid + ", name=" + name + ", strength=" + strength + "]";
	}
	
	

}
