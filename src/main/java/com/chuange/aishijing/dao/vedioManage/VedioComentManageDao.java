package com.chuange.aishijing.dao.vedioManage;


import com.chuange.aishijing.pojo.videoSystem.VideoComment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;


@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.videoSystem.VideoComment.class, idClass = Long.class)
public interface VedioComentManageDao extends JpaRepository<VideoComment, Long>,JpaSpecificationExecutor<VideoComment>{
	
	/**
	 * 条件查询视频评论信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	List<VideoComment> findAllByCommentedVideo(String id);
	/**
	 * 更新
	 */
//	<S extends VideoComment> S saveAndFlush(VideoComment manager);
}
