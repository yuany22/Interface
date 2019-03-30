package com.chuange.aishijing.dao.shootingpage;

import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.recommendmanage.HotCast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by Administrator on 2018-11-30.
 */
public interface HotCastDao extends JpaRepository<HotCast,String>{
    List<HotCast> findAllByRecommendAndStatus(String recommend,String status);
    List<HotCast> findAllByStatusOrderByRecommendDesc(String status);
}
