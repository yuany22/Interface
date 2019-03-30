package com.chuange.aishijing.dao.usermanage;

import com.chuange.aishijing.pojo.userManage.UserFans;
import org.hibernate.jpa.event.internal.jpa.ListenerFactoryStandardImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface UserFansDao extends JpaRepository<UserFans,String>{

    List<UserFans> findAllByAttentionID(String id);
    List<UserFans> findAllByuserID(String id);
    void deleteByAttentionID(String id);
}
