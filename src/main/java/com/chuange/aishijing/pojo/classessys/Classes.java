package com.chuange.aishijing.pojo.classessys;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 课程表
 */
@Entity
@Table(name="ASJ_CLASSES")
public class Classes {
	@Id
	@NotNull
	@GeneratedValue(generator="system_uuid")
	@GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String teacher;//讲师
	private String teacherId;//讲师id
	private String classtitle;//课程标题
	private String classCover;//课程封面
	private Integer playNum;//播放次数
	private String classname;//课程名称（大章节）
	private Double price;//价格
	private Double score;//评分
	private Double totalPrice;//累计收益
	private Double discount;//优惠券抵扣
	private Double realIncome;//实际收入
	private Double appIncome;//平台抽成
	private Integer buyNum;//购买人数
	private String castIntroduce;//课程介绍
	private String classType;//课程分类
	public String getClassCover() {
		return classCover;
	}
	public void setClassCover(String classCover) {
		this.classCover = classCover;
	}
	public Integer getPlayNum() {
		return playNum;
	}
	public void setPlayNum(Integer playNum) {
		this.playNum = playNum;
	}
	public Double getAppIncome() {
		return appIncome;
	}
	public void setAppIncome(Double appIncome) {
		this.appIncome = appIncome;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClasstitle() {
		return classtitle;
	}
	public void setClasstitle(String classtitle) {
		this.classtitle = classtitle;
	}
	public String getCastIntroduce() {
		return castIntroduce;
	}
	public void setCastIntroduce(String castIntroduce) {
		this.castIntroduce = castIntroduce;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getRealIncome() {
		return realIncome;
	}
	public void setRealIncome(Double realIncome) {
		this.realIncome = realIncome;
	}
	public Integer getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	@Override
	public String toString() {
			return "Classes{" +
				"id='" + id + '\'' +
				", teacher='" + teacher + '\'' +
				", classtitle='" + classtitle + '\'' +
				", classCover='" + classCover + '\'' +
				", playNum=" + playNum +
				", classname='" + classname + '\'' +
				", price=" + price +
				", score=" + score +
				", totalPrice=" + totalPrice +
				", discount=" + discount +
				", realIncome=" + realIncome +
				", appIncome=" + appIncome +
				", buyNum=" + buyNum +
				", castIntroduce='" + castIntroduce + '\'' +
				'}';
	}

	public Classes(String teacher, String teacherId, String classtitle, String classCover, Integer playNum, String classname, Double price, Double score, Double totalPrice, Double discount, Double realIncome, Double appIncome, Integer buyNum, String castIntroduce, String classType) {
		this.teacher = teacher;
		this.teacherId = teacherId;
		this.classtitle = classtitle;
		this.classCover = classCover;
		this.playNum = playNum;
		this.classname = classname;
		this.price = price;
		this.score = score;
		this.totalPrice = totalPrice;
		this.discount = discount;
		this.realIncome = realIncome;
		this.appIncome = appIncome;
		this.buyNum = buyNum;
		this.castIntroduce = castIntroduce;
		this.classType = classType;
	}

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
