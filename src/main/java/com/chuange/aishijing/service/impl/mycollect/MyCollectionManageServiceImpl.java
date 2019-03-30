package com.chuange.aishijing.service.impl.mycollect;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.castsystem.CastSystemDao;
import com.chuange.aishijing.dao.castsystem.RoleManagerDao;
import com.chuange.aishijing.dao.myCollectionManage.MycollectionDao;
import com.chuange.aishijing.dao.recommendManage.LableManageDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.dao.vedioManage.VedioManageDao;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.login.MyCollections;
import com.chuange.aishijing.pojo.recommendmanage.Lable;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.systemManage.LableManageService;
import com.chuange.aishijing.service.userManage.MyCollectionService;
/**
 * 
 * @author yuany
 * 成功案例
 */
@Service
@Transactional
public class MyCollectionManageServiceImpl implements MyCollectionService{
	@Autowired
	private MycollectionDao mycollectionDao;
	@Autowired
	private RoleManagerDao roleManageDao;
	@Autowired
	private UserManageDao userManageDao;
	@Autowired
	private CastSystemDao castSystemDao;
	@Autowired
	private VedioManageDao vedioManageDao;
	@Override
	public boolean ifExits(MyCollections collection) {
		// TODO Auto-generated method stub
		return mycollectionDao.exists(Example.of(collection));
	}


	@Override
	public MyCollections insertCollection(MyCollections collection) {
		// TODO Auto-generated method stub
		return mycollectionDao.save(collection);
	}


	@Override
	public void deleteCollection(MyCollections collection) {
		// TODO Auto-generated method stub
		mycollectionDao.delete(collection);
	}


	@Override
	public List<Role> selectAllRoleId(long userid) {
		// TODO Auto-generated method stub
		List<MyCollections> list=mycollectionDao.findAllByUserid(userid);
		List<String> ids=new ArrayList<String>();
		for (MyCollections myCollections : list) {
			if(null != myCollections.getRoleid()) {
				ids.add(myCollections.getRoleid());
			}
		}
		List<Role> roles=roleManageDao.findAllById(ids);
		return roles;
	}

	@Override
	public List<User> selectAllActorId(long userid) {
		// TODO Auto-generated method stub
		List<MyCollections> list=mycollectionDao.findAllByUserid(userid);
		List<Long> ids=new ArrayList<Long>();
		for (MyCollections myCollections : list) {
			if(null != myCollections.getActorid() && !myCollections.getActorid().isEmpty()) {
				ids.add(Long.valueOf(myCollections.getActorid()));
			}
		}
		List<User> users=userManageDao.findAllById(ids);
		return users;
	}

	@Override
	public List<Drama> selectAllDramaId(long userid) {
		// TODO Auto-generated method stub
		List<MyCollections> list=mycollectionDao.findAllByUserid(userid);
		List<String> ids=new ArrayList<String>();
		for (MyCollections myCollections : list) {
			if(null != myCollections.getDramaid()) {
				ids.add(myCollections.getDramaid());
			}
		}
		List<Drama> dramas=castSystemDao.findAllById(ids);
		return dramas;
	}

	@Override
	public List<Video> selectAllVideoId(long userid) {
		// TODO Auto-generated method stub
		List<MyCollections> list=mycollectionDao.findAllByUserid(userid);
		List<String> ids=new ArrayList<String>();
		for (MyCollections myCollections : list) {
			if(null != myCollections.getVideoid()) {
				ids.add(myCollections.getVideoid());
			}
		}
		List<Video> videos=vedioManageDao.findAllById(ids);
		return videos;
	}

}
