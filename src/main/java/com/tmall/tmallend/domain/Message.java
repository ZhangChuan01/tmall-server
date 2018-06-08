package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private int id;
    private int userid;
    private String msg;
    private Date time;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public String getMsg() {
        return msg;
    }

    public Date getTime() {
        return time;
    }
}
