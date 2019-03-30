package com.chuange.aishijing.service.impl.homepage;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.vedioManage.VedioComentManageDao;
import com.chuange.aishijing.dao.vedioManage.VedioManageDao;
import com.chuange.aishijing.dao.vedioManage.VedioScoreDao;
import com.chuange.aishijing.pojo.videoSystem.Video;
import com.chuange.aishijing.pojo.videoSystem.VideoComment;
import com.chuange.aishijing.pojo.videoSystem.VideoScore;
import com.chuange.aishijing.service.homepage.VedioManageService;
import com.chuange.aishijing.vo.servicevo.vedioManageVO.VedioVO;
@Service
@Transactional
public class VedioManageServiceImpl implements VedioManageService{
	@Autowired
	private VedioManageDao vedioManageDao;
	@Autowired
	private VedioComentManageDao vedioCommentManageDao;
	@Autowired
	private VedioScoreDao vedioScoreDao;
	
	/**
	 * 主页根据最新评论时间查询视频
	 */
	@Override
	public List<Video> queryByPublishTime() {
		// TODO Auto-generated method stub
		//return null;
		return	vedioManageDao.findByPublishTime();
	}
	/**
	 * 查询评论
	 */
	@Override
	public List<VideoComment> queryCommentById(String id) {
		// TODO Auto-generated method stub
		return vedioCommentManageDao.findAllByCommentedVideo(id);
	}
	/**
	 * 评分
	 */
	@Override
	public VideoScore insertScore(VideoScore score) {
		// TODO Auto-generated method stub
		return vedioScoreDao.save(score);
	}
	/**
	 * 评分详情
	 */
	@Override
	public VideoScore selectAvrScore(long id) {
		// TODO Auto-generated method stub
		VideoScore score= new VideoScore();
		DecimalFormat df = new DecimalFormat("#.0");
		Object[] array=vedioScoreDao.findByVideoid(id);
		Object[] arry=(Object[]) array[0];
		Long count= (Long) arry[5];
		if(count >0) {
			Long mainid=(Long) arry[0];
		//	String vedioid = (String) arry[1];
			String musicScore=(String) arry[1];
			String textScore=(String) arry[2];
			String bodyScore=(String) arry[3];
			String actorScore=(String) arry[4];
	
			Double actorScores=Double.parseDouble(actorScore)/count;
			score.setActorScore(df.format(actorScores).toString());
			Double bodyScores=Double.parseDouble(bodyScore)/count;
			score.setBodyScore(df.format(bodyScores).toString());
			Double musicScores=Double.parseDouble(musicScore)/count;
			score.setMusicScore(df.format(musicScores).toString());
			Double textScores=Double.parseDouble(textScore)/count;
			score.setTextScore(df.format(textScores).toString());
			score.setUserId(mainid);
			score.setCount(Integer.parseInt(count.toString()));
		}
		return score;
	}
		
	/**
	 * 新增评论
	 */
	@Override
	public VideoComment insertComment(VideoComment comment) {
		// TODO Auto-generated method stub
		return vedioCommentManageDao.save(comment);
	}
	/**
	 * 查询所有试镜
	 */
	public List<Video> selectAllByUserid(Long userid){
		return vedioManageDao.findAllByUserId(userid);
	}
	/**
	 * 查询所有试镜
	 */
	public List<Video> selectAllProductByUserid(Long userid){
		return vedioManageDao.findByUserId(userid);
	}
	/**
	 * 分享页视频，试镜详情，作品详情
	 */
	@Override
	public Optional<Video> selectById(String id) {
		// TODO Auto-generated method stub
		return vedioManageDao.findById(id);
	}
	@Override
	public VedioVO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Video save(Video vedio) {
		// TODO Auto-generated method stub
		return vedioManageDao.save(vedio);
	}
}
