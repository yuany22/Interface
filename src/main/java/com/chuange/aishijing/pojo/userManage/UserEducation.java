package com.chuange.aishijing.pojo.userManage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-14.
 */
@Entity
@Table(name="ASJ_USEREDUCATION")
public class UserEducation {
    @Id
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    @NotNull
    private String userid;//关联userid
    private String graduateSchool;//毕业学校
    private String subject;//专业
    private String classcontent;//课程内容
    private String fromtoTime;//在校时间段
    private String selfintro;//个人介绍
    
    public UserEducation(){}


    public String getFromtoTime() {
        return fromtoTime;
    }

    public void setFromtoTime(String fromtoTime) {
        this.fromtoTime = fromtoTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



	public String getClasscontent() {
		return classcontent;
	}


	public void setClasscontent(String classcontent) {
		this.classcontent = classcontent;
	}


	public String getSelfintro() {
		return selfintro;
	}


	public void setSelfintro(String selfintro) {
		this.selfintro = selfintro;
	}


	@Override
	public String toString() {
		return "UserEducation [id=" + id + ", userid=" + userid + ", graduateSchool=" + graduateSchool + ", subject="
				+ subject + ", classcontent=" + classcontent + ", fromtoTime=" + fromtoTime + ", selfintro=" + selfintro
				+ "]";
	}




}
