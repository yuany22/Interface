package com.chuange.aishijing.dao.recommendManage;


import com.chuange.aishijing.pojo.recommendmanage.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BannerManageDao extends JpaRepository<Banner,String>{
	/**
	 * banner
	 * @param rcasts
	 * @param pageable
	 * @return
	 */
	<S extends Banner> Page<S> findAll(Specification<S> cases, Pageable pageable) ;
	 List<Banner> findAllByRecommendLoc(String order) ;

}
