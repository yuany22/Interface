package com.chuange.aishijing.dao.classesmanager;

import com.chuange.aishijing.pojo.classessys.Classes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Administrator on 2018-12-10.
 */
public interface ClassesManagerDao extends JpaRepository<Classes,String>,JpaSpecificationExecutor<Classes>{
    Classes findAllById(String classesid);
    @Query(value="select u.class_type from asj_classes u",nativeQuery = true)
    List<String> findclassType();
	/**
	 * 搜索
	 * @param key
	 * @return
	 */
	@Query(value="from Classes where classtitle like CONCAT('%',:key,'%')")
	public List<Classes> findBySearch(String key);
}
