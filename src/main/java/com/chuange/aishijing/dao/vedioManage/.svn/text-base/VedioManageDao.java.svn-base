package com.chuange.aishijing.dao.vedioManage;


import com.chuange.aishijing.pojo.videoSystem.Video;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.videoSystem.Video.class, idClass = String.class)
public interface VedioManageDao extends JpaRepository<Video, String>,JpaSpecificationExecutor<Video>{
	/**
	 * 条件查询视频信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	@Query(value="from Video  order by publishTime desc")
	public List<Video> findByPublishTime();
	/**
	 * 作品
	 */
	@Query(value="from Video  where userId=:userId and vedioType=3 order by publishTime desc")
	public List<Video> findByUserId(Long userId);
	/**
	 * 	试镜
	 */
	@Query(value="from Video   where userId=:userId and vedioType=2 order by publishTime desc")
	public List<Video> findAllByUserId(Long userId);
	/**
	 * 热门试镜
	 */
	@Query(value="from Video   where castid=:castid and vedioType=2 order by clicks desc")
	public List<Video> findAllHotTry(String castid);
	/**
	 * 最热试镜
	 * @param type
	 * @return
	 */
	public List<Video> findAllByVedioType(String type,Sort sort);
	/**
	 * 搜索
	 * @param key
	 * @return
	 */
	@Query(value="from Video where videoName like CONCAT('%',:key,'%') order by publishTime desc")
	public List<Video> findBySearch(String key,Sort sort);



	List<Video> findAllByuserId(Long id);
}
