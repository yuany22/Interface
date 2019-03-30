package com.chuange.aishijing.dao.usermanage;

import com.chuange.aishijing.pojo.userManage.UserSealInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

/**
 * 
 * @author yuany
 * 封号
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.UserSealInformation.class,idClass = String.class)
public interface SealInfoDao extends JpaRepository<UserSealInformation, String>{
	/**
	 * 查询封号
	 * @param id
	 * @return
	 */
	 Optional<UserSealInformation> findByUserId(Long id);
	 @Override
	 <S extends UserSealInformation> S saveAndFlush(S entity) ;
}
