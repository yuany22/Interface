package com.chuange.aishijing.pojo.userManage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-07.
 * 封号信息
 */
@Entity
@Table(name="ASJ_USERSEALINFORMATION")
public class UserSealInformation {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private Long userId;//关联用户id
    private String userStatus;//当前用户状态
    private String freezingPeriod;//冻结周期
    private String remark;//备注
    
    public UserSealInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "UserSealInformation{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", freezingPeriod='" + freezingPeriod + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public UserSealInformation(Long userId, String userStatus, String freezingPeriod, String remark) {
        this.userId = userId;
        this.userStatus = userStatus;
        this.freezingPeriod = freezingPeriod;
        this.remark = remark;
    }


    public String	getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getFreezingPeriod() {
        return freezingPeriod;
    }

    public void setFreezingPeriod(String freezingPeriod) {
        this.freezingPeriod = freezingPeriod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
