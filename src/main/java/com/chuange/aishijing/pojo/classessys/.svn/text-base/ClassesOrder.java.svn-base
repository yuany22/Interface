package com.chuange.aishijing.pojo.classessys;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-12-13.
 */
@Entity
@Table(name="ASJ_CLASSESORDER")
public class ClassesOrder {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String orderNum;//订单标号
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date buyTime;//购买时间
    private String buyPerson;//购买人
    private String buyTel;//手机号码
    private String orderPrice;//订单金额
    private String orderDiscount;//优惠券抵扣
    private String realApp;//用户实付金额
    private String classesId;//关联课程ID
    public ClassesOrder(){}

    public ClassesOrder(String orderNum, Date buyTime, String buyPerson, String buyTel, String orderPrice, String orderDiscount, String realApp, String classesId) {
        this.orderNum = orderNum;
        this.buyTime = buyTime;
        this.buyPerson = buyPerson;
        this.buyTel = buyTel;
        this.orderPrice = orderPrice;
        this.orderDiscount = orderDiscount;
        this.realApp = realApp;
        this.classesId = classesId;
    }

    @Override
    public String toString() {
        return "ClassesOrder{" +
                "id='" + id + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", buyTime=" + buyTime +
                ", buyPerson='" + buyPerson + '\'' +
                ", buyTel='" + buyTel + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderDiscount='" + orderDiscount + '\'' +
                ", realApp='" + realApp + '\'' +
                ", classesId='" + classesId + '\'' +
                '}';
    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getBuyPerson() {
        return buyPerson;
    }

    public void setBuyPerson(String buyPerson) {
        this.buyPerson = buyPerson;
    }

    public String getBuyTel() {
        return buyTel;
    }

    public void setBuyTel(String buyTel) {
        this.buyTel = buyTel;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(String orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public String getRealApp() {
        return realApp;
    }

    public void setRealApp(String realApp) {
        this.realApp = realApp;
    }
}
