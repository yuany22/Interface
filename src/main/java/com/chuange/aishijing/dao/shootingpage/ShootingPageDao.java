package com.chuange.aishijing.dao.shootingpage;

import com.chuange.aishijing.pojo.recommendmanage.HotRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-11-29.
 */
public interface ShootingPageDao extends JpaRepository<HotRole,String>,JpaSpecificationExecutor<HotRole> {
}
