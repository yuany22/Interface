package com.chuange.aishijing.pojo.recommendmanage;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author yuany
 * 轮播图管理
 */
@Entity
@Table(name="ASJ_BANNER")
public class Banner {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String recommendLoc;//推荐位
	private String linkto;//链接指向
	private Integer linktype;//是否跳转
	private String showterminal;//显示终端
	private String status;//状态
	private String title;//标题
	@Column(nullable=false,unique=true)
	private Integer orderval;//排序值
	private String bannerimg;//banner图
	
	public Integer getLinktype() {
		return linktype;
	}
	public void setLinktype(Integer linktype) {
		this.linktype = linktype;
	}
	public String getBannerimg() {
		return bannerimg;
	}
	public void setBannerimg(String bannerimg) {
		this.bannerimg = bannerimg;
	}
	public Integer getOrderval() {
		return orderval;
	}
	public void setOrderval(Integer orderval) {
		this.orderval = orderval;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getLinkto() {
		return linkto;
	}
	public void setLinkto(String linkto) {
		this.linkto = linkto;
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
	public Banner(@NotNull String id, String recommendLoc, String linkto, Integer linktype, String showterminal,
			String status, String title, Integer orderval, String bannerimg) {
		super();
		this.id = id;
		this.recommendLoc = recommendLoc;
		this.linkto = linkto;
		this.linktype = linktype;
		this.showterminal = showterminal;
		this.status = status;
		this.title = title;
		this.orderval = orderval;
		this.bannerimg = bannerimg;
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", recommendLoc=" + recommendLoc + ", linkto=" + linkto + ", linktype=" + linktype
				+ ", showterminal=" + showterminal + ", status=" + status + ", title=" + title + ", orderval="
				+ orderval + ", bannerimg=" + bannerimg + "]";
	}
	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
