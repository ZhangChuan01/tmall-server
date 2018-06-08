package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FormatMessage {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String msg;
    private String time;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String userid) {
        this.name = userid;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getTime() {
        return time;
    }
}
