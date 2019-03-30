package com.chuange.aishijing.dao.usermanage;


import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager.class, idClass = String.class)
public interface VedioReportDao extends JpaRepository<VideoAndCommentReportManager, String>{
	/**
	 * 条件查询举报信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	Page<VideoAndCommentReportManager> findAll(Specification<VideoAndCommentReportManager> spec, Pageable pageable);
	/**
	 * 更新
	 */
	//<S extends VideoAndCommentReportManager> S saveAndFlush(VideoAndCommentReportManager manager);
	/**
	 * 用户举报历史
	 * @param userid
	 * @return
	 */
	Page<VideoAndCommentReportManager>  findAllByReportedId(Long userid, Pageable pageable) ;
	/**
	 * 关联查询
	 * @param id
	 * @return
	 */
	VideoAndCommentReportManager findByReportedContentId(Long id);
	VideoAndCommentReportManager findByReportedVideoId(Long id);
}
