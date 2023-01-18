package com.packHibernate.firstHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataSave {

	@Id
	private int aid;
	private String aname;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "DataSave [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
