package com.chuange.aishijing.pojo.login;

import javax.persistence.*;

/**
 * Created by Administrator on 2019-02-21.
 */
@Entity
@Table(name="ASJ_APPUSER")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String password;


}
