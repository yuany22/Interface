package com.chuange.aishijing.vo.servicevo.classes;

/**
 * Created by Administrator on 2018-12-12.
 */
public class BigChapterRequest {
    private String classesId;
    private String bigChapterTitle;
    public BigChapterRequest(){}

    public BigChapterRequest(String classesId, String bigChapterTitle) {
        this.classesId = classesId;
        this.bigChapterTitle = bigChapterTitle;
    }

    @Override
    public String toString() {
        return "BigChapterRequest{" +
                "classesId='" + classesId + '\'' +
                ", bigChapterTitle='" + bigChapterTitle + '\'' +
                '}';
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
