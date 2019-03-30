package com.chuange.aishijing.dao.myCollectionManage;

import com.chuange.aishijing.pojo.login.MyCollections;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MycollectionDao extends JpaRepository<MyCollections,String>{
	MyCollections findByUseridAndRoleid(long userid,String roleid);
	MyCollections findByUseridAndActorid(long userid,String actorid);
	MyCollections findByUseridAndDramaid(long userid,String dramaid);
	MyCollections findByUseridAndVideoid(long userid,String videoid);
	List<MyCollections> findAllByUserid(long userid);
	
}
