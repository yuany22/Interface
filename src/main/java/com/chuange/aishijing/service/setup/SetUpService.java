package com.chuange.aishijing.service.setup;

import com.chuange.aishijing.pojo.operatemanage.FeedbackManager;

/**
 * Created by Administrator on 2019-03-06.
 */
public interface SetUpService {
    //修改密码
    int updateUserPasswordByTel(String tel,String password);
    //修改手机号
    int updateTelphoneByTel(String tel,String newTel);
    //提交反馈信息
    FeedbackManager insertFeedback(String content, String telphone);
}
