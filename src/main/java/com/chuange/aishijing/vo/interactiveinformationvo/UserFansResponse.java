package com.chuange.aishijing.vo.interactiveinformationvo;

/**
 * Created by Administrator on 2019-03-05.
 */
public class UserFansResponse {
    private String attentionID;
    private String name;
    private String userPicture;
    private String introduceMyself;
    public UserFansResponse(){};
    public UserFansResponse(String attentionID, String name, String userPicture, String introduceMyself) {
        this.attentionID = attentionID;
        this.name = name;
        this.userPicture = userPicture;
        this.introduceMyself = introduceMyself;
    }

    public String getAttentionID() {
        return attentionID;
    }

    public void setAttentionID(String attentionID) {
        this.attentionID = attentionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getIntroduceMyself() {
        return introduceMyself;
    }

    public void setIntroduceMyself(String introduceMyself) {
        this.introduceMyself = introduceMyself;
    }
}
