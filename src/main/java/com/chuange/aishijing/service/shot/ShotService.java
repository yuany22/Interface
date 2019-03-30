package com.chuange.aishijing.service.shot;

import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.recommendmanage.HotRole;
import com.chuange.aishijing.pojo.recommendmanage.MovieAudio;
import com.chuange.aishijing.vo.shotvo.HotDramaResponse;
import com.chuange.aishijing.vo.shotvo.RoleTypeRequest;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Created by Administrator on 2019-02-22.
 */
public interface ShotService {
    //查询剧本所有类型
    List<Dictionary> selectAllCastType();
    //查询热门剧本
    List<HotDramaResponse> selectHotDrama();
    //查询影视原声
    List<MovieAudio> selectMovieAudio();
    //查询热门角色
    List<Role> selectHotRole();
    //查询所有角色类型
    List<Dictionary> selectRoleType();
    //查询推荐角色
    List<Role> selectCommonRole();
    //剧本全文搜索
    List  selectCastByLike(String content);
    //角色全文搜索
    List selectRoleByLike(String content);
    //根据剧本类型进行查询
    List<Drama> selectCastByType(String type);
    //角色筛选
    List<Role> selectRoleByType(RoleTypeRequest type);
    //查询全部剧本根据热度
    List selectAllCastByRecommend();
    //查询全部角色
    List<Role> selectAllRoleByRecommend();
}
