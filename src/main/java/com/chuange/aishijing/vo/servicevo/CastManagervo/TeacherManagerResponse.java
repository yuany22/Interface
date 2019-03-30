package com.chuange.aishijing.vo.servicevo.CastManagervo;

import com.chuange.aishijing.pojo.teachersys.TeacherManager;

import java.util.List;

/**
 * Created by Administrator on 2018-11-21.
 */
public class TeacherManagerResponse {
    private List<TeacherManager> teacherManagerList;
    private int totalPage;
    private Long totalElements;

    public TeacherManagerResponse(){};

    public TeacherManagerResponse(List<TeacherManager> teacherManagerList, int totalPage, Long totalElements) {
        this.teacherManagerList = teacherManagerList;
        this.totalPage = totalPage;
        this.totalElements = totalElements;
    }

    public List<TeacherManager> getTeacherManagerList() {
        return teacherManagerList;
    }

    public void setTeacherManagerList(List<TeacherManager> teacherManagerList) {
        this.teacherManagerList = teacherManagerList;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    @Override
    public String toString() {
        return "TeacherManagerResponse{" +
                "teacherManagerList=" + teacherManagerList +
                ", totalPage=" + totalPage +
                ", totalElements=" + totalElements +
                '}';
    }
}
