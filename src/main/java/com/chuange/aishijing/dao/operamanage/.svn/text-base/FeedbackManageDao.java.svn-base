package com.chuange.aishijing.dao.operamanage;

import com.chuange.aishijing.pojo.operatemanage.FeedbackManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedbackManageDao extends JpaRepository<FeedbackManager,String>{
	<S extends FeedbackManager> Page<S> findAll(Specification<S> feedbacks, Pageable pageable) ;
}
