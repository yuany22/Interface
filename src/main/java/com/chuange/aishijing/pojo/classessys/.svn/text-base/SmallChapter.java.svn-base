package com.chuange.aishijing.pojo.classessys;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-12-10.
 */
@Entity
@Table(name="ASJ_SMALLCHAPTER")
public class SmallChapter {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String bigChapterId;
    private String smallChapterTitle;
    private String courseUrl;
    private String videoUrl;

    public SmallChapter(){}

    public SmallChapter(String bigChapterId, String smallChapterTitle, String courseUrl, String videoUrl) {
        this.bigChapterId = bigChapterId;
        this.smallChapterTitle = smallChapterTitle;
        this.courseUrl = courseUrl;
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "SmallChapter{" +
                "id='" + id + '\'' +
                ", bigChapterId='" + bigChapterId + '\'' +
                ", smallChapterTitle='" + smallChapterTitle + '\'' +
                ", courseUrl='" + courseUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }

    public String getSmallChapterTitle() {
        return smallChapterTitle;
    }

    public void setSmallChapterTitle(String smallChapterTitle) {
        this.smallChapterTitle = smallChapterTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBigChapterId() {
        return bigChapterId;
    }

    public void setBigChapterId(String bigChapterId) {
        this.bigChapterId = bigChapterId;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
