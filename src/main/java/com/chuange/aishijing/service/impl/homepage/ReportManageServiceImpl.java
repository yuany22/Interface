package com.chuange.aishijing.service.impl.homepage;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuange.aishijing.dao.usermanage.VedioReportDao;
import com.chuange.aishijing.pojo.userManage.VideoAndCommentReportManager;
import com.chuange.aishijing.service.userManage.VedioReportService;
/**
 * 
 * @author yuany
 *	举报管理
 */
@Service
@Transactional
public class ReportManageServiceImpl implements VedioReportService{
	@Autowired
	private VedioReportDao vedioReportDao;
	/**
	 * 举报删除
	 */
	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		vedioReportDao.deleteById(id);
	}
	/**
	 * 查询举报内容
	 */
	@Override
	public Optional<VideoAndCommentReportManager> queryById(String id) {
		// TODO Auto-generated method stub
		return vedioReportDao.findById(id);
	}
	/**
	 * 举报
	 */
	@Override
	public VideoAndCommentReportManager insertReport(VideoAndCommentReportManager report) {
		// TODO Auto-generated method stub
		return vedioReportDao.save(report);
	}


}
