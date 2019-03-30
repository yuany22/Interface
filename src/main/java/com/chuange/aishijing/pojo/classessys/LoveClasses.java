package com.chuange.aishijing.pojo.classessys;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Administrator on 2019-03-06.
 */
@Entity
@Table(name = "ASJ_LOVECLASSES")
public class LoveClasses {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String userId;
    private String classId;
    @CreatedDate
    private Date CreateTime;

    public LoveClasses(){}

    public LoveClasses(String userId, String classId, Date createTime) {
        this.userId = userId;
        this.classId = classId;
        CreateTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }
}
