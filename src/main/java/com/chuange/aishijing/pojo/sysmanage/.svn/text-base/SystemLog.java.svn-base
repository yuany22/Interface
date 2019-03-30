package com.chuange.aishijing.pojo.sysmanage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 * 系统日志
 */
@Entity
@Table(name="ASJ_SYSTEMLOG")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class SystemLog {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String operator;//操作者
    private String operatorIp;//操作者ip
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date operatorTime;//操作时间
    private String operatorContent;//操作内容
    private String reqUrl;//请求的url
    private String reqclassPath;//请求执行的类路径
    private String reqParam;
    private String reqWay;//请求方式
    private String operationType;//操作类型
    private Long finishTime;//请求完成时间
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date returnTime;//接口返回时间
    private String returnDate;//接口返回值

   public SystemLog(){}

    public SystemLog(String operator, String operatorIp, Date operatorTime, String operatorContent, String reqUrl, String reqclassPath, String reqParam, String reqWay, String operationType, Long finishTime, Date returnTime, String returnDate) {
        this.operator = operator;
        this.operatorIp = operatorIp;
        this.operatorTime = operatorTime;
        this.operatorContent = operatorContent;
        this.reqUrl = reqUrl;
        this.reqclassPath = reqclassPath;
        this.reqParam = reqParam;
        this.reqWay = reqWay;
        this.operationType = operationType;
        this.finishTime = finishTime;
        this.returnTime = returnTime;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "SystemLog{" +
                "id='" + id + '\'' +
                ", operator='" + operator + '\'' +
                ", operatorIp='" + operatorIp + '\'' +
                ", operatorTime=" + operatorTime +
                ", operatorContent='" + operatorContent + '\'' +
                ", reqUrl='" + reqUrl + '\'' +
                ", reqclassPath='" + reqclassPath + '\'' +
                ", reqParam='" + reqParam + '\'' +
                ", reqWay='" + reqWay + '\'' +
                ", operationType='" + operationType + '\'' +
                ", finishTime=" + finishTime +
                ", returnTime=" + returnTime +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }

    public String getReqParam() {
        return reqParam;
    }

    public void setReqParam(String reqParam) {
        this.reqParam = reqParam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorContent() {
        return operatorContent;
    }

    public void setOperatorContent(String operatorContent) {
        this.operatorContent = operatorContent;
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    public String getReqclassPath() {
        return reqclassPath;
    }

    public void setReqclassPath(String reqclassPath) {
        this.reqclassPath = reqclassPath;
    }

    public String getReqWay() {
        return reqWay;
    }

    public void setReqWay(String reqWay) {
        this.reqWay = reqWay;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
