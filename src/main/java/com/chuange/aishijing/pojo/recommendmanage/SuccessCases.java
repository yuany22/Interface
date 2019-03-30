package com.chuange.aishijing.pojo.recommendmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 成功案例表
 */
@Entity
@Table(name="ASJ_SUCCESSCASES")
public class SuccessCases {
	@Id
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String recommendor;//推荐人
	private String recoimg;//推荐人封面
	private String cosplayer;//饰演角色
	private String Castname;//所属剧本
	@Column(nullable=false)
	private String roleid;//角色ID
	@Column(nullable=false)
	private String castid;//剧本ID
	@Column(unique=true)
	private Integer recommendorder;//序号
	private String linkto;//跳转链接
	private Integer linktyppe;//链接种类
	@Column(nullable=false)
	private String usestatus;//启动状态
	
	public String getUsestatus() {
		return usestatus;
	}
	public void setUsestatus(String usestatus) {
		this.usestatus = usestatus;
	}
	public Integer getLinktyppe() {
		return linktyppe;
	}
	public void setLinktyppe(Integer linktyppe) {
		this.linktyppe = linktyppe;
	}
	public String getLinkto() {
		return linkto;
	}
	public void setLinkto(String linkto) {
		this.linkto = linkto;
	}
	public Integer getRecommendorder() {
		return recommendorder;
	}
	public void setRecommendorder(Integer recommendorder) {
		this.recommendorder = recommendorder;
	}
	public String getRecoimg() {
		return recoimg;
	}
	public void setRecoimg(String recoimg) {
		this.recoimg = recoimg;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getCastid() {
		return castid;
	}
	public void setCastid(String castid) {
		this.castid = castid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommendor() {
		return recommendor;
	}
	public void setRecommendor(String recommendor) {
		this.recommendor = recommendor;
	}
	public String getCosplayer() {
		return cosplayer;
	}
	public void setCosplayer(String cosplayer) {
		this.cosplayer = cosplayer;
	}
	public String getCastname() {
		return Castname;
	}
	public void setCastname(String castname) {
		Castname = castname;
	}
	
	public SuccessCases(@NotNull String id, String recommendor, String recoimg, String cosplayer, String castname,
			String roleid, String castid, Integer recommendorder, String linkto, Integer linktyppe, String usestatus) {
		super();
		this.id = id;
		this.recommendor = recommendor;
		this.recoimg = recoimg;
		this.cosplayer = cosplayer;
		Castname = castname;
		this.roleid = roleid;
		this.castid = castid;
		this.recommendorder = recommendorder;
		this.linkto = linkto;
		this.linktyppe = linktyppe;
		this.usestatus = usestatus;
	}
	@Override
	public String toString() {
		return "SuccessCases [id=" + id + ", recommendor=" + recommendor + ", recoimg=" + recoimg + ", cosplayer="
				+ cosplayer + ", Castname=" + Castname + ", roleid=" + roleid + ", castid=" + castid
				+ ", recommendorder=" + recommendorder + ", linkto=" + linkto + ", linktyppe=" + linktyppe
				+ ", usestatus=" + usestatus + "]";
	}
	public SuccessCases() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
