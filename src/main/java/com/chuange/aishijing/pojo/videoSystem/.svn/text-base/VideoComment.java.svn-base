package com.chuange.aishijing.pojo.videoSystem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 */
@Entity
@Table(name="ASJ_VIDEOCOMMENT")
public class VideoComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentTime;//评论时间
    private String commentUser;//被评论用户ID
    private Long userId;//评论用户
    private String commentedVideo;//被评论视频
    private String commentContent;//评论内容
    private String commentStatus;//评论状态
    
    public VideoComment() {
		super();
		// TODO Auto-generated constructor stub
	}


    public VideoComment(@NotNull Long id, Date commentTime, String commentUser, Long userId, String commentedVideo,
			String commentContent, String commentStatus) {
		super();
		this.id = id;
		this.commentTime = commentTime;
		this.commentUser = commentUser;
		this.userId = userId;
		this.commentedVideo = commentedVideo;
		this.commentContent = commentContent;
		this.commentStatus = commentStatus;
	}


	@Override
	public String toString() {
		return "VideoComment [id=" + id + ", commentTime=" + commentTime + ", commentUser=" + commentUser + ", userId="
				+ userId + ", commentedVideo=" + commentedVideo + ", commentContent=" + commentContent
				+ ", commentStatus=" + commentStatus + "]";
	}


	public String getCommentStatus() {
		return commentStatus;
	}


	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
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

    public String getCommentedVideo() {
        return commentedVideo;
    }

    public void setCommentedVideo(String commentedVideo) {
        this.commentedVideo = commentedVideo;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
