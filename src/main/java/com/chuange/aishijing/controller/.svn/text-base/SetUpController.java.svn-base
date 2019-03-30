package com.chuange.aishijing.controller;

import com.chuange.aishijing.pojo.operatemanage.FeedbackManager;
import com.chuange.aishijing.service.setup.SetUpService;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-06.
 */
@RestController
public class SetUpController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private SetUpService setUpService;
    @RequestMapping("updateLoginPassword")
    public ResultModel updateLoginPassword(@RequestParam String telphone,@RequestParam String code,@RequestParam String password){
        String ss =(String) redisTemplate.opsForValue().get(telphone + "code");
        Map<String,Object> map = new HashMap();
        if(code.equals(ss)){
            int i = setUpService.updateUserPasswordByTel(telphone, password);
            if(i==1){
            map.put("data","修改成功");
            return ResultTools.result(0,"",map);
            }else{
            map.put("data","修改失败");
            return ResultTools.result(0,"",map);
            }
        }else{
            map.put("data","验证码有误");
        }
        return ResultTools.result(1,"",map);
    }
    @RequestMapping("updateLoginTelphone")
    public ResultModel updateLoginTelphone(@RequestParam String telphone,@RequestParam String code,@RequestParam String newTel){
        String ss =(String) redisTemplate.opsForValue().get(telphone + "code");
        Map<String,Object> map = new HashMap();
        if(code.equals(ss)){
            int i = setUpService.updateTelphoneByTel(telphone, newTel);
            if(1==i){
                map.put("data","修改手机号成功");
                return ResultTools.result(0,"",map);
            }else{
                map.put("data","修改手机失败");
                return ResultTools.result(0,"",map);
            }
        }else{
            map.put("data","验证码有误");
        }
        return ResultTools.result(1,"",map);
    }

    @RequestMapping("insertFeedback")
    public ResultModel insertFeedback(@RequestParam String content,@RequestParam String telphone){
        Map<String,Object> map = new HashMap();
        FeedbackManager feedbackManager = setUpService.insertFeedback(content, telphone);
        map.put("data",feedbackManager);
        return ResultTools.result(0,"",map);
    }



}
