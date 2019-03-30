package com.chuange.aishijing.pojo.recommendmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 标签
 */
@Entity
@Table(name="ASJ_LABLE")
public class Lable {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	@Column(name="lable_id")
	private String id;
	private String lablename;//标签名
	private String labletype;//所属分类
	private String lablestatus;//启用状态
	private String lablevalue;//标签值
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLablename() {
		return lablename;
	}

	public void setLablename(String lablename) {
		this.lablename = lablename;
	}

	public String getLabletype() {
		return labletype;
	}

	public void setLabletype(String labletype) {
		this.labletype = labletype;
	}

	public String getLablestatus() {
		return lablestatus;
	}

	public void setLablestatus(String lablestatus) {
		this.lablestatus = lablestatus;
	}

	public String getLablevalue() {
		return lablevalue;
	}

	public void setLablevalue(String lablevalue) {
		this.lablevalue = lablevalue;
	}

	public Lable(@NotNull String id, String lablename, String labletype, String lablestatus, String lablevalue) {
		super();
		this.id = id;
		this.lablename = lablename;
		this.labletype = labletype;
		this.lablestatus = lablestatus;
		this.lablevalue = lablevalue;
	}

	@Override
	public String toString() {
		return "Lable [id=" + id + ", lablename=" + lablename + ", labletype=" + labletype + ", lablestatus="
				+ lablestatus + ", lablevalue=" + lablevalue + "]";
	}

	public Lable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
