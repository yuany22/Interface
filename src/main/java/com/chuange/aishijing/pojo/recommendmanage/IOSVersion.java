package com.chuange.aishijing.pojo.recommendmanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASJ_IOSVERSION")
public class IOSVersion {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String IOSVersion;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIOSVersion() {
		return IOSVersion;
	}
	public void setIOSVersion(String iOSVersion) {
		IOSVersion = iOSVersion;
	}
	public IOSVersion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IOSVersion [id=" + id + ", IOSVersion=" + IOSVersion + "]";
	}
	
}
