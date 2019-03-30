package com.chuange.aishijing.dao.recommendManage;

import com.chuange.aishijing.pojo.recommendmanage.RecommendCast;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RecommendDramaDao extends JpaRepository<RecommendCast,String>{
	/**
	 * 推荐列表
	 * @param rcasts
	 * @param pageable
	 * @return
	 */
	<S extends RecommendCast> Page<S> findAll(Specification<S> rcasts, Pageable pageable) ;
	 List<RecommendCast> findAllByRecommendOrder(Integer order) ;
}
