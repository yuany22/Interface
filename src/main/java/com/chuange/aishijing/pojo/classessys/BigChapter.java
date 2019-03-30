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
@Table(name="ASJ_BIGCHAPTER")
public class BigChapter {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String classesId;
    private String bigChapterTitle;

    public BigChapter(){}

    public BigChapter(String classesId, String bigChapterTitle) {
        this.classesId = classesId;
        this.bigChapterTitle = bigChapterTitle;
    }

    @Override
    public String toString() {
        return "BigChapter{" +
                "id='" + id + '\'' +
                ", classesId='" + classesId + '\'' +
                ", bigChapterTitle='" + bigChapterTitle + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getBigChapterTitle() {
        return bigChapterTitle;
    }

    public void setBigChapterTitle(String bigChapterTitle) {
        this.bigChapterTitle = bigChapterTitle;
    }
}
