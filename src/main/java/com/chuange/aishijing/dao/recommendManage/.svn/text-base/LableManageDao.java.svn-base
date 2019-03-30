package com.chuange.aishijing.dao.recommendManage;


import com.chuange.aishijing.pojo.recommendmanage.Lable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LableManageDao extends JpaRepository<Lable,String>{
	/**
	 * banner
	 * @param labletype
	 * @param lablestatus
	 * @return
	 */
	 <S extends Lable> List<S> findAllByLablevalueAndLablestatus( String lablevalue, String lablestatus) ;
}
