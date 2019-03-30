package com.chuange.aishijing.controller;



import java.io.File;
import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chuange.aishijing.pojo.checkSystem.CastCertified;
import com.chuange.aishijing.pojo.checkSystem.Certification;
import com.chuange.aishijing.pojo.checkSystem.StarCertified;
import com.chuange.aishijing.pojo.uploadpicture.UploadPicture;
import com.chuange.aishijing.service.checkSystem.AuditSystemService;
import com.chuange.aishijing.service.userManage.UserManageService;
import com.chuange.aishijing.util.CommonConstant;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.vo.servicevo.uploadpicture.UploadPictureResponse;
/**
 * 
 * @author yuany
 * 来试镜
 *
 */
@Controller
@SpringBootApplication
@RequestMapping(value="check")
public class CheckController {
	@Autowired
	private AuditSystemService auditSystemService;
	@Autowired
	private UserManageService userManageService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	public void upload( MultipartFile files,String filePath) {
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
	            //String filePath = CommonConstant.UPLOAD_PATH+userid+"//";//服务器用户头像路径
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
	            } catch (IllegalStateException e) {
	                e.printStackTrace();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	/**
	 * 上传身份证
	 * @param files
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/uploadIdPic")
	 @ResponseBody
	public ResultModel uploadIdPic(MultipartFile[] files,String userid) {
		String filePath = CommonConstant.UPLOAD_PATH+userid+"/realCertify/";
		Map<String, Object> map = new HashMap<String, Object>();
		if(files!=null) {
			for (MultipartFile multipartFile : files) {
				if (multipartFile.isEmpty()) {
					return ResultTools.result(1006, "", null);
				}else {
					upload(multipartFile,filePath);
					map.put("data", userid+"/realCertify/"+multipartFile.getOriginalFilename());
				}
			}
		}
		return ResultTools.result(0, "", map);
	}
	/**
	 * 上传星认证
	 * @param files
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/uploadStarPic")
	 @ResponseBody
	public ResultModel uploadStarPic(MultipartFile[] files,String userid) {
		String filePath = CommonConstant.UPLOAD_PATH+userid+"/starCertify/";
		Map<String, Object> map = new HashMap<String, Object>();
		if(files!=null) {
			for (MultipartFile multipartFile : files) {
				if (multipartFile.isEmpty()) {
					return ResultTools.result(1006, "", null);
				}else {
					upload(multipartFile,filePath);
					map.put("data", userid+"/starCertify/"+multipartFile.getOriginalFilename());
				}
			}
		}
		return ResultTools.result(0, "", map);
	}
	/**
	 * 上传剧组
	 * @param files
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/uploadCastPic")
	@ResponseBody
	public ResultModel uploadCastPic(MultipartFile[] files,String userid) {
		String filePath = CommonConstant.UPLOAD_PATH+userid+"/castCertify/";
		Map<String, Object> map = new HashMap<String, Object>();
		if(files!=null) {
			for (MultipartFile multipartFile : files) {
				if (multipartFile.isEmpty()) {
					return ResultTools.result(1006, "", null);
				}else {
					upload(multipartFile,filePath);
					map.put("data", userid+"/castCertify/"+multipartFile.getOriginalFilename());
				}
			}
		}
		return ResultTools.result(0, "", map);
	}
	/**
	 * 实名认证
	 * @return
	 */
	 @RequestMapping(value="/applyRealCertify")
	 @ResponseBody
	public ResultModel applyRealCertify(Certification certify) {
		try {
			certify=auditSystemService.realCertified(certify);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("certify", certify);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
	 /**
	  * 星认证
	  * @return
	  */
	 @RequestMapping(value="/applyStarCertify")
	 @ResponseBody
	 public ResultModel applyStarCertify(StarCertified starCertify) {
		 try {
			 starCertify=auditSystemService.starCertified(starCertify);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("starCertify", starCertify);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	 /**
	  * 剧组认证
	  * @return
	  */
	 @RequestMapping(value="/applyCastCertify")
	 @ResponseBody
	 public ResultModel applyCastCertify(CastCertified castCertify) {
		 try {
			 castCertify=auditSystemService.castCertified(castCertify);
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("castCertify", castCertify);
			 return ResultTools.result(0, "", map);
		 } catch (Exception e) {
			 return ResultTools.result(404, e.getMessage(), null);
		 }
	 }
	
}
