package com.chuange.aishijing.pojo.recommendmanage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-12-04.
 */
@Entity
@Table(name="ASJ_COUPON")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Coupon {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String couponTitle;
    private String couponValue;
    private String scopeofUse;
    private String maxNum;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date startTime;
    @Temporal(TemporalType.DATE)
    private Date endTime;

    public Coupon(){}

    public Coupon(String couponTitle, String couponValue, String scopeofUse, String maxNum, String status, Date startTime, Date endTime) {
        this.couponTitle = couponTitle;
        this.couponValue = couponValue;
        this.scopeofUse = scopeofUse;
        this.maxNum = maxNum;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id='" + id + '\'' +
                ", couponTitle='" + couponTitle + '\'' +
                ", couponValue='" + couponValue + '\'' +
                ", scopeofUse='" + scopeofUse + '\'' +
                ", maxNum='" + maxNum + '\'' +
                ", status='" + status + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(String couponValue) {
        this.couponValue = couponValue;
    }

    public String getScopeofUse() {
        return scopeofUse;
    }

    public void setScopeofUse(String scopeofUse) {
        this.scopeofUse = scopeofUse;
    }

    public String getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(String maxNum) {
        this.maxNum = maxNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
