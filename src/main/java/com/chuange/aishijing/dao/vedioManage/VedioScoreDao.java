package com.chuange.aishijing.dao.vedioManage;


import com.chuange.aishijing.pojo.videoSystem.VideoScore;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = com.chuange.aishijing.pojo.videoSystem.VideoScore.class, idClass = String.class)
public interface VedioScoreDao extends JpaRepository<VideoScore, String>,JpaSpecificationExecutor<VideoScore>{
	/**
	 * 条件查询视频信息
	 * @param spec
	 * @param pageable
	 * @return
	 */
	@Query(value="select userId,sum(musicScore) as musicScore,sum(textScore) as textScore,sum(bodyScore) as bodyScore,sum(actorScore) as actorScore,count(*) as count"
			+ " from VideoScore where userId=:userId")
	public Object[] findByVideoid(long userId);
	/**
	 * 更新
	 */
	//<S extends Video> S saveAndFlush(Video manager);
}
