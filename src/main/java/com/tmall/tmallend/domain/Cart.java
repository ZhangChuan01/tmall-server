package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private int id;
    private int gid;
    private int gnum;
    private int userid;

    public void setId(int id) {
        this.id = id;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setGnum(int gnum) {
        this.gnum = gnum;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public int getGid() {
        return gid;
    }

    public int getGnum() {
        return gnum;
    }

    public int getUserid() {
        return userid;
    }
}
