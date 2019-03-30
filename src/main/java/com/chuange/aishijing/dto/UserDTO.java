package com.chuange.aishijing.dto;

import java.util.Date;

public class UserDTO {
	private Date logintimefrom;
	private Date registtimefrom;
	private Date logintimeto;
	private Date registtimeto;
	private String heightfrom;
	private String heightto;
	private String weightfrom;
	private String weightto;
	private String sex;//性别
	private String agefrom;
	private String ageto;
	private String authenticationType;
	private String special;
	private String job;
	public Date getLogintimefrom() {
		return logintimefrom;
	}
	public void setLogintimefrom(Date logintimefrom) {
		this.logintimefrom = logintimefrom;
	}
	public Date getRegisttimefrom() {
		return registtimefrom;
	}
	public void setRegisttimefrom(Date registtimefrom) {
		this.registtimefrom = registtimefrom;
	}
	public Date getLogintimeto() {
		return logintimeto;
	}
	public void setLogintimeto(Date logintimeto) {
		this.logintimeto = logintimeto;
	}
	public Date getRegisttimeto() {
		return registtimeto;
	}
	public void setRegisttimeto(Date registtimeto) {
		this.registtimeto = registtimeto;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAgefrom() {
		return agefrom;
	}
	public void setAgefrom(String agefrom) {
		this.agefrom = agefrom;
	}
	public String getAgeto() {
		return ageto;
	}
	public void setAgeto(String ageto) {
		this.ageto = ageto;
	}
	public String getHeightfrom() {
		return heightfrom;
	}
	public void setHeightfrom(String heightfrom) {
		this.heightfrom = heightfrom;
	}
	public String getHeightto() {
		return heightto;
	}
	public void setHeightto(String heightto) {
		this.heightto = heightto;
	}
	public String getWeightfrom() {
		return weightfrom;
	}
	public void setWeightfrom(String weightfrom) {
		this.weightfrom = weightfrom;
	}
	public String getWeightto() {
		return weightto;
	}
	public void setWeightto(String weightto) {
		this.weightto = weightto;
	}
	
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "UserDTO [logintimefrom=" + logintimefrom + ", registtimefrom=" + registtimefrom + ", logintimeto="
				+ logintimeto + ", registtimeto=" + registtimeto + ", heightfrom=" + heightfrom + ", heightto="
				+ heightto + ", weightfrom=" + weightfrom + ", weightto=" + weightto + ", sex=" + sex + ", agefrom="
				+ agefrom + ", ageto=" + ageto + ", authenticationType=" + authenticationType + ", special=" + special
				+ ", job=" + job + "]";
	}
	public UserDTO(Date logintimefrom, Date registtimefrom, Date logintimeto, Date registtimeto, String heightfrom,
			String heightto, String weightfrom, String weightto, String sex, String agefrom, String ageto,
			String authenticationType, String special, String job) {
		super();
		this.logintimefrom = logintimefrom;
		this.registtimefrom = registtimefrom;
		this.logintimeto = logintimeto;
		this.registtimeto = registtimeto;
		this.heightfrom = heightfrom;
		this.heightto = heightto;
		this.weightfrom = weightfrom;
		this.weightto = weightto;
		this.sex = sex;
		this.agefrom = agefrom;
		this.ageto = ageto;
		this.authenticationType = authenticationType;
		this.special = special;
		this.job = job;
	}
	
}
