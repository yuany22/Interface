package com.chuange.aishijing.service.classes;

import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.recommendmanage.Banner;
import com.chuange.aishijing.vo.classesvo.ClassesIntroduceResponse;
import com.chuange.aishijing.vo.classesvo.ClassesRequestVO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Administrator on 2019-02-28.
 */
public interface ClassesService {
    //查询轮播图
    List<Banner> selectBanner();
    //查询课程表
    Page<Classes> selectClasses();
    //查询全部课程表
    List<Classes> selectAllClasses(ClassesRequestVO classesRequestVOs);
    //详细课程介绍
    ClassesIntroduceResponse selectClassesIntroduce(String classesid);
    //评价弹出
    String insertComment(String userid,String classesid,String content,Integer Score);
    //查询课程所有类型
    List<Dictionary> selectAllClassType();
    //点击我想学
    void insertMyLoveClasses(String userId,String classId);
}
