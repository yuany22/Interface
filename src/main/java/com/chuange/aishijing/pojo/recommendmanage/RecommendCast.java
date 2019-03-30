package com.chuange.aishijing.pojo.recommendmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 推荐剧本表
 */
@Entity
@Table(name="ASJ_RECOMMENDCAST")
public class RecommendCast {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String castId;//剧本ID
	private String castname;//剧本名称
	private String showterminal;//展示终端
	private String status;//启用状态
	private Integer recommendOrder;//排序值
	
	public Integer getRecommendOrder() {
		return recommendOrder;
	}
	public void setRecommendOrder(Integer recommendOrder) {
		this.recommendOrder = recommendOrder;
	}
	public String getCastId() {
		return castId;
	}
	public void setCastId(String castId) {
		this.castId = castId;
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
	public String getShowterminal() {
		return showterminal;
	}
	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RecommendCast(@NotNull String id, String castId, String castname, String showterminal, String status,
			Integer recommendOrder) {
		super();
		this.id = id;
		this.castId = castId;
		this.castname = castname;
		this.showterminal = showterminal;
		this.status = status;
		this.recommendOrder = recommendOrder;
	}
	@Override
	public String toString() {
		return "RecommendCast [id=" + id + ", castId=" + castId + ", castname=" + castname + ", showterminal="
				+ showterminal + ", status=" + status + ", recommendOrder=" + recommendOrder + "]";
	}
	public RecommendCast() {
		super();
		// TODO Auto-generated constructor stub
	}
}
