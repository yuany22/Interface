package com.chuange.aishijing.pojo.teachersys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-07.
 * 教师系统
 */
@Entity
@Table(name="ASJ_TEACHERMANAGER")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class TeacherManager {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String teacherName;//老师昵称
    private String teacherNameReal;//老师实名
    private String teacherTel;//老师手机
    private String teacherEmail;//老师邮箱
    private String organization;//所属机构
    private String teacherPicture;//教师头像
    private String teacherProfile;//教师简介
    private String idCard;//身份证号
    private String openingBank;//开户行信息
    private String branckBank;//开户行支行信息
    private String bankCard;//银行卡号
    private String teacherProfit;


    @Override
    public String toString() {
        return "TeacherManager{" +
                "id='" + id + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherNameReal='" + teacherNameReal + '\'' +
                ", teacherTel='" + teacherTel + '\'' +
                ", teacherEmail='" + teacherEmail + '\'' +
                ", organization='" + organization + '\'' +
                ", teacherPicture='" + teacherPicture + '\'' +
                ", teacherProfile='" + teacherProfile + '\'' +
                ", idCard='" + idCard + '\'' +
                ", openingBank='" + openingBank + '\'' +
                ", branckBank='" + branckBank + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", teacherProfit='" + teacherProfit + '\'' +
                '}';
    }

    public TeacherManager(){};

    public TeacherManager(String teacherName, String teacherNameReal, String teacherTel, String teacherEmail, String organization, String teacherPicture, String teacherProfile, String idCard, String openingBank, String branckBank, String bankCard, String teacherProfit) {
        this.teacherName = teacherName;
        this.teacherNameReal = teacherNameReal;
        this.teacherTel = teacherTel;
        this.teacherEmail = teacherEmail;
        this.organization = organization;
        this.teacherPicture = teacherPicture;
        this.teacherProfile = teacherProfile;
        this.idCard = idCard;
        this.openingBank = openingBank;
        this.branckBank = branckBank;
        this.bankCard = bankCard;
        this.teacherProfit = teacherProfit;
    }

    public String getTeacherProfit() {
        return teacherProfit;
    }

    public void setTeacherProfit(String teacherProfit) {
        this.teacherProfit = teacherProfit;
    }

    public String getTeacherPicture() {
        return teacherPicture;
    }

    public void setTeacherPicture(String teacherPicture) {
        this.teacherPicture = teacherPicture;
    }

    public String getTeacherProfile() {
        return teacherProfile;
    }

    public void setTeacherProfile(String teacherProfile) {
        this.teacherProfile = teacherProfile;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getBranckBank() {
        return branckBank;
    }

    public void setBranckBank(String branckBank) {
        this.branckBank = branckBank;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherNameReal() {
        return teacherNameReal;
    }

    public void setTeacherNameReal(String teacherNameReal) {
        this.teacherNameReal = teacherNameReal;
    }

    public String getTeacherTel() {
        return teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
