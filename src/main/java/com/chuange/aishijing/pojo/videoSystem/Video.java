package com.chuange.aishijing.pojo.videoSystem;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 视频信息
 */
@Entity
@Table(name="ASJ_VIDEO")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"}) 
public class Video {
    @Id
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String publisher;//发布人
    private Long userId;//关联用户id
    private String castid;//关联剧本id
    private String roleid;//关联角色id
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date publishTime;//发布时间
    private String videoName;//视频名称
    private String videoUrl;//视频
    private String scripts;//所属剧本
    private String role;//角色
    private String clicks;//点击量
    private String reviewNumber;//点评数
    private String commentsNumber;//评论数
    private String musicScore;//声乐评分
    private String textScore;//台词评分
    private String bodyScore;//形体评分
    private String actorScore;//表演评分
    private String videoStatus;//视频状态
    private String vedioType;//视频类型 0 推荐 1 热门 2 试镜 3 普通

    public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", publisher=" + publisher + ", userId=" + userId + ", castid=" + castid
				+ ", roleid=" + roleid + ", publishTime=" + publishTime + ", videoName=" + videoName + ", videoUrl="
				+ videoUrl + ", scripts=" + scripts + ", role=" + role + ", clicks=" + clicks + ", reviewNumber="
				+ reviewNumber + ", commentsNumber=" + commentsNumber + ", musicScore=" + musicScore + ", textScore="
				+ textScore + ", bodyScore=" + bodyScore + ", actorScore=" + actorScore + ", videoStatus=" + videoStatus
				+ ", vedioType=" + vedioType + "]";
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getCastid() {
		return castid;
	}




	public void setCastid(String castid) {
		this.castid = castid;
	}




	public String getVedioType() {
		return vedioType;
	}


	public void setVedioType(String vedioType) {
		this.vedioType = vedioType;
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

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getScripts() {
        return scripts;
    }

    public void setScripts(String scripts) {
        this.scripts = scripts;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getReviewNumber() {
        return reviewNumber;
    }

    public void setReviewNumber(String reviewNumber) {
        this.reviewNumber = reviewNumber;
    }

    public String getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(String commentsNumber) {
        this.commentsNumber = commentsNumber;
    }


    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus;
    }
}
