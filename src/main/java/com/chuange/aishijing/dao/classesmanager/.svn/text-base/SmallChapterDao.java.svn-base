package com.chuange.aishijing.dao.classesmanager;

import com.chuange.aishijing.pojo.classessys.SmallChapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018-12-10.
 */
public interface SmallChapterDao extends JpaRepository<SmallChapter,String> {
    List<SmallChapter> findAllByBigChapterId(String id);

    void deleteByBigChapterId(String id);

}
