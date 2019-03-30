package com.chuange.aishijing.dao.teacherprofit;

import com.chuange.aishijing.pojo.teachersys.TeacherProfit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-12-13.
 */
public interface TeacherProfitDao extends JpaRepository<TeacherProfit,String>,JpaSpecificationExecutor<TeacherProfit>{
}
