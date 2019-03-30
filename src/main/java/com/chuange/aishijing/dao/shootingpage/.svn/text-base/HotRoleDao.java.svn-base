package com.chuange.aishijing.dao.shootingpage;

import com.chuange.aishijing.pojo.recommendmanage.HotRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019-02-26.
 */
public interface HotRoleDao extends JpaRepository<HotRole,String> {

    List<HotRole> findAllByRecommendAndStatusOrderByRecommendValueDesc(String recommend,String Status);
    List<HotRole> findAllByStatusOrderByRecommendDesc(String status);
}
