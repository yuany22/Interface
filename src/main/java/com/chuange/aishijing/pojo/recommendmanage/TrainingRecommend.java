package com.chuange.aishijing.pojo.recommendmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 培训推荐表
 */
@Entity
@Table(name="ASJ_TRAININGRECOMMEND")
public class TrainingRecommend {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String recommendLoc;//推荐位
	private String classname;//课程名称
	private String showterminal;//展示终端
	private String status;//状态
	private String classid;//课程ID
	
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommendLoc() {
		return recommendLoc;
	}
	public void setRecommendLoc(String recommendLoc) {
		this.recommendLoc = recommendLoc;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getShowterminal() {
		return showterminal;
	}
	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TrainingRecommend(@NotNull String id, String recommendLoc, String classname, String showterminal,
			String status, String classid) {
		super();
		this.id = id;
		this.recommendLoc = recommendLoc;
		this.classname = classname;
		this.showterminal = showterminal;
		this.status = status;
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "TrainingRecommend [id=" + id + ", recommendLoc=" + recommendLoc + ", classname=" + classname
				+ ", showterminal=" + showterminal + ", status=" + status + ", classid=" + classid + "]";
	}
	public TrainingRecommend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
