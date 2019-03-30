package com.chuange.aishijing.service.homepage;

import java.util.List;
import java.util.Optional;

import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.pojo.videoSystem.VideoComment;
import com.chuange.aishijing.pojo.videoSystem.VideoScore;
import com.chuange.aishijing.vo.servicevo.vedioManageVO.VedioVO;

public interface VedioManageService {
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public VedioVO delete(Long id);
	/**
	 * 保存
	 */
	public Video save(Video vedio);
	/**
	 * 查询
	 */
	public List<Video> queryByPublishTime();
	/**
	 * 分享页视频/试镜详情，作品详情
	 * @param id
	 * @return
	 */
	public Optional<Video> selectById(String id);
	/**
	 * 查询视频评论
	 * @param id
	 * @return
	 */
	List<VideoComment> queryCommentById(String id);
	/**
	 * 视频打分
	 * @param score
	 * @return
	 */
	VideoScore insertScore(VideoScore score);
	/**
	 * 新增评论
	 * @param comment
	 * @return
	 */
	VideoComment insertComment(VideoComment comment);
	/**
	 * 评分详情
	 * @param id
	 * @return
	 */
	VideoScore selectAvrScore(long id);
	/**
	 * 查询所有作品
	 * @param userid
	 * @return
	 */
	public List<Video> selectAllByUserid(Long userid);
	/**
	 * 所有试镜
	 * @param userid
	 * @return
	 */
	public List<Video> selectAllProductByUserid(Long userid);
}
