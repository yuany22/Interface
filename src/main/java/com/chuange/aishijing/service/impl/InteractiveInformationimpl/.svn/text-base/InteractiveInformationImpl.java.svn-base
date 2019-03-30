package com.chuange.aishijing.service.impl.InteractiveInformationimpl;

import com.chuange.aishijing.dao.castmanager.TeacherManagerDao;
import com.chuange.aishijing.dao.classesmanager.ClassesManagerDao;
import com.chuange.aishijing.dao.classesmanager.ClassesOrderDao;
import com.chuange.aishijing.dao.classesmanager.LoveClassesDao;
import com.chuange.aishijing.dao.coupon.CouponDao;
import com.chuange.aishijing.dao.recommendManage.UserCouponDao;
import com.chuange.aishijing.dao.usermanage.UserFansDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.dao.vedioManage.VedioManageDao;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.classessys.ClassesOrder;
import com.chuange.aishijing.pojo.classessys.LoveClasses;
import com.chuange.aishijing.pojo.recommendmanage.Coupon;
import com.chuange.aishijing.pojo.recommendmanage.UserCoupon;
import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.userManage.UserFans;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.InteractiveInformation.InteractiveInformationService;
import com.chuange.aishijing.vo.interactiveinformationvo.BuyClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.MyLoveClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.UserFansResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2019-03-05.
 */
@Service
@Transactional
public class InteractiveInformationImpl implements InteractiveInformationService {
    @Autowired
    private UserFansDao userFansDao;
    @Autowired
    private UserManageDao userManageDao;
    @Autowired
    private VedioManageDao vedioManageDao;
    @Autowired
    private ClassesOrderDao classesOrderDao;
    @Autowired
    private ClassesManagerDao classesManagerDao;
    @Autowired
    private LoveClassesDao loveClassesDao;
    @Autowired
    private UserCouponDao userCouponDao;
    @Autowired
    private CouponDao couponDao;
    @Override
    public List<UserFansResponse> selectUserFans(String userid) {
        List<UserFansResponse> list = new ArrayList<>();
        UserFansResponse userFansResponse;
        List<UserFans> allByAttentionID = userFansDao.findAllByAttentionID(userid);
        for (UserFans userFans : allByAttentionID) {
            userFansResponse = new UserFansResponse();
            userFansResponse.setAttentionID(userFans.getUserID());
            User allById = userManageDao.findAllById(Long.parseLong(userFans.getUserID()));
            userFansResponse.setName(allById.getUsername());
            userFansResponse.setUserPicture(allById.getUserPicture());
            userFansResponse.setIntroduceMyself(allById.getIntroduceMyself());
            list.add(userFansResponse);
        }
        return list;
    }
    @Override
    public String insertUserFans(String userId, String attentionId) {
        UserFans userFans = new UserFans();
        userFans.setUserID(userId);
        userFans.setAttentionID(attentionId);
        userFansDao.save(userFans);
        return "1";
    }

    @Override
    public List<UserFansResponse> selectMyAttend(String userId) {
        List<UserFansResponse> list = new ArrayList<>();
        UserFansResponse userFansResponse;
        List<UserFans> allByUserId = userFansDao.findAllByuserID(userId);
        for (UserFans userFans : allByUserId) {
            userFansResponse = new UserFansResponse();
            userFansResponse.setAttentionID(userFans.getAttentionID());
            User allById = userManageDao.findAllById(Long.parseLong(userFans.getUserID()));
            userFansResponse.setName(allById.getUsername());
            userFansResponse.setUserPicture(allById.getUserPicture());
            userFansResponse.setIntroduceMyself(allById.getIntroduceMyself());
            list.add(userFansResponse);
        }
        return list;
    }

    @Override
    public String deleteByAttendId(String attendId) {
        userFansDao.deleteByAttentionID(attendId);
        return "1";
    }

    @Override
    public List<VideoResponse> selectAllMyVideo(String userId) {
        List<VideoResponse> list = new ArrayList<>();
        VideoResponse videoResponse;
        List<Video> allByuserId = vedioManageDao.findAllByuserId(Long.parseLong(userId));
        for (Video video : allByuserId) {
            videoResponse = new VideoResponse();
            videoResponse.setClicks(video.getClicks());
            videoResponse.setReviewNumber(video.getReviewNumber());
            videoResponse.setVideoName(video.getVideoName());
            videoResponse.setVideoUrl(video.getVideoUrl());
            list.add(videoResponse);
        }
        return list;
    }

    @Override
    public List<BuyClassResponse> selectBuyClasses(String userId) {
        List<BuyClassResponse> list = new ArrayList<>();
        BuyClassResponse buyClassResponse;
        List<ClassesOrder> allBybuyPerson = classesOrderDao.findAllBybuyPerson(userId);
        for (ClassesOrder classesOrder : allBybuyPerson) {
            Classes allById = classesManagerDao.findAllById(classesOrder.getClassesId());
            buyClassResponse = new BuyClassResponse();
            buyClassResponse.setBuyTime(classesOrder.getBuyTime());
                buyClassResponse.setOrderNum(classesOrder.getOrderNum());
                buyClassResponse.setOrderPrice(classesOrder.getOrderPrice());
                buyClassResponse.setRealApp(classesOrder.getRealApp());
                buyClassResponse.setTeacher(allById.getTeacher());
                list.add(buyClassResponse);
        }
        return list;
    }

    @Override
    public List<MyLoveClassResponse> selectMyLoveClass(String userId) {
        List<MyLoveClassResponse> list = new ArrayList<>();
        MyLoveClassResponse myLoveClassResponse;
        List<LoveClasses> allByuserId = loveClassesDao.findAllByuserId(userId);
        for (LoveClasses loveClasses : allByuserId) {
            Classes allById = classesManagerDao.findAllById(loveClasses.getClassId());
            if(null!=allById) {
                myLoveClassResponse = new MyLoveClassResponse();
                myLoveClassResponse.setTeacher(allById.getTeacher());
                myLoveClassResponse.setBuyNum(allById.getBuyNum());
                myLoveClassResponse.setCastIntroduce(allById.getCastIntroduce());
                myLoveClassResponse.setPrice(allById.getPrice());
                myLoveClassResponse.setScore(allById.getScore());
                myLoveClassResponse.setClasstitle(allById.getClasstitle());
                myLoveClassResponse.setClassCover(allById.getClassCover());
                list.add(myLoveClassResponse);
            }
        }
        return list;
    }

    @Override
    public List<Coupon> selectMyCoupon(String userId) {
        List<Coupon> list = new ArrayList<>();
        List<UserCoupon> allByuserId = userCouponDao.findAllByuserId(userId);
        if(null!=allByuserId){
            for (UserCoupon userCoupon : allByuserId) {
                Coupon coupon = new Coupon();
                Coupon allById = couponDao.findAllByIdAndStatus(userCoupon.getCouponId(),"1");
                if(null!=allById) {
                    coupon.setCouponTitle(allById.getCouponTitle());
                    coupon.setCouponValue(allById.getCouponValue());
                    coupon.setStartTime(allById.getStartTime());
                    coupon.setEndTime(allById.getEndTime());
                    coupon.setScopeofUse(allById.getScopeofUse());
                    list.add(coupon);
                }
            }
        }
        return list;
    }
}
