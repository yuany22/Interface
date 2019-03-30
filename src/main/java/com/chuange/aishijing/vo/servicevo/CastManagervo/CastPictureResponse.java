package com.chuange.aishijing.vo.servicevo.CastManagervo;

/**
 * Created by Administrator on 2018-11-26.
 */
public class CastPictureResponse {
    private String picName;
    private String picPath;
    private Integer picType;
    public CastPictureResponse(){}

    public CastPictureResponse(String picName, String picPath, Integer picType) {
        this.picName = picName;
        this.picPath = picPath;
        this.picType = picType;
    }

    @Override
    public String toString() {
        return "CastPictureResponse{" +
                "picName='" + picName + '\'' +
                ", picPath='" + picPath + '\'' +
                ", picType=" + picType +
                '}';
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

    public Integer getPicType() {
        return picType;
    }

    public void setPicType(Integer picType) {
        this.picType = picType;
    }
}
