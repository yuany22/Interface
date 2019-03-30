package com.chuange.aishijing.controller;

import com.chuange.aishijing.pojo.recommendmanage.Coupon;
import com.chuange.aishijing.pojo.userManage.UserFans;
import com.chuange.aishijing.service.InteractiveInformation.InteractiveInformationService;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.vo.interactiveinformationvo.BuyClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.MyLoveClassResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.UserFansResponse;
import com.chuange.aishijing.vo.interactiveinformationvo.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-05.
 */
@RestController
public class InteractiveInformation {
    @Autowired
    private InteractiveInformationService interactiveInformationService;

    @RequestMapping("selectFans")
    public ResultModel selectFans(@RequestParam String userId){
        List<UserFansResponse> userFanss = interactiveInformationService.selectUserFans(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",userFanss);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("addFans")
    public ResultModel addFans(@RequestParam String userId,@RequestParam String attentionId){
        String s = interactiveInformationService.insertUserFans(userId, attentionId);
        Map<String,Object> map = new HashMap();
        map.put("data",s);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectAttend")
    public ResultModel selectAttend(@RequestParam String userId){
        List<UserFansResponse> userFansResponses = interactiveInformationService.selectMyAttend(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",userFansResponses);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("deleteAttend")
    public ResultModel deleteAttend(@RequestParam String attenId){
        interactiveInformationService.deleteByAttendId(attenId);
        Map<String,Object> map = new HashMap();
        map.put("data","1");
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectMyComment")
    public ResultModel selectMyComment(){
        Map<String,Object> map = new HashMap();
        map.put("data","1");
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectMyVideo")
    public ResultModel selectMyVideo(@RequestParam String userId){
        List<VideoResponse> videoResponses = interactiveInformationService.selectAllMyVideo(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",videoResponses);
        return ResultTools.result(0,"",map);
    }

    @RequestMapping("selectBuyClasses")
    public ResultModel selectBuyClasses(@RequestParam String userId){
        List<BuyClassResponse> buyClassResponses = interactiveInformationService.selectBuyClasses(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",buyClassResponses);
        return ResultTools.result(0,"",map);
    }

    @RequestMapping("selectMyLoveClasses")
    public ResultModel selectMyLoveClasses(@RequestParam String userId){
        List<MyLoveClassResponse> myLoveClassResponses = interactiveInformationService.selectMyLoveClass(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",myLoveClassResponses);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectMyCoupon")
    public ResultModel selectMyCoupon(@RequestParam String userId){
        List<Coupon> list = interactiveInformationService.selectMyCoupon(userId);
        Map<String,Object> map = new HashMap();
        map.put("data",list);
        return ResultTools.result(0,"",map);

    }

    @RequestMapping("selectInterviewMy")
    public ResultModel selectInterviewMy(@RequestParam String userId){
        //查询邀请我的
//        Map<String,Object> map = new HashMap();
//        map.put("data",list);
//        return ResultTools.result(0,"",map);
        return null;
    }
}
