package com.chuange.aishijing.dao.usermanage;

import com.chuange.aishijing.pojo.userManage.UserSealInformationLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * 
 * @author yuany
 * 封号日志
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserSealInformationLog.class,idClass = String.class)
public interface SealDao extends JpaRepository<UserSealInformationLog, String>{
	/**
	 * 封号操作信息
	 * @param pageable
	 * @param id
	 * @return
	 */
	Page<UserSealInformationLog> findAllByUserid(Pageable pageable, Long id);
	/**
	 * 插入日志
	 */
}
