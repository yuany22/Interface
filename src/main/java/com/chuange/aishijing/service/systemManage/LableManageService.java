package com.chuange.aishijing.service.systemManage;

import java.util.List;

import com.chuange.aishijing.pojo.recommendmanage.Lable;

/**
 * 
 * @author yuany
 *
 */
public interface LableManageService {
	public List<Lable> queryAllLabels(String type,String status);
}
