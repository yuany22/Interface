package com.chuange.aishijing.dao.castsystem;

import com.chuange.aishijing.pojo.castsystem.Drama;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * 
 * @author yuany
 * 剧本管理
 */
@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.castsystem.Drama.class, idClass = String.class)
public interface CastSystemDao extends JpaRepository<Drama, String>{
	<S extends Drama> Page<S> findAll(Specification<S> casts, Pageable pageable) ;
	Drama findCastNameAndPublishById(String id);
	/**
	 * 	剧本列表
	 * @param rcasts
	 * @return
	 */
	<S extends Drama> List<S> findAll(Specification<S> rcasts) ;

	List<Drama> findAllBycastnameContaining(String content);

	List<Drama> findAllByType(String casttype);

	/**
	 * 剧本搜索
	 * @param key
	 * @param sort
	 * @return
	 */
	@Query(value="from Drama where castname like CONCAT('%',:key,'%') or type=:type ")
	public List<Drama> findBySearch(String key,String type);
}
