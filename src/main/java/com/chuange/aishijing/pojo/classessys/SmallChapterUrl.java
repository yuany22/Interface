package com.chuange.aishijing.pojo.classessys;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2018-12-10.
 */
@Entity
@Table(name="ASJ_SMALLCHAPTERURL")
public class SmallChapterUrl {
    @Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
    private String id;
    private String smallChapterId;
}
