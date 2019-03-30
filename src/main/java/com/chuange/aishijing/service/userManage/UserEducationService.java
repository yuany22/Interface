package com.chuange.aishijing.service.userManage;

import java.util.List;

import com.chuange.aishijing.pojo.userManage.UserEducation;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;

public interface UserEducationService {
	public List<UserEducation> queryEducationInfo(String id);
	public UserEducation modifyById(UserEducation user);
	public UserEducation insertEducation(UserEducation edu);
	public void deleteEducation(String id);
}
