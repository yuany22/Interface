package com.chuange.aishijing.pojo.classessys;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 
 * @author yuany
 * 课程评价表
 */
@Entity
@Table(name="ASJ_CLASSCOMMENTS")
public class ClassComments {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = true)
	@CreatedDate
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date commentTime;//评论时间
	private String commentUser;//评论用户
	private String classId;//关联课程id
	private Long userId;//用户id
	private String classname;//课程名称
	private String commentContent;//评价内容
	private Integer commentScore;//评论分数

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Integer getCommentScore() {
		return commentScore;
	}

	public void setCommentScore(Integer commentScore) {
		this.commentScore = commentScore;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentUser() {
		return commentUser;
	}
	public void setCommentUser(String commentUser) {
		this.commentUser = commentUser;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	@Override
	public String toString() {
		return "ClassComments [id=" + id + ", commentTime=" + commentTime + ", commentUser=" + commentUser + ", userId="
				+ userId + ", classname=" + classname + ", commentContent=" + commentContent + "]";
	}

	public ClassComments(Date commentTime, String commentUser, String classId, Long userId, String classname, String commentContent, Integer commentScore) {
		this.commentTime = commentTime;
		this.commentUser = commentUser;
		this.classId = classId;
		this.userId = userId;
		this.classname = classname;
		this.commentContent = commentContent;
		this.commentScore = commentScore;
	}

	public ClassComments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
