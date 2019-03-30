package com.chuange.aishijing.pojo.teachersys;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-11-07.
 * 教师提现
 */
@Entity
@Table(name="ASJ_TEACHERCASH")
public class TeacherCash {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String amountCash;//提现金额
    private String timeCash;//提现时间
    private String typeCash;//提现方式
    private String statusCash;//提现状态
    private String deductionTax;//扣除税额
    private String actualAmount;//实际金额

    @Override
    public String toString() {
        return "TeacherCash{" +
                "id='" + id + '\'' +
                ", amountCash='" + amountCash + '\'' +
                ", timeCash='" + timeCash + '\'' +
                ", typeCash='" + typeCash + '\'' +
                ", statusCash='" + statusCash + '\'' +
                ", deductionTax='" + deductionTax + '\'' +
                ", actualAmount='" + actualAmount + '\'' +
                '}';
    }

    public TeacherCash(String amountCash, String timeCash, String typeCash, String statusCash, String deductionTax, String actualAmount) {
        this.amountCash = amountCash;
        this.timeCash = timeCash;
        this.typeCash = typeCash;
        this.statusCash = statusCash;
        this.deductionTax = deductionTax;
        this.actualAmount = actualAmount;
    }
    public TeacherCash(){}

    public String getDeductionTax() {
        return deductionTax;
    }

    public void setDeductionTax(String deductionTax) {
        this.deductionTax = deductionTax;
    }

    public String getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmountCash() {
        return amountCash;
    }

    public void setAmountCash(String amountCash) {
        this.amountCash = amountCash;
    }

    public String getTimeCash() {
        return timeCash;
    }

    public void setTimeCash(String timeCash) {
        this.timeCash = timeCash;
    }

    public String getTypeCash() {
        return typeCash;
    }

    public void setTypeCash(String typeCash) {
        this.typeCash = typeCash;
    }

    public String getStatusCash() {
        return statusCash;
    }

    public void setStatusCash(String statusCash) {
        this.statusCash = statusCash;
    }
}
