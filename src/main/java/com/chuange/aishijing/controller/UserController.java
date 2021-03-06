package com.chuange.aishijing.controller;



import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.login.MyCollections;
import com.chuange.aishijing.pojo.recommendmanage.Lable;
import com.chuange.aishijing.pojo.uploadpicture.UploadPicture;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.userManage.UserEducation;
import com.chuange.aishijing.pojo.userManage.UserMovie;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.systemManage.LableManageService;
import com.chuange.aishijing.service.userManage.MyCollectionService;
import com.chuange.aishijing.service.userManage.UserEducationService;
import com.chuange.aishijing.service.userManage.UserManageService;
import com.chuange.aishijing.util.CommonConstant;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.vo.servicevo.uploadpicture.UploadPictureResponse;
/**
 * 
 * @author yuany
 * 我的
 *
 */
@Controller
@SpringBootApplication
public class UserController {
	@Autowired
	private UserManageService userManageService;
	@Autowired
	private UserEducationService userEducationService;
	@Autowired
	private LableManageService lableManageService;
	@Autowired
	private MyCollectionService MyCollectionService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	/**
	 * 是否收藏
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="collection/ifExists")
	@ResponseBody
	public ResultModel ifRoleLike(MyCollections collection) {
		boolean result=MyCollectionService.ifExits(collection);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 收藏角色
	 * @param collection
	 * @return
	 */
	@RequestMapping(value="collection/createCollection")
	@ResponseBody
	public ResultModel collectRole(MyCollections collection) {
		collection=MyCollectionService.insertCollection(collection);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("collection", collection);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 取消收藏 0 角色 1 剧本 2 演员 3 视频
	 * @param userid
	 * @param proid
	 * @return
	 */
	@RequestMapping(value="collection/cancelCollection")
	@ResponseBody
	public ResultModel cancelCollect(MyCollections collection) {
		MyCollectionService.deleteCollection(collection);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "删除成功");
		return ResultTools.result(0, "", map);
	}
	/**
	 * 角色收藏列表
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="collection/selectCollectionRoles")
	@ResponseBody
	public ResultModel roleCollectionList(long userid) {
		List<Role> roles=MyCollectionService.selectAllRoleId(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roles", roles);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 演员收藏列表
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="collection/selectCollectionActors")
	@ResponseBody
	public ResultModel actorCollectionList(long userid) {
		List<User> users=MyCollectionService.selectAllActorId(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("users", users);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 剧本收藏列表
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="collection/selectCollectionCasts")
	@ResponseBody
	public ResultModel dramasCollectionList(long userid) {
		List<Drama> dramas=MyCollectionService.selectAllDramaId(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dramas", dramas);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 视频收藏列表
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="collection/selectCollectionVideos")
	@ResponseBody
	public ResultModel videoCollectionList(long userid) {
		List<Video> video=MyCollectionService.selectAllVideoId(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("video", video);
		return ResultTools.result(0, "", map);
	}
	/**
	 * 我的基础信息
	 */
	@RequestMapping(value="user/selectUserinfoById")
	@ResponseBody
	public ResultModel getUser(Long id) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			User user = userManageService.queryById(id).get();
			if (null == user) {
				return ResultTools.result(1002, "", null);
			}
			Map<String, Object> map = new HashMap<String, Object>();
			//教育 背景
			List<UserEducation> vo=userEducationService.queryEducationInfo(id.toString());
			//影视经历
			List<UserMovie> list=userManageService.queryMovies(id.toString());
			map.put("user", user);
			if(null != vo.get(0)) {
				map.put("education", vo.get(0));
			}else {
				map.put("education", vo);
			}
			map.put("movies", list);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}

	}
	/**
	 * 上传用户头像
	 * @param files
	 * @param req
	 * @param response
	 * @param session
	 * @return
	 */
	
	@RequestMapping("user/uploadMessageImg")
    @ResponseBody
    public ResultModel upload(@RequestBody(required = false) MultipartFile files[],Long id, HttpSession session) {
        UploadPictureResponse uploadPictureResponse = new UploadPictureResponse();
        UploadPicture uploadPicture = null;
        for(MultipartFile f : files){

        if (f.isEmpty()) {
            uploadPictureResponse.fail("图片为空");
            logger.info("文件为空");
            return ResultTools.result(1006, "", null);
        }
        // 获取文件名
        String fileName = f.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);

        if (".jpg".equals(suffixName.trim()) || ".png".equals(suffixName.trim()) || ".gif".equals(suffixName.trim()) || ".jpeg".equals(suffixName.trim()) ) {

            fileName =id  + suffixName;
            String filePath = CommonConstant.UPLOAD_PATH+id+"/headPic/";//服务器用户头像路径
            String destFileName = filePath + fileName;
            logger.info("绝对图片路径：" + destFileName);
            File dest = new File(destFileName);
            // 检测是否存在目录
            System.out.println(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                f.transferTo(dest);

                uploadPicture = new UploadPicture();
                uploadPicture.setMessage("上传图片成功");
                uploadPicture.setPicName(fileName);
                uploadPicture.setPicPath(filePath);
                uploadPicture.setSuffixName(suffixName);
                userManageService.uploadPicture(uploadPicture);
                //保存图片名称和路径
                session.setAttribute("picname", fileName);
                Optional<User> user = userManageService.queryById(id);
    			if (null == user.get()) {
    				return ResultTools.result(1002, "", null);
    			}
    			User userinfo=user.get();
    			userinfo.setUserPicture(destFileName);
    			userManageService.modifyByUserid(userinfo);
    			Map<String, Object> map = new HashMap<String, Object>();
    			map.put("content", userinfo);
    			map.put("pic", uploadPicture);
    			return ResultTools.result(0, "", map);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
        return ResultTools.result(1007, "", null);
    }
	/**
	 * 上传一组照片
	 * @return
	 */
	@RequestMapping("user/uploadUserPhotos")
    @ResponseBody
    public ResultModel uploadPhotos(@RequestBody(required = false) MultipartFile files[],Long id, HttpSession session) {
        UploadPictureResponse uploadPictureResponse = new UploadPictureResponse();
        UploadPicture uploadPicture = null;
        Map<String, Object> map = new HashMap<String, Object>();
        for(MultipartFile f : files){

        if (f.isEmpty()) {
            uploadPictureResponse.fail("图片为空");
            logger.info("文件为空");
            return ResultTools.result(1006, "", null);
        }
        // 获取文件名
        String fileName = f.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);

        if (".jpg".equals(suffixName.trim()) || ".png".equals(suffixName.trim()) || ".gif".equals(suffixName.trim()) || ".jpeg".equals(suffixName.trim()) ) {

           // fileName =id  + suffixName;
            String filePath = CommonConstant.UPLOAD_PATH+id+"/mypic/";//服务器用户风采图组
            String destFileName = filePath + fileName;
            logger.info("绝对图片路径：" + destFileName);
            File dest = new File(destFileName);
            // 检测是否存在目录
            System.out.println(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                f.transferTo(dest);

                uploadPicture = new UploadPicture();
                uploadPicture.setMessage("上传图片成功");
                uploadPicture.setPicName(fileName);
                uploadPicture.setPicPath(filePath);
                uploadPicture.setSuffixName(suffixName);
                userManageService.uploadPicture(uploadPicture);
                Optional<User> user = userManageService.queryById(id);
    			if (null == user.get()) {
    				return ResultTools.result(1002, "", null);
    			}
    			User userinfo=user.get();
    			userinfo.setMyPhotos(destFileName+",");
    			userManageService.modifyByUserid(userinfo);
                //保存图片名称和路径
    			
    			map.put(fileName, uploadPicture);
    			
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ResultTools.result(0, "", map);
        }
        return ResultTools.result(1007, "", null);
    }
	/**
	 * 删除图片
	 * @param id
	 * @return
	 */
	/*@RequestMapping("api/user/deleteUserPhotos")
    @ResponseBody
	public String delfile(String id){
       // TjrFile tjrFile =  fileService.findOne(id);
        try {
            //fileService.del(id);
            File file = new File(filePath+tjrFile.getUuidname());
            if (file.delete()) {
            	logger.info(file.getName() + "is deleted");
                return "true";
            } else {
            	logger.info("Delete failed.");
                return "false";
            }
        } catch (Exception e) {
        	logger.info("Exception occured");
            e.printStackTrace();
            return "false";
        }
    }*/
	/**
	 * 编辑身高
	 * @param id
	 * @return
	 */
	@RequestMapping(value="user/modifyUserHeightById")
	@ResponseBody
	public ResultModel modifyUser(Long id, String height) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setHeight(height);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑昵称
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifyUsernameById")
	@ResponseBody
	public ResultModel modifyUserName(Long id, String username) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setUsername(username);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑性别
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifySexById")
	@ResponseBody
	public ResultModel modifySex(Long id, String sex) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setSex(sex);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑图组
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifyPhotosById")
	@ResponseBody
	public ResultModel modifyPhotos(Long id, String myPhotos) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setMyPhotos(myPhotos);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑地区
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifyAreaById")
	@ResponseBody
	public ResultModel modifyArea(Long id, String area) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setArea(area);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑生日
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifyBirthById")
	@ResponseBody
	public ResultModel modifyBirth(Long id, String birth) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setBirthday(birth);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编头像
	 * @param id
	 * @param username
	 * @return
	 */
	@RequestMapping(value="user/modifyHeadById")
	@ResponseBody
	public ResultModel modifyPhoto(Long id, String head) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setUserPicture(head);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑体重
	 * @param id
	 * @param weight
	 * @return
	 */
	@RequestMapping(value="user/modifyUserWeightById")
	@ResponseBody
	public ResultModel modifyUserWeight(Long id,String weight) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setWeight(weight);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑自我介绍
	 * @param id
	 * @param weight
	 * @return
	 */
	@RequestMapping(value="user/modifyUserIntroduction")
	@ResponseBody
	public ResultModel modifyUserIntroduce(Long id, String introduce) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setIntroduceMyself(introduce);
			userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 编辑影视经历
	 * @param id
	 * @param weight
	 * @return
	 */
	@RequestMapping(value="user/modifyUserMovie")
	@ResponseBody
	public ResultModel modifyMovie(String id, UserMovie movie) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			UserMovie user = userManageService.modifyMovieByID(movie);
			if (null == user) {
				return ResultTools.result(1002, "", null);
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", user);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 删除影视经历
	 * @param id
	 * @return
	 */
	@RequestMapping(value="user/deleteUserMovie")
	@ResponseBody
	public ResultModel deleteMovie(String id) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			userManageService.deleteMovie(id);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", "删除成功");
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
	/**
	 * 编辑教育经历
	 * @param id
	 * @param weight
	 * @return
	 */
	@RequestMapping(value="user/modifyUserEducation")
	@ResponseBody
	public ResultModel modifyEducation(String id, UserEducation education) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			UserEducation user = userEducationService.modifyById(education);
			if (null == user) {
				return ResultTools.result(1002, "", null);
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", user);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}	
	/**
	 * 删除教育经历
	 * @param id
	 * @return
	 */
	@RequestMapping(value="user/deleteUserEducation")
	@ResponseBody
	public ResultModel deleteEducation(String id) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			userEducationService.deleteEducation(id);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content", "删除成功");
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}
		/**
		 * 编辑经纪公司
		 * @param id
		 * @param eco
		 * @return
		 */
		@RequestMapping(value="user/modifyBrokerageFirm")
		@ResponseBody
		public ResultModel modifyBrokerage(Long id,String firm) {
			try {
				if (null == id) {
					return ResultTools.result(1001, "", null);
				}
				Optional<User> user = userManageService.queryById(id);
				if (null == user.get()) {
					return ResultTools.result(1002, "", null);
				}
				User userinfo=user.get();
				userinfo.setEconomicCompany(firm);
				userManageService.modifyByUserid(userinfo);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content", userinfo);
				return ResultTools.result(0, "", map);
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
			
	}
	/**
	 * 添加教育经历
	 * @param edu
	 * @return
	 */
	@RequestMapping(value="user/createEducation")
	@ResponseBody
	public ResultModel createEducation( UserEducation edu) {
		try {
			if (null == edu) {
				return ResultTools.result(1001, "", null);
			}
			UserEducation eudc=userEducationService.insertEducation(edu);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content",eudc );
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 添加影视经历
	 * @param movie
	 * @return
	 */
	@RequestMapping(value="user/createMovie")
	@ResponseBody
	public ResultModel createMovie(UserMovie movie) {
		try {
			if (null == movie) {
				return ResultTools.result(1001, "", null);
			}
			userManageService.insertMovie(movie);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content",userManageService.insertMovie(movie) );
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
		
	}
	/**
	 * 更新职业标签 userid,description,type
	 * @param id
	 * @param lable
	 * @return
	 */
	@RequestMapping(value="user/modifyJobLabel")
	@ResponseBody
	public ResultModel modifyJobLable(Long id,String jobLabel) {
		try {
			if (null == id) {
				return ResultTools.result(1001, "", null);
			}
			Optional<User> user = userManageService.queryById(id);
			if (null == user.get()) {
				return ResultTools.result(1002, "", null);
			}
			User userinfo=user.get();
			userinfo.setJobLabel(jobLabel);
			userinfo=userManageService.modifyByUserid(userinfo);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("content",userinfo);
			return ResultTools.result(0, "", map);
		} catch (Exception e) {
			return ResultTools.result(404, e.getMessage(), null);
		}
	}	
		/**
		 * 更新好友印象 userid,description,type
		 * @param id
		 * @param lable
		 * @return
		 */
		@RequestMapping(value="user/modifyFriendLabel")
		@ResponseBody
		public ResultModel modifyFriendLabel(Long id,String friendLabel) {
			try {
				if (null == id) {
					return ResultTools.result(1001, "", null);
				}
				Optional<User> user = userManageService.queryById(id);
				if (null == user.get()) {
					return ResultTools.result(1002, "", null);
				}
				User userinfo=user.get();
				userinfo.setFriendsLabel(friendLabel);
				userinfo=userManageService.modifyByUserid(userinfo);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content",userinfo);
				return ResultTools.result(0, "", map);
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
			
	}
		/**
		 * 更新特长 userid,description,type
		 * @param id
		 * @param lable
		 * @return
		 */
		@RequestMapping(value="user/modifySpecialLabel")
		@ResponseBody
		public ResultModel modifySpecialLabel(Long id,String specialLabel) {
			try {
				if (null == id) {
					return ResultTools.result(1001, "", null);
				}
				Optional<User> user = userManageService.queryById(id);
				if (null == user) {
					return ResultTools.result(1002, "", null);
				}
				User userinfo=user.get();
				userinfo.setSpecialLabel(specialLabel);
				userinfo=userManageService.modifyByUserid(userinfo);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("content",userinfo);
				return ResultTools.result(0, "", map);
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
			
		}
		/**
		 * 查询标签
		 * @param id
		 * @param lable
		 * @return
		 */
		@RequestMapping(value="user/selectAllLables")
		@ResponseBody
		public ResultModel selectAllLabels() {
			try {
				
				Map<String, Object> map = new HashMap<String, Object>();
				List<Lable> special=lableManageService.queryAllLabels("2", "0");
				List<Lable> friend=lableManageService.queryAllLabels("1", "0");
				List<Lable> job=lableManageService.queryAllLabels("0", "0");
				map.put("special",special);
				map.put("friend",friend);
				map.put("job",job);
				return ResultTools.result(0, "", map);
			} catch (Exception e) {
				return ResultTools.result(404, e.getMessage(), null);
			}
			
		}
}
