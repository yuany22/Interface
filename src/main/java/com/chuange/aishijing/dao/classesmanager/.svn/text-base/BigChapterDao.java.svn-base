package com.chuange.aishijing.dao.classesmanager;

import com.chuange.aishijing.pojo.classessys.BigChapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018-12-10.
 */
public interface BigChapterDao extends JpaRepository<BigChapter,String>{
    List<BigChapter> findAllByClassesId(String id);
    void deleteByClassesId(String s);
}
