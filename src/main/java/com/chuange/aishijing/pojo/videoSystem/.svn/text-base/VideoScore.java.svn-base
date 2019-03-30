package com.chuange.aishijing.pojo.videoSystem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 */
@Entity
@Table(name="ASJ_VIDEO_SCORE")
public class VideoScore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentTime;//打分时间
    private Long userId;//被评论用户
    private String videoID;//被打分视频
    private String musicScore;//声乐评分
    private String textScore;//台词评分
    private String bodyScore;//形体评分
    private String actorScore;//表演评分
    @Transient
    private Integer count;//评分数
    public VideoScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VideoScore(Long id, Date commentTime, Long userId, String videoID, String musicScore, String textScore,
			String bodyScore, String actorScore, Integer count) {
		super();
		this.id = id;
		this.commentTime = commentTime;
		this.userId = userId;
		this.videoID = videoID;
		this.musicScore = musicScore;
		this.textScore = textScore;
		this.bodyScore = bodyScore;
		this.actorScore = actorScore;
		this.count = count;
	}



	public Integer getCount() {
		return count;
	}



	public void setCount(Integer count) {
		this.count = count;
	}



	public String getVideoID() {
		return videoID;
	}



	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}



	public String getMusicScore() {
		return musicScore;
	}


	public void setMusicScore(String musicScore) {
		this.musicScore = musicScore;
	}



	public String getTextScore() {
		return textScore;
	}





	public void setTextScore(String textScore) {
		this.textScore = textScore;
	}





	public String getBodyScore() {
		return bodyScore;
	}





	public void setBodyScore(String bodyScore) {
		this.bodyScore = bodyScore;
	}





	public String getActorScore() {
		return actorScore;
	}





	public void setActorScore(String actorScore) {
		this.actorScore = actorScore;
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


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
