package com.chuange.aishijing.dao.usermanage;

import com.chuange.aishijing.pojo.userManage.UserEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @author yuany
 * 教育背景
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserEducation.class, idClass = String.class)
public interface EducationDao extends JpaRepository<UserEducation, String>{
	 List<UserEducation> findAllByUserid(String id) ;
}
