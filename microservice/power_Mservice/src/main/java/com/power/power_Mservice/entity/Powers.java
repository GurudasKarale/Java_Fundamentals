package com.power.power_Mservice.entity;

public class Powers {

	
	private Long pid;
	private String powername;
	private String poweruse;
	
	private Long agentid;

	public Powers(Long pid, String powername, String poweruse, Long agentid) {
		super();
		this.pid = pid;
		this.powername = powername;
		this.poweruse = poweruse;
		this.agentid = agentid;
	}

	public Powers() {
		super();
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPowername() {
		return powername;
	}

	public void setPowername(String powername) {
		this.powername = powername;
	}

	public String getPoweruse() {
		return poweruse;
	}

	public void setPoweruse(String poweruse) {
		this.poweruse = poweruse;
	}

	public Long getAgentid() {
		return agentid;
	}

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	
	
}
