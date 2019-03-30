package com.chuange.aishijing.service.userManage;



import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.uploadpicture.UploadPicture;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.userManage.UserLable;
import com.chuange.aishijing.pojo.userManage.UserMovie;
import com.chuange.aishijing.vo.servicevo.usermanage.UsersVO;
/**
 * 
 * @author yuany
 * 用户管理逻辑层接口
 *
 */
public interface UserManageService {
	//查询所有用户
	public Page<User> queryUserList(Integer pagesize,Integer currentPage);
	/**
	 * 模糊查询
	 */
	public UsersVO queryUserByConditions(Integer pagesize,Integer currentPage,UserDTO user,String keyword);
	/**
	 * 用户详情查询
	 */
	public Optional<User> queryById(Long id);
	/**
	 * 用户影视经历
	 * @param id
	 * @return影视经历
	 */
	public List<UserMovie> queryMovies(String id);
	/**
	 * 影视经历
	 * @param id
	 * @return影视经历
	 */
	public UserMovie queryMoviesById(String id);
	/**
	 * 编辑影视经历
	 * @param movie
	 * @return
	 */
	public UserMovie modifyMovieByID(UserMovie movie);
	/**
	 * 新增影视经历
	 * @param movie
	 */
	public UserMovie insertMovie(UserMovie movie);
	/**
	 * 删除影视经历
	 * @param id
	 */
	public void deleteMovie(String id);
	/**
	 * 更新账户状态
	 * @param user
	 */
	public User modifyByUserid(User user);
	/**
	 * 上传头像
	 * @param uploadPicture
	 */
	public void uploadPicture(UploadPicture uploadPicture);
}
