package com.chuange.aishijing.service.impl.classesimpl;

import com.chuange.aishijing.dao.castmanager.TeacherManagerDao;
import com.chuange.aishijing.dao.classesmanager.*;
import com.chuange.aishijing.dao.dict.DictDao;
import com.chuange.aishijing.dao.recommendManage.BannerManageDao;
import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.classessys.*;
import com.chuange.aishijing.pojo.recommendmanage.Banner;
import com.chuange.aishijing.pojo.teachersys.TeacherManager;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.service.classes.ClassesService;
import com.chuange.aishijing.vo.classesvo.*;
import com.fasterxml.jackson.annotation.Nulls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019-02-28.
 */
@Transactional
@Service
public class ClassesServiceImpl implements ClassesService{
    @Autowired
    private BannerManageDao bannerManageDao;
    @Autowired
    private ClassesManagerDao classesManagerDao;
    @Autowired
    private TeacherManagerDao teacherManagerDao;
    @Autowired
    private BigChapterDao bigChapterDao;
    @Autowired
    private SmallChapterDao smallChapterDao;
    @Autowired
    private ClassCommentsDao classCommentsDao;
    @Autowired
    private UserManageDao userManageDao;
    @Autowired
    private DictDao dictDao;
    @Autowired
    private LoveClassesDao loveClassesDao;
    @Override
    public List<Banner> selectBanner() {
        Sort sort = new Sort(Sort.Direction.ASC, "recommendLoc");
        List<Banner> all = bannerManageDao.findAll(sort);
        return all;
    }

    @Override
    public Page<Classes> selectClasses() {
        Sort sort = new Sort(Sort.Direction.DESC, "playNum");
        Pageable pageable = PageRequest.of(0,3,sort);
           Page<Classes> all = classesManagerDao.findAll(pageable);
        return all;
    }

    @Override
    public List<Classes> selectAllClasses(ClassesRequestVO classesRequestVO) {

        List<Classes> all = classesManagerDao.findAll(new Specification<Classes>() {
            @Override
            public Predicate toPredicate(Root<Classes> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if(classesRequestVO.getClassesType()!=null){
                    list.add(cb.like(root.get("classType").as(String.class), classesRequestVO.getClassesType()));
                }

                if(classesRequestVO.getPrice()!=null){
                    list.add(cb.like(root.get("price").as(String.class),classesRequestVO.getPrice()));
                }
                if(classesRequestVO.getScore()!=null){
                    list.add(cb.like(root.get("score").as(String.class),classesRequestVO.getScore()));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));
            }
        });
        return all;
    }

    @Override
    public ClassesIntroduceResponse selectClassesIntroduce(String classesid) {
        ClassesIntroduceResponse classesIntroduceResponse = new ClassesIntroduceResponse();
        List<BigCatalog> list = new ArrayList<>();
        List<SmallCatalog> list1=null;
        List<CommentResponse> list2 = new ArrayList<>();
        Classes allById = classesManagerDao.findAllById(classesid);
        classesIntroduceResponse.setClassCover(allById.getClassCover());
        classesIntroduceResponse.setBuyNum(allById.getBuyNum());
        classesIntroduceResponse.setPrice(allById.getPrice());
        classesIntroduceResponse.setScore(allById.getScore());
        classesIntroduceResponse.setClasstitle(allById.getClasstitle());
        classesIntroduceResponse.setCastIntroduce(allById.getCastIntroduce());
        List<ClassComments> all = classCommentsDao.findAllByClassId(allById.getId());
        if(all!=null) {
            for (ClassComments classComments : all) {
                User user = userManageDao.findAllById(classComments.getUserId());
                CommentResponse commentResponse = new CommentResponse();
                if(user!=null){
                    commentResponse.setCommentUserPicture(user.getUserPicture());
                }
                commentResponse.setCommentContent(classComments.getCommentContent());
                commentResponse.setCommentTime(classComments.getCommentTime());
                commentResponse.setCommentUser(classComments.getCommentUser());
                list2.add(commentResponse);
            }
        }
        classesIntroduceResponse.setCommentResponses(list2);
        if(allById.getTeacherId()!=null) {
            TeacherManager teacher = teacherManagerDao.findAllById(allById.getTeacherId());
            classesIntroduceResponse.setTeacherNameReal(teacher.getTeacherNameReal());
            classesIntroduceResponse.setOrganization(teacher.getOrganization());
            classesIntroduceResponse.setTeacherPicture(teacher.getTeacherPicture());
            classesIntroduceResponse.setTeacherProfile(teacher.getTeacherProfile());
        }
        List<BigChapter> allByClassesId = bigChapterDao.findAllByClassesId(allById.getId());
        for (BigChapter bigChapter : allByClassesId) {
            BigCatalog bigCatalog = new BigCatalog();
            bigCatalog.setBigChapterTitle(bigChapter.getBigChapterTitle());
            bigCatalog.setId(bigChapter.getId());
            List<SmallChapter> allByBigChapterId = smallChapterDao.findAllByBigChapterId(bigChapter.getId());
            list1 = new ArrayList<>();
            for (SmallChapter smallChapter : allByBigChapterId) {
                SmallCatalog smallChapter1 = new SmallCatalog();
                smallChapter1.setId(smallChapter.getId());
                smallChapter1.setSmallChapterTitle(smallChapter.getSmallChapterTitle());
                smallChapter1.setCourseUrl(smallChapter.getCourseUrl());
                smallChapter1.setVideoUrl(smallChapter.getVideoUrl());
                list1.add(smallChapter1);
            }
            bigCatalog.setSmallCatalogs(list1);
            list.add(bigCatalog);
        }
        classesIntroduceResponse.setBigCatalogList(list);
        classesIntroduceResponse.setCommentResponses(list2);
        return classesIntroduceResponse;
    }

    @Override
    public String insertComment(String userid, String classesid,String content,Integer score) {
        try {
            ClassComments classComments = new ClassComments();
            User allById = userManageDao.findAllById(Long.parseLong(userid));
            classComments.setCommentUser(allById.getUsername());
            classComments.setCommentContent(content);
            classComments.setClassId(classesid);
            classComments.setUserId(Long.parseLong(userid));
            classComments.setCommentScore(score);
            ClassComments comments = classCommentsDao.save(classComments);
        }catch (Exception e){
            e.printStackTrace();
            return "添加评论失败";
        }
        return "评论成功";
    }

    @Override
    public List<Dictionary> selectAllClassType() {
        List<Dictionary> asj_classtype_dic = dictDao.findAllByTypeCode("asj_classtype_dic");
        return asj_classtype_dic;
    }

    @Override
    public void insertMyLoveClasses(String userId, String classId) {
        try {
            LoveClasses loveClasses = new LoveClasses();
            loveClasses.setClassId(classId);
            loveClasses.setUserId(userId);
            loveClassesDao.save(loveClasses);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
