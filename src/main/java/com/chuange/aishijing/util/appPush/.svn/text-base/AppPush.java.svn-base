package com.chuange.aishijing.util.appPush;
import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.AppMessage;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.LinkTemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class AppPush {

    //定义常量, appId、appKey、masterSecret 采用本文档 "第二步 获取访问凭证 "中获得的应用配置
    private static String appId = "1Bmm6FB7pU9OZI1awd4VhA";
    private static String appKey = "ksK5Snw3bC8Reei6Dsosy3";
    private static String masterSecret = "sw1D9LIUqA7YMTu4lQXZ7";
    private static String url = "http://sdk.open.api.igexin.com/apiex.htm";
    @RequestMapping("/tryPlayPush")
    @ResponseBody
    public static String TryPlaypush(String flag)  {

        IGtPush push = new IGtPush(url, appKey, masterSecret);

        // 定义"点击链接打开通知模板"，并设置标题、内容、链接
        LinkTemplate template = new LinkTemplate();
        template.setAppId(appId);
        template.setAppkey(appKey);
        if(flag.equals("1")) {
        	template.setTitle("初审结果");
        	template.setText("恭喜你通过初审");
        	
        }else if(flag.equals("2")) {
        	template.setTitle("二审结果");
        	template.setText("恭喜你通过二次审核");
        }else {
        	template.setTitle("试镜邀请");
        	template.setText("恭喜你通过二次审核，节目组邀请你来试镜");
        }
        template.setUrl("http://getui.com");

        List<String> appIds = new ArrayList<String>();
        appIds.add(appId);

        // 定义"AppMessage"类型消息对象，设置消息内容模板、发送的目标App列表、是否支持离线发送、以及离线消息有效期(单位毫秒)
        AppMessage message = new AppMessage();
        message.setData(template);
        message.setAppIdList(appIds);
        message.setOffline(true);
        message.setOfflineExpireTime(1000 * 600);

        IPushResult ret = push.pushMessageToApp(message);
        System.out.println(ret.getResponse().toString());
        return ret.getResponse().toString();
    }
}


