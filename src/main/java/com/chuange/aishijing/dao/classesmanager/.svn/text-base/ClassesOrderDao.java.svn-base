package com.chuange.aishijing.dao.classesmanager;

import com.chuange.aishijing.pojo.classessys.ClassesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by Administrator on 2018-12-13.
 */
public interface ClassesOrderDao extends JpaRepository<ClassesOrder,String>,JpaSpecificationExecutor<ClassesOrder> {
    List<ClassesOrder> findAllBybuyPerson(String id);
}
