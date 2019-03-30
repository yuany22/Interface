package com.chuange.aishijing.service.castManage;

import java.util.List;

import org.springframework.data.domain.Page;

import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.recommendmanage.SuccessCases;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.videoSystem.Video;

public interface CastManageService {
	/**
	 * 查询成功案例
	 */
	public List<SuccessCases> queryAllSuccesses();
	/**
	 * 热门剧本/最热
	 * @return
	 */
	//public List<HotCast> selectHotCast();
	/**
	 * 全部剧本/按分类
	 * @param id
	 * @return
	 */
	//List<Drama> queryCommentById(String type);
	/**
	 * 最新剧本，按日期
	 * @param score
	 * @return
	 */
	List<Drama> selectAllNewCast();
	/**
	 * 剧本详情
	 * @param comment
	 * @return
	 */
	Drama selectDramaById(String id);
	/**
	 * 
	 * 剧本参演角色
	 * @param id
	 * @return
	 */
	List<Role> selectRolesByCast(String castid);
	/**
	 * 热门试镜/按剧本
	 * @param userid
	 * @return
	 */
	public List<Video> selectAllHotTry(String userid);
	/**
	 * 剧组详情
	 * @param userid
	 * @return
	 */
	public Cast selectCastInfo(String castid);
	/**
	 * 角色详情
	 * @param roleid
	 * @return
	 */
	public Role selectRoleInfo(String roleid);
	/**
	 * 精选试镜/最热
	 */
	public List<Video> selectHotPlay();
	/**
	 *最新试镜
	 * @return
	 */
	public List<Video> selectNewPlay();
	/**
	 * 搜索页最新视频
	 */
	public List<Video> selectNewVedioBySearch(String key);
	/**
	 * 搜索页最热视频
	 */
	public List<Video> selectHotVedioBySearch(String key);
	/**
	 * 搜索用户
	 * @param key
	 * @return
	 */
	public List<User> selectUsersBySearch(String key);
	/**
	 * 高级搜索
	 * @param user
	 * @return
	 */
	public Page<User> selectUsersByHighSearch(Integer pagesize, Integer currentPage, UserDTO user);
	/**
	 * 搜索剧本/按分类
	 * @param castname
	 * @param type
	 * @return
	 */
	public List<Drama> selectCastsBySearch(String castname,String type);
	/**
	 * 搜索课程
	 * @param className
	 * @return
	 */
	public List<Classes> selectClassesBySearch(String className);
}
