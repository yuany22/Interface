package com.chuange.aishijing.dao.classesmanager;

import com.chuange.aishijing.pojo.classessys.ClassComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by Administrator on 2018-12-13.
 */
public interface ClassCommentsDao extends JpaRepository<ClassComments,String>,JpaSpecificationExecutor<ClassComments> {
    List<ClassComments> findAllByClassId(String id);
}
