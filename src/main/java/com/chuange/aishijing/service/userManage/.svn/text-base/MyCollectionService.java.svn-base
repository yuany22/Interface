package com.chuange.aishijing.service.userManage;

import java.util.List;

import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.login.MyCollections;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.videoSystem.Video;

public interface MyCollectionService {
	/**
	 * 是否收藏
	 * @param userid
	 * @param roleid
	 * @return
	 */
	public boolean ifExits(MyCollections collection);
	/**
	 * 收藏
	 * @param userid
	 * @param roleid
	 * @return
	 */
	public MyCollections insertCollection(MyCollections collection);
	/**
	 * 取消收藏
	 * @param userid
	 * @param dramaid
	 * @return
	 */
	public void deleteCollection(MyCollections collection);
	/**
	 * 收藏列表
	 * @param userid
	 * @return
	 */
	public List<Role> selectAllRoleId(long userid);
	public List<User> selectAllActorId(long userid);
	public List<Drama> selectAllDramaId(long userid);
	public List<Video> selectAllVideoId(long userid);
	 
}
