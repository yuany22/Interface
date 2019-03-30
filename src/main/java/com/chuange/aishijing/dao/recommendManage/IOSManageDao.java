package com.chuange.aishijing.dao.recommendManage;



import org.springframework.data.jpa.repository.JpaRepository;

import com.chuange.aishijing.pojo.recommendmanage.IOSVersion;



public interface IOSManageDao extends JpaRepository<IOSVersion,Long>{
	
}
