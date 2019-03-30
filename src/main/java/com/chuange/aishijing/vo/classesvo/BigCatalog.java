package com.chuange.aishijing.vo.classesvo;

import com.chuange.aishijing.pojo.classessys.SmallChapter;

import java.util.List;

/**
 * Created by Administrator on 2019-03-01.
 */
public class BigCatalog {
    private String id;
    private String bigChapterTitle;
    private List<SmallCatalog> smallCatalogs;
    public BigCatalog(){};
    public BigCatalog(String id, String bigChapterTitle, List<SmallCatalog> smallCatalogs) {
        this.id = id;
        this.bigChapterTitle = bigChapterTitle;
        this.smallCatalogs = smallCatalogs;
    }

    @Override
    public String toString() {
        return "BigCatalog{" +
                "id='" + id + '\'' +
                ", bigChapterTitle='" + bigChapterTitle + '\'' +
                ", smallCatalogs=" + smallCatalogs +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBigChapterTitle() {
        return bigChapterTitle;
    }

    public void setBigChapterTitle(String bigChapterTitle) {
        this.bigChapterTitle = bigChapterTitle;
    }

    public List<SmallCatalog> getSmallCatalogs() {
        return smallCatalogs;
    }

    public void setSmallCatalogs(List<SmallCatalog> smallCatalogs) {
        this.smallCatalogs = smallCatalogs;
    }
}
