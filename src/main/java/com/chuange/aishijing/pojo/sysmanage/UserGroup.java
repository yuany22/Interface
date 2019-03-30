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
 * Created by Administrator on 2018-12-21.
 */
@Entity
@Table(name = "ASJ_USERGROUP")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class UserGroup {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String managermentgroupName;//管理组名称
    private String description;//描述
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;//创建时间
    private String permissionSetting;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    private String createUser;//创建人
    private String belongPermission;
    public UserGroup(){}

    public UserGroup(String managermentgroupName, String description, Date createTime, String permissionSetting, Date updateTime, String createUser, String belongPermission) {
        this.managermentgroupName = managermentgroupName;
        this.description = description;
        this.createTime = createTime;
        this.permissionSetting = permissionSetting;
        this.updateTime = updateTime;
        this.createUser = createUser;
        this.belongPermission = belongPermission;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "id='" + id + '\'' +
                ", managermentgroupName='" + managermentgroupName + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", permissionSetting='" + permissionSetting + '\'' +
                ", updateTime=" + updateTime +
                ", createUser='" + createUser + '\'' +
                ", belongPermission='" + belongPermission + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManagermentgroupName() {
        return managermentgroupName;
    }

    public void setManagermentgroupName(String managermentgroupName) {
        this.managermentgroupName = managermentgroupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPermissionSetting() {
        return permissionSetting;
    }

    public void setPermissionSetting(String permissionSetting) {
        this.permissionSetting = permissionSetting;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getBelongPermission() {
        return belongPermission;
    }

    public void setBelongPermission(String belongPermission) {
        this.belongPermission = belongPermission;
    }
}
