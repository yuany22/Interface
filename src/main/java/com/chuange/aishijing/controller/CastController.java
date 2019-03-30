package com.chuange.aishijing.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.recommendmanage.SuccessCases;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.castManage.CastManageService;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
/**
 * 
 * @author yuany
 * 来试镜
 *
 */
@Controller
@SpringBootApplication
@RequestMapping(value="try")
public class CastController {
	@Autowired
	private CastManageService castManageService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	/**
	 * 成功案例
	 * @return
	 */
	 @RequestMapping(value="selectAllSuccess")
	 @ResponseBody
	public ResultModel selectAllSuccess() {
		try {
			List<SuccessCases> cases=castManageService.queryAllSuccesses();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("report", cases);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
	 /**
	  * 最新剧本
	  * @return
	  */
	 @RequestMapping(value="/selectNewDramas")
	 @ResponseBody
	 public ResultModel selectAllNewDrama() {
		 try {
			 List<Drama> list=castManageService.selectAllNewCast();
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("dramas", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 剧本详情
	  * @return
	  */
	 @RequestMapping(value="/selectDramaInfo")
	 @ResponseBody
	 public ResultModel selectDramaInfo(String id) {
		 try {
			 Drama drama=castManageService.selectDramaById(id);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("drama", drama);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 剧本参演角色
	  * @return
	  */
	 @RequestMapping(value="/selectRolesByCast")
	 @ResponseBody
	 public ResultModel selectMyProduct(String castid) {
		 try {
			 List<Role> list=castManageService.selectRolesByCast(castid);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("roles", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 热门试镜
	  * @param userid
	  * @return
	  */
	 @RequestMapping(value="/selectAllHotTry")
	 @ResponseBody
	 public ResultModel selectAllHotTry(String castid) {
		 try {
			 List<Video> list=castManageService.selectAllHotTry(castid);
			 if(list.isEmpty()) {
				 
				 return ResultTools.result(1002, "", null);
			 }
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("videos", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 剧组详情
	  * @param userid
	  * @return
	  */
	 @RequestMapping(value="/selectCastInfo")
	 @ResponseBody
	 public ResultModel selectCastInfoById(String castid) {
		 try {
			 Cast cast=castManageService.selectCastInfo(castid);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("cast", cast);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 最新试镜
	  * @return
	  */
	 @RequestMapping(value="/selectNewPlay")
	 @ResponseBody
	 public ResultModel selectNewPlay() {
		 try {
			 List<Video> list=castManageService.selectNewPlay();
			 Map<String, Object> map = new HashMap<String, Object>();
			 if(list.isEmpty()) {
				 return ResultTools.result(1002, "", map);
			 }
			 map.put("video", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 最热试镜
	  * @return
	  */
	 @RequestMapping(value="/selectHotPlay")
	 @ResponseBody
	 public ResultModel selectHotPlay() {
		 try {
			 List<Video> list=castManageService.selectHotPlay();
			 Map<String, Object> map = new HashMap<String, Object>();
			 if(list.isEmpty()) {
				 return ResultTools.result(1002, "", map);
			 }
			 map.put("video", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 最新视频
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectNewVedioBySearch")
	 @ResponseBody
	 public ResultModel selectNewVedioBySearch(String key) {
		 try {
			 List<Video> list=castManageService.selectNewVedioBySearch(key);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("videos", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 最热
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectHotVedioBySearch")
	 @ResponseBody
	 public ResultModel selectHotVedioBySearch(String key) {
		 try {
			 List<Video> video=castManageService.selectHotVedioBySearch(key);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("video", video);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 用户搜索
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectUsersBySearch")
	 @ResponseBody
	 public ResultModel selectUsersBySearch(String key) {
		 try {
			 List<User> users=castManageService.selectUsersBySearch(key);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("users", users);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 用户高级搜索
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectUsersByHighSearch")
	 @ResponseBody
	 public ResultModel selectUsersByHighSearch(Integer currentPage,UserDTO user) {
		 try {
			 Integer pagesize=10;
			 Page<User> users=castManageService.selectUsersByHighSearch(pagesize,currentPage,user);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("users", users);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 剧本搜索
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectCastsBySearch")
	 @ResponseBody
	 public ResultModel selectCastsBySearch(String castname,String type) {
		 try {
			 List<Drama> dramas=castManageService.selectCastsBySearch(castname,type);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("dramas", dramas);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 课程搜索
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectClassesBySearch")
	 @ResponseBody
	 public ResultModel selectClassesBySearch(String classname) {
		 try {
			 List<Classes> classes=castManageService.selectClassesBySearch(classname);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("classes", classes);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 角色详情
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/selectRoleInfo")
	 @ResponseBody
	 public ResultModel selectRoleInfo(String roleid) {
		 try {
			 Role role=castManageService.selectRoleInfo(roleid);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("role", role);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	
}
