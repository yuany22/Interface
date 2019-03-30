package com.chuange.aishijing.dao.recommendManage;


import com.chuange.aishijing.pojo.recommendmanage.TrainingRecommend;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RecommendClassDao extends JpaRepository<TrainingRecommend,String>{
	/**
	 * 推荐课程列表
	 * @param rcasts
	 * @param pageable
	 * @return
	 */
	<S extends TrainingRecommend> Page<S> findAll(Specification<S> rcasts, Pageable pageable) ;
	List<TrainingRecommend> findAllByRecommendLoc(String order);
}
