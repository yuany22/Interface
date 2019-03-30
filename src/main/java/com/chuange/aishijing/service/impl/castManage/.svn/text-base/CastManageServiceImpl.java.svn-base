package com.chuange.aishijing.service.impl.castManage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.castmanager.CastManagerDao;
import com.chuange.aishijing.dao.castsystem.CastSystemDao;
import com.chuange.aishijing.dao.castsystem.RoleManagerDao;
import com.chuange.aishijing.dao.classesmanager.ClassesManagerDao;
import com.chuange.aishijing.dao.recommendManage.SuccessCaseDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.dao.vedioManage.VedioManageDao;
import com.chuange.aishijing.dto.UserDTO;
import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.recommendmanage.SuccessCases;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.service.castManage.CastManageService;
import com.mysql.jdbc.StringUtils;
/**
 * 
 * @author yuany
 * 成功案例
 */
@Service
@Transactional
public class CastManageServiceImpl implements CastManageService{
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
	@Autowired
	private SuccessCaseDao successCaseDao;
	@Autowired
	private CastSystemDao castSystemDao;
	@Autowired
	private RoleManagerDao roleManageDao;
	@Autowired
	private VedioManageDao vedioManageDao;
	@Autowired
	private CastManagerDao castManageDao;
	@Autowired
	private UserManageDao userManageDao;
	@Autowired
	private ClassesManagerDao classesManageDao;
	/**
	 * 成功案例
	 */
	@Override
	public List<SuccessCases> queryAllSuccesses() {
		// TODO Auto-generated method stub
		return successCaseDao.findAll();
	}
	/**
	 * 最新剧本
	 */
	@Override
	public List<Drama> selectAllNewCast() {
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("recruitStartTime");
		Sort sort = Sort.by(order);
		return castSystemDao.findAll(sort);
	}
	/**
	 * 剧本详情
	 */
	@Override
	public Drama selectDramaById(String id) {
		// TODO Auto-generated method stub
		return castSystemDao.findById(id).get();
	}
	/**
	 * 剧本参演角色
	 */
	@Override
	public List<Role> selectRolesByCast(String castid) {
		// TODO Auto-generated method stub
		return roleManageDao.findAllByCastid(castid);
	}
	/**
	 * 热门试镜
	 */
	@Override
	public List<Video> selectAllHotTry(String castid) {
		// TODO Auto-generated method stub
		return vedioManageDao.findAllHotTry(castid);
	}

	/**
	 * 剧组详情
	 */
	@Override
	public Cast selectCastInfo(String castid) {
		// TODO Auto-generated method stub
		return castManageDao.findById(castid).get();
	}
	/**
	 * 最新试镜
	 */
	@Override
	public List<Video> selectNewPlay() {
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("publishTime");
		Sort sort = Sort.by(order);
		return vedioManageDao.findAllByVedioType("2",sort);
	}
	/**
	 * 搜索页最新视频
	 */
	@Override
	public List<Video> selectNewVedioBySearch(String key) {
		
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("publishTime");
		Sort sort = Sort.by(order);
		return vedioManageDao.findBySearch(key,sort);
	}
	/**
	 * 最热
	 */
	@Override
	public List<Video> selectHotVedioBySearch(String key) {
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("clicks");
		Sort sort = Sort.by(order);
		return vedioManageDao.findBySearch(key,sort);
	}
	/**
	 * 搜索用户
	 */
	@Override
	public List<User> selectUsersBySearch(String key) {
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("id");
		Sort sort = Sort.by(order);
		return userManageDao.findBySearch(key,sort);
	}
	/**
	 * 用户高级搜索
	 * 
	 */
	@Override
	public Page<User> selectUsersByHighSearch(Integer pagesize, Integer currentPage, UserDTO user) {
		Sort sort = new Sort(Sort.Direction.ASC,"id");
		Pageable pageable =PageRequest.of(currentPage - 1,pagesize,sort);
		Page<User> pages=userManageDao.findAll(new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> list = new ArrayList<Predicate>();
	            if (!StringUtils.isNullOrEmpty(user.getAgefrom()) && !StringUtils.isNullOrEmpty(user.getAgeto())) {
	                list.add(criteriaBuilder.between(root.get("age").as(String.class), user.getAgefrom(), user.getAgeto()));
	            }else if(!StringUtils.isNullOrEmpty(user.getAgefrom()) && StringUtils.isNullOrEmpty(user.getAgeto())) {
	            	list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("age").as(String.class),  user.getAgefrom()));
	            }else if(StringUtils.isNullOrEmpty(user.getAgefrom()) && !StringUtils.isNullOrEmpty(user.getAgeto())) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("age").as(String.class),  user.getAgeto()));
	            }

	            if (user.getHeightfrom() != null && user.getHeightto()!= null) {
					list.add(criteriaBuilder.between(root.get("height").as(String.class), user.getHeightfrom(), user.getHeightto()));
	            }else if(user.getHeightfrom() != null && user.getHeightto()== null) {
		            list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("height").as(String.class),  user.getHeightfrom()));
	            }else if(user.getHeightfrom() == null && user.getHeightto()!= null) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("height").as(String.class), user.getHeightto()));
	            }

	            if (user.getWeightfrom()!=null && user.getWeightto()!=null) {
					list.add(criteriaBuilder.between(root.get("weight").as(String.class), user.getWeightfrom(), user.getWeightto()));
	            }else if(user.getWeightfrom() != null && user.getWeightto()== null) {
		            list.add(criteriaBuilder.greaterThanOrEqualTo(root.get("weight").as(String.class),  user.getWeightfrom()));
	            }else if(user.getWeightfrom() == null && user.getWeightto()!= null) {
	            	list.add(criteriaBuilder.lessThanOrEqualTo(root.get("weight").as(String.class), user.getWeightto()));
	            }
	            if(!StringUtils.isNullOrEmpty(user.getSex())) {
	            	list.add(criteriaBuilder.equal(root.get("sex").as(String.class), user.getSex()));
	            }
	            if(!StringUtils.isNullOrEmpty(user.getSpecial())) {
	            	list.add(criteriaBuilder.like(root.get("specialLabel").as(String.class),"%" + user.getSpecial() + "%"));
	            }
	            if(!StringUtils.isNullOrEmpty(user.getJob())) {
	            	list.add(criteriaBuilder.like(root.get("jobLabel").as(String.class),"%" + user.getJob() + "%"));
	            }
	            Predicate[] p = new Predicate[list.size()];
	            return criteriaBuilder.and(list.toArray(p));
			}
			
		},pageable);
		return pages;
	}
	/**
	 * 剧本搜索
	 */
	@Override
	public List<Drama> selectCastsBySearch(String castname, String type) {
		// TODO Auto-generated method stub
		return castSystemDao.findBySearch(castname, type);
	}
	/**
	 * 课程搜索
	 */
	@Override
	public List<Classes> selectClassesBySearch(String className) {
		// TODO Auto-generated method stub
		return classesManageDao.findBySearch(className);
	}
	/**
	 * 角色详情
	 */
	@Override
	public Role selectRoleInfo(String roleid) {
		// TODO Auto-generated method stub
		return roleManageDao.findById(roleid).get();
	}
	/**
	 * 最热试镜
	 */
	@Override
	public List<Video> selectHotPlay() {
		// TODO Auto-generated method stub
		Sort.Order order = Sort.Order.desc("clicks");
		Sort sort = Sort.by(order);
		return vedioManageDao.findAllByVedioType("2",sort);
	}

}
