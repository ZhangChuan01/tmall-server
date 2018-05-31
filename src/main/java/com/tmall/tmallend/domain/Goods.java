package com.tmall.tmallend.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue
    private int gid;
    private String name;
    private String path;
    private String price;
    private String remarkType;
    private String remarkText;
    private int remark;
    private String prompt;
    private int sales;
    private String place;
    private String url;
    private int price2;

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    public int getPrice2() {
        return price2;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSales() {
        return sales;
    }

    public String getPlace() {
        return place;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRemarkType(String remarkType) {
        this.remarkType = remarkType;
    }

    public void setRemarkText(String remarkText) {
        this.remarkText = remarkText;
    }

    public void setRemark(int remark) {
        this.remark = remark;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getGid() {
        return gid;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getPrice() {
        return price;
    }

    public String getRemarkType() {
        return remarkType;
    }

    public String getRemarkText() {
        return remarkText;
    }

    public int getRemark() {
        return remark;
    }

    public String getPrompt() {
        return prompt;
    }
}
