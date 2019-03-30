package com.chuange.aishijing.pojo.recommendmanage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 热门剧本
 */
@Entity
@Table(name="ASJ_HOTCAST")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class HotCast {
	@Id
	@NotNull
	@GeneratedValue(generator="system_uuid")
	@GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String castname;//剧本名称
	private String castId;
	private String recommend;//推荐位
	private String recommendValue;//推荐位值
	private String status;//状态

	public HotCast(){}

	public HotCast(String castname, String castId, String recommend, String recommendValue, String status) {
		this.castname = castname;
		this.castId = castId;
		this.recommend = recommend;
		this.recommendValue = recommendValue;
		this.status = status;
	}

	@Override
	public String toString() {
		return "HotCast{" +
				"id='" + id + '\'' +
				", castname='" + castname + '\'' +
				", castId='" + castId + '\'' +
				", recommend='" + recommend + '\'' +
				", recommendValue='" + recommendValue + '\'' +
				", status='" + status + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCastname() {
		return castname;
	}

	public void setCastname(String castname) {
		this.castname = castname;
	}

	public String getCastId() {
		return castId;
	}

	public void setCastId(String castId) {
		this.castId = castId;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getRecommendValue() {
		return recommendValue;
	}

	public void setRecommendValue(String recommendValue) {
		this.recommendValue = recommendValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
