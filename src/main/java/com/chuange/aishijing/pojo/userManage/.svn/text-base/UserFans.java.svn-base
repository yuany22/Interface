package com.chuange.aishijing.pojo.userManage;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 粉丝表
 */
@Entity
@Table(name="ASJ_USERFANS")
public class UserFans {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userID;//用户ID
    private String attentionID;//关注用户ID
	@CreatedDate
	@Column(name = "create_time")
	@Temporal(TemporalType.DATE)
	private Date createTime;
    private int flag;//是否关注我 0 不关注 1 关注


	public UserFans(@NotNull Long id, String userID, String attentionID,Date createTime, int flag) {
		super();
		this.id = id;
		this.userID = userID;
		this.attentionID = attentionID;
		this.createTime = createTime;
		this.flag = flag;
	}


	@Override
	public String toString() {
		return "UserFans [id=" + id + ", userID=" + userID + ", attentionID=" + attentionID + ", flag=" + flag + "]";
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFlag() {
		return flag;
	}


	public void setFlag(int flag) {
		this.flag = flag;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getAttentionID() {
		return attentionID;
	}


	public void setAttentionID(String attentionID) {
		this.attentionID = attentionID;
	}


	public UserFans() {
		super();
		// TODO Auto-generated constructor stub
	}


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
