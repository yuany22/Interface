package com.chuange.aishijing.pojo.userManage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Administrator on 2018-11-07.
 */
@Entity
@Table(name="ASJ_USER")
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;//会员昵称
    private String usernameLogin;//登录用户名
    private String password;//用户密码
    private String userPicture;//用户头像
    private String sex="1";//性别
    private String height;//身高
    private String weight;//体重
    private String age;//年龄
    private String birthday;//生日
    private String telphone;//手机号码
    private String area;//所在地区
    private String authenticationType="3";//认证类型
    private String crew;//所属剧组
    private String economicCompany;//经济公司
    @Temporal(TemporalType.DATE)
    private Date registrationTime;//注册时间
    @Temporal(TemporalType.DATE)
    private Date lastloginTime;//最后登录时间
    private Integer sealStatus;//用户账号状态 0 正常 1 冻结
    private String specialLabel;//特长标签
    private String jobLabel;//职业标签
    private String friendsLabel;//好友印象
    private String introduceMyself;//自我介绍
    private String myPhotos;//我的图组


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", usernameLogin=" + usernameLogin + ", password="
				+ password + ", userPicture=" + userPicture + ", sex=" + sex + ", height=" + height + ", weight="
				+ weight + ", age=" + age + ", birthday=" + birthday + ", telphone=" + telphone + ", area=" + area
				+ ", authenticationType=" + authenticationType + ", crew=" + crew + ", economicCompany="
				+ economicCompany + ", registrationTime=" + registrationTime + ", lastloginTime=" + lastloginTime
				+ ", sealStatus=" + sealStatus + ", specialLabel=" + specialLabel + ", jobLabel=" + jobLabel
				+ ", friendsLabel=" + friendsLabel + ", introduceMyself=" + introduceMyself + ", myPhotos=" + myPhotos
				+ "]";
	}

	public User(Long id, String username, String usernameLogin, String password, String userPicture, String sex,
			String height, String weight, String age, String birthday, String telphone, String area,
			String authenticationType, String crew, String economicCompany, Date registrationTime, Date lastloginTime,
			Integer sealStatus, String specialLabel, String jobLabel, String friendsLabel, String introduceMyself,
			String myPhotos) {
		super();
		this.id = id;
		this.username = username;
		this.usernameLogin = usernameLogin;
		this.password = password;
		this.userPicture = userPicture;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.birthday = birthday;
		this.telphone = telphone;
		this.area = area;
		this.authenticationType = authenticationType;
		this.crew = crew;
		this.economicCompany = economicCompany;
		this.registrationTime = registrationTime;
		this.lastloginTime = lastloginTime;
		this.sealStatus = sealStatus;
		this.specialLabel = specialLabel;
		this.jobLabel = jobLabel;
		this.friendsLabel = friendsLabel;
		this.introduceMyself = introduceMyself;
		this.myPhotos = myPhotos;
	}

	public String getMyPhotos() {
		return myPhotos;
	}

	public void setMyPhotos(String myPhotos) {
		this.myPhotos = myPhotos;
	}

	public String getIntroduceMyself() {
		return introduceMyself;
	}

	public void setIntroduceMyself(String introduceMyself) {
		this.introduceMyself = introduceMyself;
	}

    public String getUsernameLogin() {
        return usernameLogin;
    }

    public void setUsernameLogin(String usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public String getSpecialLabel() {
		return specialLabel;
	}

	public void setSpecialLabel(String specialLabel) {
		this.specialLabel = specialLabel;
	}

	public String getJobLabel() {
		return jobLabel;
	}

	public void setJobLabel(String jobLabel) {
		this.jobLabel = jobLabel;
	}

	public String getFriendsLabel() {
		return friendsLabel;
	}

	public void setFriendsLabel(String friendsLabel) {
		this.friendsLabel = friendsLabel;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public Integer getSealStatus() {
		return sealStatus;
	}


	public void setSealStatus(Integer sealStatus) {
		this.sealStatus = sealStatus;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getEconomicCompany() {
        return economicCompany;
    }

    public void setEconomicCompany(String economicCompany) {
        this.economicCompany = economicCompany;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }
}
