package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private int cid;
    private int gid;
    private int gnum;
    private int userid;
    private String ginfo;

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setId(int id) {
        this.cid = cid;
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
        return cid;
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
