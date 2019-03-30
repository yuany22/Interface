package com.chuange.aishijing.pojo.uploadpicture;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-23.
 */
@Entity
@Table(name="ASJ_UPLOADPICTURE")
public class UploadPicture {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String picName;
    private String picPath;
    private String message;
    private String suffixName;
    public UploadPicture(){}

    public UploadPicture(String picName, String picPath, String message, String suffixName) {
        this.picName = picName;
        this.picPath = picPath;
        this.message = message;
        this.suffixName = suffixName;
    }

    @Override
    public String toString() {
        return "UploadPicture{" +
                "id='" + id + '\'' +
                ", picName='" + picName + '\'' +
                ", picPath='" + picPath + '\'' +
                ", message='" + message + '\'' +
                ", suffixName='" + suffixName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }
}
