package com.chuange.aishijing.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.EducationDao;
import com.chuange.aishijing.pojo.userManage.UserEducation;
import com.chuange.aishijing.service.userManage.UserEducationService;
/**
 * 
 * @author yuany
 * 教育背景
 *
 */
@Service
@Transactional
public class UserEducationInfoImpl implements UserEducationService{
	@Autowired
	private EducationDao educationDao;
	@Override
	public List<UserEducation> queryEducationInfo(String id) {
		// TODO Auto-generated method stub
		return educationDao.findAllByUserid(id);
	}
	/**
	 * 编辑
	 */
	@Override
	public UserEducation modifyById(UserEducation user) {
		// TODO Auto-generated method stub
		return educationDao.saveAndFlush(user);
	}
	/**
	 * 新增
	 */
	@Override
	public UserEducation insertEducation(UserEducation edu) {
		// TODO Auto-generated method stub
		return educationDao.save(edu);
	}
	/**
	 *删除
	 */
	@Override
	public void deleteEducation(String id) {
		// TODO Auto-generated method stub
		educationDao.deleteById(id);
	}

}
