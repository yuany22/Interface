package com.chuange.aishijing.vo.shotvo;

/**
 * Created by Administrator on 2019-02-26.
 */
public class RoleTypeRequest {
    private String sex;
    private String age;
    private String roleTag;
    private String role;
    public RoleTypeRequest(){};
    public RoleTypeRequest(String sex, String age, String roleTag, String role) {
        this.sex = sex;
        this.age = age;
        this.roleTag = roleTag;
        this.role = role;
    }

    @Override
    public String toString() {
        return "RoleTypeRequest{" +
                "sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", roleTag='" + roleTag + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRoleTag() {
        return roleTag;
    }

    public void setRoleTag(String roleTag) {
        this.roleTag = roleTag;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
