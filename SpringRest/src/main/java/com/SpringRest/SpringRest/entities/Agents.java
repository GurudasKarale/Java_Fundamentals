package com.SpringRest.SpringRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
public class Agents {

	@Id
	private long aid;
	private String aname;
	private String power;
	
	public Agents(long aid, String aname, String power) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.power = power;
	}

	public Agents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
}
