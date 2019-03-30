package com.chuange.aishijing.dao.recommendManage;

import com.chuange.aishijing.pojo.recommendmanage.UserCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019-03-06.
 */
public interface UserCouponDao extends JpaRepository<UserCoupon,String> {
    List<UserCoupon> findAllByuserId(String id);
}
