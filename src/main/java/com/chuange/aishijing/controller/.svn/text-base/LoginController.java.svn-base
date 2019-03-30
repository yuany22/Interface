package com.chuange.aishijing.controller;

import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.service.login.LoginService;
import com.chuange.aishijing.util.*;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019-02-21.
 */
@RestController
public class LoginController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private LoginService loginService;
    @RequestMapping("passwordLogin")
    public ResultModel login(@RequestParam String username, @RequestParam String password){
            if(StringUtils.isNullOrEmpty(username)||StringUtils.isNullOrEmpty(password)){
                Map<String, Object> map = new HashMap();
                map.put("data","用户名或密码不能为空");
                return ResultTools.result(1, "", map);
            }
            User user = loginService.selectUserByUsername(username);
            if(null==user){
                Map<String, Object> map = new HashMap();
                map.put("data","不存在该用户,请先注册");
                return ResultTools.result(1, "", map);
            }
            String passwordM = new MD5(password).compute();
            if (user.getPassword().equals(passwordM)) {
                String tokenValue = new MD5(TimeUtil.getNowTime()).compute();
                System.out.println("登录时token的值："+tokenValue);
                redisTemplate.opsForValue().set(username,tokenValue);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("tokenValue",tokenValue);
                return ResultTools.result(0, "", map);
            } else {
                Map<String, Object> map = new HashMap();
                map.put("data","登录失败,用户名或密码有误");
                return ResultTools.result(1, "", map);
            }

    }
    @RequestMapping("/registerLogin")
    public ResultModel register(@RequestParam String username,@RequestParam String password){
        if(StringUtils.isNullOrEmpty(username)||StringUtils.isNullOrEmpty(password)){
            Map<String, Object> map = new HashMap();
            map.put("data","用户名或密码不能为空");
            return ResultTools.result(1,"用户名或密码不能为空",map);
        }
        User userz = loginService.selectUserByUsername(username);
        if(null!=userz){
            Map<String, Object> map = new HashMap();
            map.put("data","该手机号已经注册过");
            return ResultTools.result(1,"111",map);
        }
        String passwordM = new MD5(password).compute();
            User user = new User();
            user.setTelphone(username);
            user.setPassword(passwordM);
            loginService.insertUser(user);
        return ResultTools.result(0,"注册成功",null);
    }
    @RequestMapping("/setPassowrd")
    public ResultModel setPassowrd(@RequestParam String username,@RequestParam String password){
        if(StringUtils.isNullOrEmpty(username)||StringUtils.isNullOrEmpty(password)){
            Map<String, Object> map = new HashMap();
            map.put("data","用户名或密码不能为空");
            return ResultTools.result(1,"用户名或密码不能为空",map);
        }
        User user = loginService.selectUserByUsername(username);
        if(null==user){
            Map<String, Object> map = new HashMap();
            map.put("data","不存在用户,请注册");
            return ResultTools.result(1,"不存在用户,请注册",map);
        }else{
            String passwordM = new MD5(password).compute();
            int i = loginService.updatePassword(username, passwordM);
            if(i==1){
                return ResultTools.result(0,"",null);
            }
        }
         return ResultTools.result(1,"",null);
    }

    @RequestMapping("codeLogin")
    public ResultModel codeLogin(@RequestParam String username,@RequestParam String code){
        if(StringUtils.isNullOrEmpty(username)||StringUtils.isNullOrEmpty(code)){
            Map<String, Object> map = new HashMap();
            map.put("data","用户名或验证码不能为空");
            return ResultTools.result(1,"",map);
        }
        String ss =(String) redisTemplate.opsForValue().get(username+"code");
        if (ss!=null) {
            if (ss.equals(code)) {
                redisTemplate.delete(username + "code");
                String tokenValue = new MD5(TimeUtil.getNowTime()).compute();
                System.out.println("登录时token的值："+tokenValue);
                redisTemplate.opsForValue().set(username,tokenValue);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("tokenValue",tokenValue);
                return ResultTools.result(0, "", map);
            } else {
                Map<String, Object> map = new HashMap();
                map.put("data","验证码有误");
                return ResultTools.result(1, "", map);
            }
        }else{
            Map<String, Object> map = new HashMap();
            map.put("data","获取验证码失败");
            return ResultTools.result(1, "", map);
        }
    }
    @RequestMapping("getToken")
    public ResultModel getToken(@RequestParam String username,@RequestParam String token){
        if(StringUtils.isNullOrEmpty(username)||StringUtils.isNullOrEmpty(token)){
            Map<String, Object> map = new HashMap();
            map.put("data","用户名或登录TOKEN不能为空");
            return ResultTools.result(1,"",map);
        }
        String redistoken = (String)redisTemplate.opsForValue().get(username);
        if(null!=token&&!token.equals("")){
            if(redistoken.equals(token)){
                return ResultTools.result(1005,"",null);
            }else{
                Map<String, Object> map = new HashMap();
                map.put("data","token有误");
                return ResultTools.result(1,"token有误",map);
            }
        }else {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tokenValue","token为空，请重新登录");
                return ResultTools.result(1,"",map);
        }
    }

}
