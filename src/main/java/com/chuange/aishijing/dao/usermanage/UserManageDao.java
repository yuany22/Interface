package com.chuange.aishijing.dao.usermanage;


import com.chuange.aishijing.pojo.userManage.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.User.class, idClass = Long.class)
public interface UserManageDao extends JpaRepository<User, Long>,JpaSpecificationExecutor<User>{
	/**
	 * 分页全部查询
	 */
	 Page<User> findAll(Pageable pageable);
	/**
	 * 根据用户名查询信息
	 */
	 User findAllByTelphone(String usernamelogin);
	 /**
	  * 分页模糊查询
	  */
	 @Override
	 Page<User> findAll(Specification<User> spec, Pageable pageable);
	 /**
	  * 用户详情查询
	  */
	 @Override
	 Optional<User> findById(Long id);

	 User findAllById(Long id);

	 /**
	  * 按昵称搜索
	  * @param key
	  * @param sort
	  * @return
	  */
	 @Query(value="from User where username like CONCAT('%',:key,'%') or id like CONCAT('%',:key,'%') ")
		public List<User> findBySearch(String key,Sort sort);

	 @Transactional
	 @Query(value = "update asj_user u set u.password=?1 where u.telphone =?2 ",nativeQuery = true)
	 @Modifying(clearAutomatically = true)
	int updatePasswordByTelphone1(String password,String telphone);

	@Transactional
	@Query(value = "update asj_user u set u.telphone=?1 where u.id =?2 ",nativeQuery = true)
	@Modifying(clearAutomatically = true)
	int updateTelphone(String newtel,Long id);

	User findAllBytelphone(String tel);


}
