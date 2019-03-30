package com.chuange.aishijing.vo.classesvo;

import java.util.List;

/**
 * Created by Administrator on 2019-03-01.
 */
public class ClassesIntroduceResponse {
    private String classtitle;
    private String classCover;
    private Integer buyNum;
    private Double score;
    private Double price;
    private String castIntroduce;
    private String teacherNameReal;
    private String teacherPicture;
    private String organization;
    private String teacherProfile;
    private List<BigCatalog> bigCatalogList;
    private List<CommentResponse> commentResponses;
    public ClassesIntroduceResponse(){};
    public ClassesIntroduceResponse(String classtitle, String classCover, Integer buyNum, Double score, Double price, String castIntroduce, String teacherNameReal, String teacherPicture, String organization, String teacherProfile, List<BigCatalog> bigCatalogList, List<CommentResponse> commentResponses) {
        this.classtitle = classtitle;
        this.classCover = classCover;
        this.buyNum = buyNum;
        this.score = score;
        this.price = price;
        this.castIntroduce = castIntroduce;
        this.teacherNameReal = teacherNameReal;
        this.teacherPicture = teacherPicture;
        this.organization = organization;
        this.teacherProfile = teacherProfile;
        this.bigCatalogList = bigCatalogList;
        this.commentResponses = commentResponses;
    }

    @Override
    public String toString() {
        return "ClassesIntroduceResponse{" +
                "classtitle='" + classtitle + '\'' +
                ", classCover='" + classCover + '\'' +
                ", buyNum=" + buyNum +
                ", score='" + score + '\'' +
                ", price='" + price + '\'' +
                ", castIntroduce='" + castIntroduce + '\'' +
                ", teacherNameReal='" + teacherNameReal + '\'' +
                ", teacherPicture='" + teacherPicture + '\'' +
                ", organization='" + organization + '\'' +
                ", teacherProfile='" + teacherProfile + '\'' +
                ", bigCatalogList=" + bigCatalogList +
                ", commentResponses=" + commentResponses +
                '}';
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

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCastIntroduce() {
        return castIntroduce;
    }

    public void setCastIntroduce(String castIntroduce) {
        this.castIntroduce = castIntroduce;
    }

    public String getTeacherNameReal() {
        return teacherNameReal;
    }

    public void setTeacherNameReal(String teacherNameReal) {
        this.teacherNameReal = teacherNameReal;
    }

    public String getTeacherPicture() {
        return teacherPicture;
    }

    public void setTeacherPicture(String teacherPicture) {
        this.teacherPicture = teacherPicture;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTeacherProfile() {
        return teacherProfile;
    }

    public void setTeacherProfile(String teacherProfile) {
        this.teacherProfile = teacherProfile;
    }

    public List<BigCatalog> getBigCatalogList() {
        return bigCatalogList;
    }

    public void setBigCatalogList(List<BigCatalog> bigCatalogList) {
        this.bigCatalogList = bigCatalogList;
    }

    public List<CommentResponse> getCommentResponses() {
        return commentResponses;
    }

    public void setCommentResponses(List<CommentResponse> commentResponses) {
        this.commentResponses = commentResponses;
    }
}
