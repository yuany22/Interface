package com.chuange.aishijing.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.recommendManage.LableManageDao;
import com.chuange.aishijing.pojo.recommendmanage.Lable;
import com.chuange.aishijing.service.systemManage.LableManageService;
/**
 * 
 * @author yuany
 * 成功案例
 */
@Service
@Transactional
public class LabelManageServiceImpl implements LableManageService{
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@Autowired
	private LableManageDao labelManageDao;
	@Override
	public List<Lable> queryAllLabels(String type,String status) {
		// TODO Auto-generated method stub
		return labelManageDao.findAllByLablevalueAndLablestatus(type, status);
	}

}
