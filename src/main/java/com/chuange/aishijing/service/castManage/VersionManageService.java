package com.chuange.aishijing.service.castManage;


import com.chuange.aishijing.pojo.recommendmanage.AndroidVersion;
import com.chuange.aishijing.pojo.recommendmanage.IOSVersion;
/**
 * 
 * @author yuany
 *
 */
public interface VersionManageService {
	/**
	 * 新增
	 * @param rcast
	 * @return
	 */
	public IOSVersion insert(IOSVersion ios);
	public AndroidVersion insertAndroid(AndroidVersion android);
	
}
