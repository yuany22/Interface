package com.chuange.aishijing.dao.operamanage;

import com.chuange.aishijing.pojo.operatemanage.SystemManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * 
 * @author yuany
 * 演员招募
 *
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.operatemanage.SystemManager.class, idClass = String.class)
public interface SystemMesageDao extends JpaRepository<SystemManager,String>{
	<S extends SystemManager> Page<S> findAll(Specification<S> messages, Pageable pageable) ;
}
