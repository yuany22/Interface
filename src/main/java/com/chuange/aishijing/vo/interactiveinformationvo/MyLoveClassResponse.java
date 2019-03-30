package com.chuange.aishijing.vo.interactiveinformationvo;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Administrator on 2019-03-06.
 */
public class MyLoveClassResponse {
    private String teacher;
    private String classtitle;
    private String classCover;
    private Double price;
    private Double score;
    private Integer buyNum;
    private String castIntroduce;

    public MyLoveClassResponse(){}

    public MyLoveClassResponse(String teacher, String classtitle, String classCover, Double price, Double score, Integer buyNum, String castIntroduce) {
        this.teacher = teacher;
        this.classtitle = classtitle;
        this.classCover = classCover;
        this.price = price;
        this.score = score;
        this.buyNum = buyNum;
        this.castIntroduce = castIntroduce;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClasstitle() {
        return classtitle;
    }

    public void setClasstitle(String classtitle) {
        this.classtitle = classtitle;
    }

    public String getClassCover() {
        return classCover;
    }

    public void setClassCover(String classCover) {
        this.classCover = classCover;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getCastIntroduce() {
        return castIntroduce;
    }

    public void setCastIntroduce(String castIntroduce) {
        this.castIntroduce = castIntroduce;
    }
}
