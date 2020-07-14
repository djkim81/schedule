package com.pilot.schedule;

import java.util.Date;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Schedule_table")
public class Schedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String resveDe;
	private String resveTm;
	private String bldCode;
	private Integer healthkeeperId;
	private String bedCode;
	private String canclYn;
	private Date regDt;
	
	@PostPersist
	public void doPostPersist() {
		ScheduleRegistered scheduleRegistered = new ScheduleRegistered();
		BeanUtils.copyProperties(this, scheduleRegistered);
		scheduleRegistered.publishAfterCommit();
	}
	
	@PostUpdate
	public void doPostUpdate() {
		ScheduleCanceled scheduleCanceled = new ScheduleCanceled();
		BeanUtils.copyProperties(this, scheduleCanceled);
		scheduleCanceled.publishAfterCommit();
	}
	
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
	public Integer getHealthkeeperId() {
		return healthkeeperId;
	}
	public void setHealthkeeperId(Integer healthkeeperId) {
		this.healthkeeperId = healthkeeperId;
	}
	public String getBedCode() {
		return bedCode;
	}
	public void setBedCode(String bedCode) {
		this.bedCode = bedCode;
	}
	public String getCanclYn() {
		return canclYn;
	}
	public void setCanclYn(String canclYn) {
		this.canclYn = canclYn;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
}
