package com.chuange.aishijing.controller;

import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.recommendmanage.MovieAudio;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.homepage.VedioManageService;
import com.chuange.aishijing.service.shot.ShotService;
import com.chuange.aishijing.util.NotifyData;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.util.Signature;
import com.chuange.aishijing.vo.shotvo.HotDramaResponse;
import com.chuange.aishijing.vo.shotvo.RoleTypeRequest;
import com.qcloud.vod.VodApi;
import com.qcloud.vod.response.VodUploadCommitResponse;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.vod.v20180717.VodClient;
import com.tencentcloudapi.vod.v20180717.models.ConfirmEventsRequest;
import com.tencentcloudapi.vod.v20180717.models.ConfirmEventsResponse;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2019-02-22.
 */
@RestController
public class ShotController {
    @Autowired
    private ShotService shotService;
    @Autowired
	private VedioManageService vedioManageService;
    private final static String SECRET_ID = "AKIDSntoX6CWwpX5RgqO9k2a0GLG3EErscns";
    private final static String SECRET_KEY = "99fMVTFqFRSO9ey788xbieSDqLfooeKU";
    /**
     * 签名
     * @return
     */
    @RequestMapping("upload/getSignature")
    public ResultModel signature() {
    	Map<String,Object> map = new HashMap<String,Object>();
    	try {
	    	Signature sign = new Signature();
	        sign.setSecretId(SECRET_ID);
	        sign.setSecretKey(SECRET_KEY);
	        sign.setCurrentTime(System.currentTimeMillis() / 1000);
	        sign.setRandom(new Random().nextInt(java.lang.Integer.MAX_VALUE));
	        sign.setSignValidDuration(3600 * 24 * 2);

            String signature = sign.getUploadSignature();
            map.put("signature",signature);
            System.out.println("signature : " + signature);
            return ResultTools.result(0,"",map);
        } catch (Exception e) {
        	map.put("signature","获取签名失败");
            System.out.print("获取签名失败");
            e.printStackTrace();
            return ResultTools.result(1,"",map);
        }
    }
    /**
     * 回调
     * @param version
     * @param eventType
     * @param data
     * @return
     */
    @RequestMapping("upload/notify")
    public ResultModel uploadNotify(String version,String eventType,NotifyData data) {
    	Map<String, Object> map = new HashMap<String,Object>();
           /*  Credential cred = new Credential("AKIDSntoX6CWwpX5RgqO9k2a0GLG3EErscns", "99fMVTFqFRSO9ey788xbieSDqLfooeKU");
             
             HttpProfile httpProfile = new HttpProfile();
             httpProfile.setEndpoint("vod.tencentcloudapi.com");

             ClientProfile clientProfile = new ClientProfile();
             clientProfile.setHttpProfile(httpProfile);            
             
             VodClient client = new VodClient(cred, "ap-beijing", clientProfile);
             
             String params = "{\"EventHandles\":[\"111\"]}";
             ConfirmEventsRequest req = ConfirmEventsRequest.fromJsonString(params, ConfirmEventsRequest.class);
             
             ConfirmEventsResponse resp = client.ConfirmEvents(req);
             
             System.out.println(ConfirmEventsRequest.toJsonString(resp));
             return ResultTools.result(0, "查询成功", map);*/
    		 map.put("response", "success");
    		 return ResultTools.result(0, "上传成功", map);
    }
    /**
	 * 视频信息
	 */
	@RequestMapping("/uploadVedio")
	public ResultModel uploadVideo(Video vedio) {
		//VodApi vodApi = new VodApi(SECRET_ID, SECRET_KEY);
	//	VodUploadCommitResponse response;
		//	response = vodApi.upload("/Users/apple/pic/WeChatSight5.mp4", "/Users/apple/pic/1afc8aaa707646349ac9e8b9b00e88b7.jpeg");
			//返回视频ID
		//	System.out.println(response.getFileId());
			//id
		//	vedio.setId(response.getFileId());
			//发布人
			//关联ID
			//视频名称
			//所属剧本
			//视频状态
			//存入视频表
			Map<String, Object> map = new HashMap<String,Object>();
			 vedio=vedioManageService.save(vedio);
			 map.put("response", vedio);
    		 return ResultTools.result(0, "上传成功", map);
			// TODO Auto-generated catch block
	}
    @RequestMapping("selectCastType")
    public ResultModel selectCastType(){//查询剧本类型
        List<Dictionary> castTypes = shotService.selectAllCastType();
        Map<String,Object> map = new HashMap();
        map.put("data",castTypes);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectHotDrama")
    public ResultModel selectHotDrama(){//查询热门剧本
        List<HotDramaResponse> list = shotService.selectHotDrama();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
       return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("selectMovieAudio")
    public ResultModel selectMovieAudio(){
        List<MovieAudio> list = shotService.selectMovieAudio();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("selectHotRole")
    public ResultModel selectHotRole(){
        List<Role> list = shotService.selectHotRole();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }
    @RequestMapping("selectRoleType")
    public ResultModel selectRoleType(){
        List<Dictionary> list = shotService.selectRoleType();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("selectcommonRole")
    public ResultModel selectcommonRole(){
        List<Role> list = shotService.selectCommonRole();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("castSearch")
    public ResultModel castSearch(@RequestParam String content){
        List list = shotService.selectCastByLike(content);
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }
    @RequestMapping("roleSearch")
    public ResultModel roleSearch(@RequestParam String content){
        List<Role> list = shotService.selectRoleByLike(content);
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("castTypeSearch")
    public ResultModel castTypeSearch(@RequestParam String castType){
        List<Drama> list = shotService.selectCastByType(castType);
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("roleTypeSearch")
    public ResultModel roleTypeSearch(@RequestBody RoleTypeRequest roleTypeRequest){
        List<Role> list = shotService.selectRoleByType(roleTypeRequest);
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }

    @RequestMapping("selectAllHotCast")
    public ResultModel selectAllHotCast(){
        List list = shotService.selectAllCastByRecommend();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }


    @RequestMapping("selectAllRoleByRecommend")
    public ResultModel selectAllRoleByRecommend(){
        List list = shotService.selectAllRoleByRecommend();
        Map<String, Object> map = new HashMap();
        map.put("data", list);
        return ResultTools.result(0, "查询成功", map);
    }


}
