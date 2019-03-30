package com.chuange.aishijing.controller;

import com.chuange.aishijing.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
public class SmsDemo {

	@Autowired
	private RedisTemplate redisTemplate;
	public static void main(String[] args) throws InterruptedException {
		String url="http://www.api.zthysms.com/sendSms.do";
		String username="cgcx888hy";  //账e号
		String password="6AUzU8";  //密码
		String tkey= TimeUtil.getNowTime("yyyyMMddHHmmss");
		String mobile="18611596145";  //发送的手机号
		String content="【传格科技】 祝您元宵节快乐";   //内容
		String random = MD5Gen.getRandNum(6);
		System.out.println("6位随机数:"+random);
		//String time="2016-09-06 17:48:22";//定时信息所需参数时间格式为yyyy-MM-dd HH:mm:ss
		String xh="";
		try {
			content=URLEncoder.encode(content, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String param="url="+url+"&username="+username+"&password="+ MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&mobile="+mobile+"&content="+content+"&xh="+xh;
		//String param="url="+url+"&username="+username+"&password="+MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&time="+time+"&mobile="+mobile+"&content="+content+"&xh="+xh;//定时信息url输出
		String ret= HttpRequest.sendPost(url,param);//定时信息只可为post方式提交
		System.out.println("ret:"+ret);
		System.out.println(param);

	}
	@RequestMapping("getCode")
	public ResultModel SmsLogin(@RequestParam String telphone){
		String url="http://www.api.zthysms.com/sendSms.do";
		String username="cgcx888hy";  //账e号
		String password="6AUzU8";  //密码
		String tkey= TimeUtil.getNowTime("yyyyMMddHHmmss");
		String mobile=telphone;  //发送的手机号
		String random = MD5Gen.getRandNum(6);
		redisTemplate.opsForValue().set(telphone+"code",random,1,TimeUnit.MINUTES);
		String content="【爱试镜】 验证码:"+random+". 您正在使用短信验证码登录功能,该验证码仅用于身份验证,请勿泄露给他人使用.";   //内容

		//String time="2016-09-06 17:48:22";//定时信息所需参数时间格式为yyyy-MM-dd HH:mm:ss
		String xh="";
		try {
			content=URLEncoder.encode(content, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String param="url="+url+"&username="+username+"&password="+ MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&mobile="+mobile+"&content="+content+"&xh="+xh;
		//String param="url="+url+"&username="+username+"&password="+MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&time="+time+"&mobile="+mobile+"&content="+content+"&xh="+xh;//定时信息url输出
		String ret= HttpRequest.sendPost(url,param);//定时信息只可为post方式提交
		Map<String,Object> map = new HashMap<>();
		map.put("content",ret);
		return ResultTools.result(0,"",map);
	}
	@RequestMapping("getCodeToSetPassword")
	public ResultModel getCodetoSetPassword(@RequestParam String telphone){
		String url="http://www.api.zthysms.com/sendSms.do";
		String username="cgcx888hy";  //账e号
		String password="6AUzU8";  //密码
		String tkey= TimeUtil.getNowTime("yyyyMMddHHmmss");
		String mobile=telphone;  //发送的手机号
		String random = MD5Gen.getRandNum(6);
		redisTemplate.opsForValue().set(telphone+"password",random,1,TimeUnit.MINUTES);
		String content="【爱试镜】 验证码:"+random+". 您正在使用短信验证修改密码功能,该验证码仅用于身份验证,请勿泄露给他人使用.";   //内容

		//String time="2016-09-06 17:48:22";//定时信息所需参数时间格式为yyyy-MM-dd HH:mm:ss
		String xh="";
		try {
			content=URLEncoder.encode(content, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String param="url="+url+"&username="+username+"&password="+ MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&mobile="+mobile+"&content="+content+"&xh="+xh;
		//String param="url="+url+"&username="+username+"&password="+MD5Gen.getMD5(MD5Gen.getMD5(password)+tkey)+"&tkey="+tkey+"&time="+time+"&mobile="+mobile+"&content="+content+"&xh="+xh;//定时信息url输出
		String ret= HttpRequest.sendPost(url,param);//定时信息只可为post方式提交
		Map<String,Object> map = new HashMap<>();
		map.put("content",ret);
		return ResultTools.result(0,"",map);
	}
	@RequestMapping("/judgeCode")
	public ResultModel judgeCode(@RequestParam String telphone,@RequestParam String code,@RequestParam String flag){
		String ss ="";
		if(flag.equals("1")){
			 ss =(String) redisTemplate.opsForValue().get(telphone+"code");
		}
		if(flag.equals("0")){
			 ss =(String) redisTemplate.opsForValue().get(telphone+"password");
		}
		Map<String,Object> map = new HashMap<>();
		if(telphone==null||telphone.equals("")){
			map.put("content","手机不能为空");
			return ResultTools.result(1,"",map);
		}
		if(code==null||code.equals("")){
			map.put("content","验证码为空");
			return ResultTools.result(1,"",map);
		}
		if(ss==null){
			map.put("content","该手机未获取验证码");
			return ResultTools.result(1,"",map);
		}
		if(ss.equals(code)){
			map.put("content","S");
			if(flag.equals("0")){
				redisTemplate.delete(telphone+"password");
			}else{
				redisTemplate.delete(telphone+"code");
			}
			return ResultTools.result(0,"",map);
		}
		map.put("content","验证码有误");
		return ResultTools.result(1,"",map);
	}

	}
//}