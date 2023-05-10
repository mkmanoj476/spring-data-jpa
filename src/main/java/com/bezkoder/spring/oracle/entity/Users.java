package com.bezkoder.spring.oracle.entity;

import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userdata")
public class Users {

    @Id
    private int id;
    private String username;
    private String password;
    private String email;

    public Users(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
