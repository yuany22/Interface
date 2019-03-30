package com.chuange.aishijing.service.impl.setupimpl;

import com.chuange.aishijing.dao.operamanage.FeedbackManageDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.pojo.operatemanage.FeedbackManager;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.service.setup.SetUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2019-03-06.
 */
@Service
@Transactional
public class SetUpServiceImpl implements SetUpService{
    @Autowired
    private UserManageDao userManageDao;
    @Autowired
    private FeedbackManageDao feedbackManageDao;
    @Override
    public int updateUserPasswordByTel(String tel, String password) {
        int i = userManageDao.updatePasswordByTelphone1(password, tel);
        return i;
    }

    @Override
    public int updateTelphoneByTel(String tel, String newTel) {
        User allByTelphone = userManageDao.findAllByTelphone(tel);
        int i = userManageDao.updateTelphone(newTel,allByTelphone.getId());
        return i;
    }

    @Override
    public FeedbackManager insertFeedback(String content, String telphone) {
        User allByTelphone = userManageDao.findAllByTelphone(telphone);
        FeedbackManager feedbackManager = new FeedbackManager();
        feedbackManager.setFeedbackContent(content);
        feedbackManager.setSubmitterTel(telphone);
        feedbackManager.setSubmitter(allByTelphone.getUsername());
        FeedbackManager save = feedbackManageDao.save(feedbackManager);
        return save;
    }
}
