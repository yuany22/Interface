package com.chuange.aishijing.pojo.checkSystem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author yuany
 * 星认证
 */

@Entity
@Table(name="ASJ_STARCERTIFIED")
public class StarCertified {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;//用户昵称
	private String userid;//用户id
	private String certifiedFlag;//认证头衔
	private String workProof;//工作证明
	private String otherProof;//其他证名
	private String handleStatus;//处理状态
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCertifiedFlag() {
		return certifiedFlag;
	}
	public void setCertifiedFlag(String certifiedFlag) {
		this.certifiedFlag = certifiedFlag;
	}
	public String getWorkProof() {
		return workProof;
	}
	public void setWorkProof(String workProof) {
		this.workProof = workProof;
	}
	public String getOtherProof() {
		return otherProof;
	}
	public void setOtherProof(String otherProof) {
		this.otherProof = otherProof;
	}
	public String getHandleStatus() {
		return handleStatus;
	}
	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StarCertified [id=" + id + ", username=" + username + ", userid=" + userid + ", certifiedFlag="
				+ certifiedFlag + ", workProof=" + workProof + ", otherProof=" + otherProof + ", handleStatus="
				+ handleStatus + "]";
	}
	public StarCertified( long id, String username, String userid, String certifiedFlag, String workProof,
			String otherProof, String handleStatus) {
		super();
		this.id = id;
		this.username = username;
		this.userid = userid;
		this.certifiedFlag = certifiedFlag;
		this.workProof = workProof;
		this.otherProof = otherProof;
		this.handleStatus = handleStatus;
	}
	public StarCertified() {
		super();
		// TODO Auto-generated constructor stub
	}
}
