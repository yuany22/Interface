package com.chuange.aishijing.controller;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.util.wxUtil.WXUtil;
import com.chuange.aishijing.util.wxUtil.WeiXinEntity;
import com.chuange.aishijing.util.wxUtil.WeiXinUtil;
/**
 * 
 * @author yuany
 * 分享
 *
 */
@Controller
@SpringBootApplication
public class WxShareController {
	@RequestMapping("/wx/sgtrue")
	@ResponseBody
	public ResultModel sgture(HttpServletRequest request) {
		String strUrl=request.getParameter("url");
		WeiXinEntity wx = WeiXinUtil.getWinXinEntity(strUrl);
		// 将wx的信息到给页面
		Map<String, Object> map = new HashMap<String, Object>();
		String sgture = WXUtil.getSignature(wx.getTicket(), wx.getNoncestr(), wx.getTimestamp(), strUrl);
		map.put("sgture", sgture.trim());//签名
		map.put("timestamp", wx.getTimestamp().trim());//时间戳
		map.put("noncestr",  wx.getNoncestr().trim());//随即串
        map.put("appid","wx44244f671c5dd7c5");//appID
        return ResultTools.result(0, "", map);
	}

}
