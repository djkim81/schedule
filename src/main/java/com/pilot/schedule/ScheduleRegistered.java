package com.pilot.schedule;

import java.util.Date;

public class ScheduleRegistered extends AbstractEvent {
	
	private Long id;
	private String resveDe;
	private String resveTm;
	private String bldCode;
	private Long healthkeeperId;
	private String bedCode;
	private Date regDt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResveDe() {
		return resveDe;
	}
	public void setResveDe(String resveDe) {
		this.resveDe = resveDe;
	}
	public String getResveTm() {
		return resveTm;
	}
	public void setResveTm(String resveTm) {
		this.resveTm = resveTm;
	}
	public String getBldCode() {
		return bldCode;
	}
	public void setBldCode(String bldCode) {
		this.bldCode = bldCode;
	}
	public Long getHealthkeeperId() {
		return healthkeeperId;
	}
	public void setHealthkeeperId(Long healthkeeperId) {
		this.healthkeeperId = healthkeeperId;
	}
	public String getBedCode() {
		return bedCode;
	}
	public void setBedCode(String bedCode) {
		this.bedCode = bedCode;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	
}
