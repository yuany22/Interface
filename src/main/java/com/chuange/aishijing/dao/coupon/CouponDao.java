package com.chuange.aishijing.dao.coupon;

import com.chuange.aishijing.pojo.recommendmanage.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-12-05.
 */
public interface CouponDao extends JpaRepository<Coupon,String>,JpaSpecificationExecutor<Coupon>{
    Coupon findAllByIdAndStatus(String id,String status);
}
