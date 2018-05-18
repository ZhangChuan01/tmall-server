package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NavImage {
    @Id
    private String f_name;
    private String s_name;
    private String t_name;
    private String t_path;

    public void setT_path(String t_path) {
        this.t_path = t_path;
    }

    public String getT_path() {
        return t_path;
    }

    public NavImage() {
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getF_name() {
        return f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public String getT_name() {
        return t_name;
    }
}
