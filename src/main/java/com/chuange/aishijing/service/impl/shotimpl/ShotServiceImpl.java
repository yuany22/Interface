package com.chuange.aishijing.service.impl.shotimpl;

import com.chuange.aishijing.dao.castsystem.CastSystemDao;
import com.chuange.aishijing.dao.castsystem.RoleManagerDao;
import com.chuange.aishijing.dao.dict.DictDao;
import com.chuange.aishijing.dao.recommendManage.RecommendDramaDao;
import com.chuange.aishijing.dao.shootingpage.HotCastDao;
import com.chuange.aishijing.dao.shootingpage.HotRoleDao;
import com.chuange.aishijing.dao.shootingpage.MovieAudioDao;
import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.castmanage.Cast;
import com.chuange.aishijing.pojo.castsystem.Drama;
import com.chuange.aishijing.pojo.castsystem.Role;
import com.chuange.aishijing.pojo.recommendmanage.HotCast;
import com.chuange.aishijing.pojo.recommendmanage.HotRole;
import com.chuange.aishijing.pojo.recommendmanage.MovieAudio;
import com.chuange.aishijing.service.shot.ShotService;
import com.chuange.aishijing.vo.shotvo.HotDramaResponse;
import com.chuange.aishijing.vo.shotvo.RoleTypeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019-02-22.
 */
@Service
@Transactional
public class ShotServiceImpl implements ShotService {

    @Autowired
    private DictDao dictDao;
    @Autowired
    private HotCastDao hotCastDao;
    @Autowired
    private CastSystemDao castSystemDao;
    @Autowired
    private MovieAudioDao movieAudioDao;
    @Autowired
    private HotRoleDao hotRoleDao;
    @Autowired
    private RoleManagerDao roleManagerDao;
    @Override
    public List<Dictionary> selectAllCastType() {
        return dictDao.findAllByTypeCode("asj_casttype_dic");
    }

    @Override
    public List<HotDramaResponse> selectHotDrama() {
        List<HotCast> hostCasts = hotCastDao.findAllByRecommendAndStatus("2","1");
        List<HotDramaResponse> list = new ArrayList<>();
        for(HotCast s:hostCasts){
         HotDramaResponse hotDramaResponse = new HotDramaResponse();
         Drama drama = castSystemDao.findCastNameAndPublishById(s.getCastId());
         hotDramaResponse.setCastname(drama.getCastname());
         hotDramaResponse.setAuditionNum(drama.getAuditionNum());
         hotDramaResponse.setDirector(drama.getDirector());
         hotDramaResponse.setId(drama.getId());
         hotDramaResponse.setPublish(drama.getPublish());
         list.add(hotDramaResponse);
        }
        return list;
    }

    @Override
    public List<MovieAudio> selectMovieAudio() {
        List<MovieAudio> list = movieAudioDao.findAll();
        return list;
    }

    @Override
    public List<Role> selectHotRole() {
        //根据条件查询启动状态的热门角色
        List<HotRole> list = hotRoleDao.findAllByRecommendAndStatusOrderByRecommendValueDesc("2","1");
        List<Role> roles = new ArrayList<>();
        for (HotRole hotRole : list) {
            Role role = roleManagerDao.findAllById(hotRole.getCastId());
            roles.add(role);
        }

        return roles;
    }

    @Override
    public List<Dictionary> selectRoleType() {
            return dictDao.findAllByTypeCode("asj_roletype_dic");
    }

    @Override
    public List<Role> selectCommonRole() {
        List<HotRole> list = hotRoleDao.findAllByRecommendAndStatusOrderByRecommendValueDesc("1","1");
            List<Role> roles = new ArrayList<>();
        for (HotRole hotRole : list) {
            Role role = roleManagerDao.findAllById(hotRole.getCastId());
            roles.add(role);
        }
        return roles;
    }

