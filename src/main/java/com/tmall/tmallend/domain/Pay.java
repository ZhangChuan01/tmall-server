package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pay {
    @Id
    @GeneratedValue
    private int userid;
    private int gid;
    private int gum;
    private String ginfo;

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setGum(int gum) {
        this.gum = gum;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public int getUserid() {
        return userid;
    }

    public int getGid() {
        return gid;
    }

    public int getGum() {
        return gum;
    }

    public String getGinfo() {
        return ginfo;
    }
}
