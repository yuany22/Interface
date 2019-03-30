package com.chuange.aishijing.pojo.userManage;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 视频举报管理
 */
@Entity
@Table(name="ASJ_VIDEOANDCOMMENTREPORTMANAGER")
public class VideoAndCommentReportManager {
    @Id
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date reportTime;//举报时间
    private String reportedTel;//被举报人手机号
    private Long reportedId;//被举报人id
    private String reportedName;//被举报人昵称
    private String reportedVideo ;//被举报视频
    private Long reportedContentId;//被举报内容关联ID
    private Long reportedVideoId;//被举报内容关联ID
    private String reportedContent ;//被举报内容
    private String reportType;//举报类型
    private String reporter;//举报人
    private String reporterId;//举报人
    private String reportDescription;//举报描述
    private String processStatus;//处理状态
    private String processResult;//处理结果
    private String reportCategory;//举报分类(视频举报，评论举报)


    public VideoAndCommentReportManager(@NotNull String id, Date reportTime, String reportedTel, Long reportedId,
			String reportedName, String reportedVideo, Long reportedContentId, Long reportedVideoId,
			String reportedContent, String reportType, String reporter, String reporterId, String reportDescription,
			String processStatus, String processResult, String reportCategory) {
		super();
		this.id = id;
		this.reportTime = reportTime;
		this.reportedTel = reportedTel;
		this.reportedId = reportedId;
		this.reportedName = reportedName;
		this.reportedVideo = reportedVideo;
		this.reportedContentId = reportedContentId;
		this.reportedVideoId = reportedVideoId;
		this.reportedContent = reportedContent;
		this.reportType = reportType;
		this.reporter = reporter;
		this.reporterId = reporterId;
		this.reportDescription = reportDescription;
		this.processStatus = processStatus;
		this.processResult = processResult;
		this.reportCategory = reportCategory;
	}


	@Override
	public String toString() {
		return "VideoAndCommentReportManager [id=" + id + ", reportTime=" + reportTime + ", reportedTel=" + reportedTel
				+ ", reportedId=" + reportedId + ", reportedName=" + reportedName + ", reportedVideo=" + reportedVideo
				+ ", reportedContentId=" + reportedContentId + ", reportedVideoId=" + reportedVideoId
				+ ", reportedContent=" + reportedContent + ", reportType=" + reportType + ", reporter=" + reporter
				+ ", reporterId=" + reporterId + ", reportDescription=" + reportDescription + ", processStatus="
				+ processStatus + ", processResult=" + processResult + ", reportCategory=" + reportCategory + "]";
	}


	public VideoAndCommentReportManager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getReportedVideoId() {
		return reportedVideoId;
	}




	public void setReportedVideoId(Long reportedVideoId) {
		this.reportedVideoId = reportedVideoId;
	}




	public Long getReportedContentId() {
		return reportedContentId;
	}


	public void setReportedContentId(Long reportedContentId) {
		this.reportedContentId = reportedContentId;
	}


	public String getReporterId() {
		return reporterId;
	}


	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}


	public String getReportedContent() {
		return reportedContent;
	}

	public void setReportedContent(String reportedContent) {
		this.reportedContent = reportedContent;
	}

	public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportedTel() {
        return reportedTel;
    }

    public void setReportedTel(String reportedTel) {
        this.reportedTel = reportedTel;
    }

    public Long getReportedId() {
        return reportedId;
    }

    public void setReportedId(Long reportedId) {
        this.reportedId = reportedId;
    }

    public String getReportedName() {
        return reportedName;
    }

    public void setReportedName(String reportedName) {
        this.reportedName = reportedName;
    }

    public String getReportedVideo() {
        return reportedVideo;
    }

    public void setReportedVideo(String reportedVideo) {
        this.reportedVideo = reportedVideo;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}
