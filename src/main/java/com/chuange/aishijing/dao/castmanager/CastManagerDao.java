package com.chuange.aishijing.dao.castmanager;

import com.chuange.aishijing.pojo.castmanage.Cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-11-15.
 */
public interface CastManagerDao extends JpaRepository<Cast,String>,JpaSpecificationExecutor<Cast>{

    Cast getOne(String id);

}
