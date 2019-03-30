package com.chuange.aishijing.vo.servicevo.classes;

import com.chuange.aishijing.pojo.classessys.SmallChapter;

import java.util.List;

/**
 * Created by Administrator on 2018-12-11.
 */
public class BigChapterResponse {
    private String id;
    private String bigChapterTitle;
    private List<SmallChapter> smallChapterList;
    public BigChapterResponse(){}

    public BigChapterResponse(String id, String bigChapterTitle, List<SmallChapter> smallChapterList) {
        this.id = id;
        this.bigChapterTitle = bigChapterTitle;
        this.smallChapterList = smallChapterList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BigChapterResponse{" +
                "bigChapterTitle='" + bigChapterTitle + '\'' +
                ", smallChapterList=" + smallChapterList +
                '}';
    }

    public String getBigChapterTitle() {
        return bigChapterTitle;
    }

    public void setBigChapterTitle(String bigChapterTitle) {
        this.bigChapterTitle = bigChapterTitle;
    }

    public List<SmallChapter> getSmallChapterList() {
        return smallChapterList;
    }

    public void setSmallChapterList(List<SmallChapter> smallChapterList) {
        this.smallChapterList = smallChapterList;
    }
}
