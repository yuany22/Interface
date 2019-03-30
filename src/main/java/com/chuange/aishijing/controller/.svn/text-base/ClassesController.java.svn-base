package com.chuange.aishijing.controller;

import com.chuange.aishijing.dic.Dictionary;
import com.chuange.aishijing.pojo.classessys.Classes;
import com.chuange.aishijing.pojo.recommendmanage.Banner;
import com.chuange.aishijing.service.classes.ClassesService;
import com.chuange.aishijing.util.ResultModel;
import com.chuange.aishijing.util.ResultTools;
import com.chuange.aishijing.vo.classesvo.ClassesIntroduceResponse;
import com.chuange.aishijing.vo.classesvo.ClassesRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-02-28.
 */
@RestController
public class ClassesController {

    @Autowired
    private ClassesService classesService;
    @RequestMapping("selectBanner")
    public ResultModel selectBanner(){
        List<Banner> banners = classesService.selectBanner();
        Map<String,Object> map = new HashMap();
        map.put("data",banners);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectClasses")
    public ResultModel selectClasses(){
        Page<Classes> classes = classesService.selectClasses();
        Map<String,Object> map = new HashMap();
        map.put("data",classes);
        return ResultTools.result(0,"",map);
    }
    
    @RequestMapping("selectAllClasses")
    public ResultModel selectAllClasses(@RequestBody ClassesRequestVO classesRequestVO){
        List<Classes> classes = classesService.selectAllClasses(classesRequestVO);
        Map<String,Object> map = new HashMap();
        map.put("data",classes);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("selectClassesIntroduce")
    public ResultModel selectClassesIntroduce(@RequestParam String classid){
        ClassesIntroduceResponse classesIntroduceResponse = classesService.selectClassesIntroduce(classid);
        Map<String,Object> map = new HashMap();
        map.put("data",classesIntroduceResponse);
        return ResultTools.result(0,"",map);
    }

    @RequestMapping("MyLoveClasses")
    public ResultModel MyLoveClasses(@RequestParam String userId,@RequestParam String classId){
        classesService.insertMyLoveClasses(userId,classId);
        Map<String,Object> map = new HashMap();
        map.put("data","1");
        return ResultTools.result(0,"",map);
    }


    @RequestMapping("addComment")
    public ResultModel addComment(@RequestParam String userid,@RequestParam String classesid,@RequestParam String content,@RequestParam Integer score){
        String s = classesService.insertComment(userid, classesid, content, score);
        Map<String,Object> map = new HashMap();
        map.put("data",s);
        return ResultTools.result(0,"",map);
    }
    @RequestMapping("classType")
    public ResultModel classType(){
        List<Dictionary> strings = classesService.selectAllClassType();
        Map<String,Object> map = new HashMap();
        map.put("data",strings);
        return ResultTools.result(0,"",map);
    }


}
