package com.chuange.aishijing.dao.alipay;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import com.chuange.aishijing.alipayBean.AlipayOrderBean;


@RepositoryDefinition(domainClass = AlipayOrderBean.class, idClass = Integer.class)
public interface AlipayReporsitory extends JpaRepository<AlipayOrderBean,String>{
	//生成加签订单
//	AlipayOrderBean save(AlipayOrderBean order);
	
	//根据订单号查询订单信息
	//@Query(value="from OrderBean where outTradeNo=:tradeno",nativeQuery=true)
	AlipayOrderBean findByOutTradeNo(@Param("tradeno") String tradeno);
 //   AlipayOrderBean saveAndFlush(AlipayOrderBean order);
	
}
