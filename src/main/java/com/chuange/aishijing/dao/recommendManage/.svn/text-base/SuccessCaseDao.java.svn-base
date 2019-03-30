package com.chuange.aishijing.dao.recommendManage;


import com.chuange.aishijing.pojo.recommendmanage.SuccessCases;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SuccessCaseDao extends JpaRepository<SuccessCases,String>{
	/**
	 * 成功案例
	 * @param rcasts
	 * @param pageable
	 * @return
	 */
	<S extends SuccessCases> Page<S> findAll(Specification<S> cases, Pageable pageable) ;
	
	 List<SuccessCases> findAllByRecommendorder(Integer order) ;
	
}
