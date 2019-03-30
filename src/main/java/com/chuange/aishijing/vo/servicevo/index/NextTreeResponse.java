package com.chuange.aishijing.vo.servicevo.index;

/**
 * Created by Administrator on 2018-12-17.
 */
public class NextTreeResponse {
    private String resourceType;
    private String resourceId;
    private String resourceCode;
    private String resourceName;
    public NextTreeResponse(){}

    public NextTreeResponse(String resourceType, String resourceId, String resourceCode, String resourceName) {
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.resourceCode = resourceCode;
        this.resourceName = resourceName;
    }

    @Override
    public String toString() {
        return "NextTreeResponse{" +
                "resourceType='" + resourceType + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", resourceCode='" + resourceCode + '\'' +
                ", resourceName='" + resourceName + '\'' +
                '}';
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
