package com.chuange.aishijing.pojo.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASJ_MYCOLLECTIONS")
public class MyCollections {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private long userid;//用户ID
    private String roleid;//收藏角色ID
    private String actorid;//收藏用户ID
    private String dramaid;//收藏剧本ID
    private String videoid;//收藏视频ID
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getActorid() {
		return actorid;
	}
	public void setActorid(String actorid) {
		this.actorid = actorid;
	}
	public String getDramaid() {
		return dramaid;
	}
	public void setDramaid(String dramaid) {
		this.dramaid = dramaid;
	}
	public String getVideoid() {
		return videoid;
	}
	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}
	public MyCollections() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
