package com.chuange.aishijing.service.impl.castManage;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.recommendManage.AndrioidManageDao;
import com.chuange.aishijing.dao.recommendManage.IOSManageDao;
import com.chuange.aishijing.pojo.recommendmanage.AndroidVersion;
import com.chuange.aishijing.pojo.recommendmanage.IOSVersion;
import com.chuange.aishijing.service.castManage.VersionManageService;
/**
 * 
 * @author yuany
 * 成功案例
 */
@Service
@Transactional
public class VersionManageServiceImpl implements VersionManageService{
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@Autowired
	private IOSManageDao iosManageDao;
	@Autowired
	private AndrioidManageDao androidManageDao;
	@Override
	public IOSVersion insert(IOSVersion ios) {
		// TODO Auto-generated method stub
		return iosManageDao.save(ios);
	}
	@Override
	public AndroidVersion insertAndroid(AndroidVersion android) {
		// TODO Auto-generated method stub
		return androidManageDao.save(android);
	}

}
