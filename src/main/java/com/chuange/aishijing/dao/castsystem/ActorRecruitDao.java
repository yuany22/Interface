package com.chuange.aishijing.dao.castsystem;

import com.chuange.aishijing.pojo.castsystem.RecruitInterviewer;
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
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.RecruitInterviewer.class, idClass = String.class)
public interface ActorRecruitDao extends JpaRepository<RecruitInterviewer,String>{
	<S extends RecruitInterviewer> Page<S> findAll(Specification<S> casts, Pageable pageable) ;
}
