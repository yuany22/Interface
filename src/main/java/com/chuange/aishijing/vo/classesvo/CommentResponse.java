package com.chuange.aishijing.vo.classesvo;

import java.util.Date;

/**
 * Created by Administrator on 2019-03-01.
 */
public class CommentResponse {
    private String commentContent;
    private Date commentTime;
    private String commentUser;
    private String commentUserPicture;
    public CommentResponse(){};

    public CommentResponse(String commentContent, Date commentTime, String commentUser, String commentUserPicture) {
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.commentUser = commentUser;
        this.commentUserPicture = commentUserPicture;
    }

    @Override
    public String toString() {
        return "CommentResponse{" +
                "commentContent='" + commentContent + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", commentUser='" + commentUser + '\'' +
                '}';
    }

    public String getCommentUserPicture() {
        return commentUserPicture;
    }

    public void setCommentUserPicture(String commentUserPicture) {
        this.commentUserPicture = commentUserPicture;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser;
    }
}
