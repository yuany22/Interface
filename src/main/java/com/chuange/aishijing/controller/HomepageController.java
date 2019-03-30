package com.chuange.aishijing.controller;



import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chuange.aishijing.pojo.uploadpicture.UploadPicture;
import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.pojo.videoSystem.VideoComment;
import com.chuange.aishijing.pojo.videoSystem.VideoScore;
import com.chuange.aishijing.service.homepage.VedioManageService;
import com.chuange.aishijing.service.userManage.UserManageService;
import com.chuange.aishijing.service.userManage.VedioReportService;
import com.chuange.aishijing.util.CommonConstant;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.vo.servicevo.uploadpicture.UploadPictureResponse;
/**
 * 
 * @author yuany
 * 主页
 *
 */
@Controller
@SpringBootApplication
@RequestMapping(value="home")
public class HomepageController {
	@Autowired
	private UserManageService userManageService;
	@Autowired
	private VedioReportService vedioReportService;
	@Autowired
	private VedioManageService vedioManageService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	 public void upload( MultipartFile files,String userid) {
	        UploadPictureResponse uploadPictureResponse = new UploadPictureResponse();
	        UploadPicture uploadPicture = null;

	        if (files.isEmpty()) {
	            uploadPictureResponse.fail("图片为空");
	        }
	        // 获取文件名
	        String fileName = files.getOriginalFilename();
	        logger.info("上传的文件名为：" + fileName);
	        // 获取文件的后缀名
	        String suffixName = fileName.substring(fileName.lastIndexOf("."));
	        logger.info("上传的后缀名为：" + suffixName);

	        if (".jpg".equals(suffixName.trim()) || ".png".equals(suffixName.trim()) || ".gif".equals(suffixName.trim()) || ".jpeg".equals(suffixName.trim()) ) {

	            //fileName =id  + suffixName;
	            String filePath = CommonConstant.UPLOAD_PATH+userid+"/report/";//服务器用户头像路径
	            String destFileName = filePath + fileName;
	            logger.info("绝对图片路径：" + destFileName);
	            File dest = new File(destFileName);
	            // 检测是否存在目录
	            System.out.println(filePath + fileName);
	            if (!dest.getParentFile().exists()) {
	                dest.getParentFile().mkdirs();
	            }
	            try {
	                files.transferTo(dest);

	                uploadPicture = new UploadPicture();
	                uploadPicture.setMessage("上传图片成功");
	                uploadPicture.setPicName(fileName);
	                uploadPicture.setPicPath(filePath);
	                uploadPicture.setSuffixName(suffixName);
	                userManageService.uploadPicture(uploadPicture);
	                //保存图片名称和路径
	               // session.setAttribute("picname", fileName);
	    			Map<String, Object> map = new HashMap<String, Object>();
	    			map.put(fileName, uploadPicture);
	            } catch (IllegalStateException e) {
	                e.printStackTrace();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	/**
	 * 
	 * @param type 举报类型
	 * @param userid 当前用户ID
	 * @param reportedid 被举报用户ID
	 * @param files 截图
	 * @param other 举报内容
	 * @return
	 */
	 @RequestMapping(value="/report")
	 @ResponseBody
	public ResultModel createReportInfo(@RequestBody(required = false) MultipartFile files[],VideoAndCommentReportManager report) {
		try {
			if(files!=null) {
				for (MultipartFile multipartFile : files) {
					if (multipartFile.isEmpty()) {
						return ResultTools.result(1006, "", null);
					}else {
						upload(multipartFile,report.getReporterId());
					}
				}
			}
			VideoAndCommentReportManager reports=vedioReportService.insertReport(report);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("report", reports);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
	 /**
	  * 主页视频
	  * @return
	  */
	 @RequestMapping(value="/selectAllVedios")
	 @ResponseBody
	 public ResultModel selectAllVedios() {
		 try {
			 List<Video> list=vedioManageService.queryByPublishTime();
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("vedios", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 我的试镜
	  * @return
	  */
	 @RequestMapping(value="/selectMyTry")
	 @ResponseBody
	 public ResultModel selectMyTry(long userid) {
		 try {
			 List<Video> list=vedioManageService.selectAllByUserid(userid);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("vedios", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 我的作品
	  * @return
	  */
	 @RequestMapping(value="/selectMyProduct")
	 @ResponseBody
	 public ResultModel selectMyProduct(long userid) {
		 try {
			 List<Video> list=vedioManageService.selectAllProductByUserid(userid);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("vedios", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 所有评论
	  * @param userid
	  * @return
	  */
	 @RequestMapping(value="/selectAllComments")
	 @ResponseBody
	 public ResultModel selectAllComments(String vedioid) {
		 try {
			 List<VideoComment> list=vedioManageService.queryCommentById(vedioid);
			 if(list.isEmpty()) {
				 
				 return ResultTools.result(1002, "", null);
			 }
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("comments", list);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 新增评论
	  * @param userid
	  * @return
	  */
	 @RequestMapping(value="/insertComments")
	 @ResponseBody
	 public ResultModel insertComments(VideoComment comment) {
		 try {
			 VideoComment comm=vedioManageService.insertComment(comment);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("comment", comm);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 评分详情
	  * @param id
	  * @return
	  */
	 @RequestMapping(value="/selectScoreByVedio")
	 @ResponseBody
	 public ResultModel selectScoreByVedio(long id) {
		 try {
			 VideoScore score=vedioManageService.selectAvrScore(id);
			 Map<String, Object> map = new HashMap<String, Object>();
			 if(null==score) {
				 return ResultTools.result(1002, "", map);
			 }
			 map.put("score", score);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 新增评分
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/insertScoreByVedio")
	 @ResponseBody
	 public ResultModel insertScoreByVedio(VideoScore score) {
		 try {
			 score=vedioManageService.insertScore(score);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("score", score);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 分享页视频
	  * @param score
	  * @return
	  */
	 @RequestMapping(value="/shareVedio")
	 @ResponseBody
	 public ResultModel shareVedio(String id) {
		 try {
			 Video video=vedioManageService.selectById(id).get();
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("video", video);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	
}
