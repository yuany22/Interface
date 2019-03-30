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
 * 热门角色
 */
@Entity
@Table(name="ASJ_HOTROLE")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class HotRole {
	@Id
	@NotNull
	@GeneratedValue(generator="system_uuid")
	@GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String roleName;//角色名称
	private String roleCast;//角色所属脚本
	private String castId;
	private String recommend;//推荐位
	private String recommendValue;//推荐位值
	private String status;//状态

	public HotRole(){}

	@Override
	public String toString() {
		return "HotRole{" +
				"id='" + id + '\'' +
				", roleName='" + roleName + '\'' +
				", roleCast='" + roleCast + '\'' +
				", castId='" + castId + '\'' +
				", recommend='" + recommend + '\'' +
				", recommendValue='" + recommendValue + '\'' +
				", status='" + status + '\'' +
				'}';
	}

	public HotRole(String roleName, String roleCast, String castId, String recommend, String recommendValue, String status) {
		this.roleName = roleName;
		this.roleCast = roleCast;
		this.castId = castId;
		this.recommend = recommend;
		this.recommendValue = recommendValue;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCast() {
		return roleCast;
	}

	public void setRoleCast(String roleCast) {
		this.roleCast = roleCast;
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
