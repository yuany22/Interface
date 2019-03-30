package com.chuange.aishijing.pojo.recommendmanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASJ_ANDROID")
public class AndroidVersion {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String AndrioidVersion;
	private String packagePath;
	private String upPath;
	
	public String getAndrioidVersion() {
		return AndrioidVersion;
	}
	public void setAndrioidVersion(String andrioidVersion) {
		AndrioidVersion = andrioidVersion;
	}
	public String getPackagePath() {
		return packagePath;
	}
	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}
	public String getUpPath() {
		return upPath;
	}
	public void setUpPath(String upPath) {
		this.upPath = upPath;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public AndroidVersion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AndroidVersion [id=" + id + ", AndrioidVersion=" + AndrioidVersion + ", packagePath=" + packagePath
				+ ", upPath=" + upPath + "]";
	}
	
}
