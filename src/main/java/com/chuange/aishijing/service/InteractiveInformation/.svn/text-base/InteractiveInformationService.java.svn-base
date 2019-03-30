package com.chuange.aishijing.service.InteractiveInformation;

import com.chuange.aishijing.pojo.classessys.ClassesOrder;
import com.chuange.aishijing.pojo.recommendmanage.Coupon;
import com.chuange.aishijing.pojo.userManage.UserFans;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.vo.interactiveinformationvo.BuyClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.MyLoveClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.UserFansResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.VideoResponse;

import java.util.List;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface InteractiveInformationService {
    //查询我的粉丝
    List<UserFansResponse> selectUserFans(String userid);
    //关注用户
    String insertUserFans(String userId,String attentionId);
    //查询我的关注
    List<UserFansResponse> selectMyAttend(String userId);
    //取消关注
    String deleteByAttendId(String attendId);
    //查询我的点评




    //查询我的作品
    List<VideoResponse> selectAllMyVideo(String userId);
    //我购买的课程
    List<BuyClassResponse> selectBuyClasses(String userId);
    //我想学的课程
    List<MyLoveClassResponse> selectMyLoveClass(String userId);
    //查询我的优惠券
    List<Coupon> selectMyCoupon(String userId);
}