    @Override
    public List selectCastByLike(String content) {

        List list = new ArrayList();
       List<Drama> ss  = castSystemDao.findAll(new Specification<Drama>() {
            @Override
            public Predicate toPredicate(Root<Drama> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(content!=null){
                    list.add(cb.like(root.get("publish").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("castname").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("director").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("writor").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("type").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("theme").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("platform").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("shootArea").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("planCity").as(String.class), "%"+content+"%"));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.or(list.toArray(p));
            }
        });
        List<MovieAudio> cc  = movieAudioDao.findAll(new Specification<MovieAudio>() {
            @Override
            public Predicate toPredicate(Root<MovieAudio> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(content!=null){
                    list.add(cb.like(root.get("castname").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("castAuthor").as(String.class), "%"+content+"%"));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.or(list.toArray(p));
            }
        });

        list.add(ss);
        list.add(cc);
        return list;

    }

    @Override
    public List selectRoleByLike(String content) {

        List<Role> ss  = roleManagerDao.findAll(new Specification<Role>() {
            @Override
            public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(content!=null){
                    list.add(cb.like(root.get("roleName").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("role").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("castname").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("roleTag").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("roleBackground").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("roleIllustrated").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("roleStory").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("directorAttention").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("roleCategory").as(String.class), "%"+content+"%"));
                    list.add(cb.like(root.get("sex").as(String.class), "%"+content+"%"));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.or(list.toArray(p));
            }
        });
        return ss;
    }

    @Override
    public List<Drama> selectCastByType(String type) {
        List<Drama> list = castSystemDao.findAllByType(type);
        return list;
    }

    @Override
    public List<Role> selectRoleByType(RoleTypeRequest content) {
        String age = "20~30";
        String s = age.substring(0,2);
        String c = age.substring(3,5);
        List<Role> ss  = roleManagerDao.findAll(new Specification<Role>() {
            @Override
            public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(content.getSex()!=null){
                    list.add(cb.like(root.get("sex").as(String.class), content.getSex()));
                }

                if(content.getRoleTag()!=null){
                    list.add(cb.like(root.get("roleTag").as(String.class), content.getRoleTag()));
                }
                if(content.getRole()!=null){
                    list.add(cb.like(root.get("role").as(String.class), content.getRole()));
                }

                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        });
        return ss;
    }

    @Override
    public List selectAllCastByRecommend() {
        List<HotCast> hotDramas = hotCastDao.findAllByStatusOrderByRecommendDesc("1");
        List<Drama> list = new ArrayList();
        List<String> list1 = new ArrayList<>();
        if(hotDramas!=null) {
            for (HotCast hotDrama : hotDramas) {
                Drama drama = castSystemDao.findCastNameAndPublishById(hotDrama.getCastId());
                list.add(drama);

            }
            for (Drama o : list) {
                list1.add(o.getId());
            }
            List<Drama> dramas = castSystemDao.findAll();
            for (Drama drama1 : dramas) {
                if (!ifInclude(list1,drama1.getId())) {
                    list.add(drama1);
                }
            }
        }
        return list;
    }

    @Override
    public List<Role> selectAllRoleByRecommend() {

        List<HotRole> hotDramas = hotRoleDao.findAllByStatusOrderByRecommendDesc("1");
        List<Role> list = new ArrayList();
        List<String> list1 = new ArrayList<>();
        if(hotDramas!=null) {
            for (HotRole hotDrama : hotDramas) {
                Role drama = roleManagerDao.findAllById(hotDrama.getCastId());
                list.add(drama);

            }
            for (Role o : list) {
                list1.add(o.getId());
            }
            List<Role> dramas = roleManagerDao.findAll();
            for (Role drama1 : dramas) {
                if (!ifInclude(list1,drama1.getId())) {
                    list.add(drama1);
                }
            }
        }
        return list;

    }

    //     List<Drama> dramas = castSystemDao.findAllBycastnameContaining(content);
    public static  boolean ifInclude(List<String> list,String str){
        for(int i=0;i<list.size();i++){
            if (list.get(i).indexOf(str)!=-1) {
                return true;
            }
        }
        return false;
    }

}
