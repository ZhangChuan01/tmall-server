package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartList {
    @Id
    private int num;
    private String info;
    private int stock;
    private float realityPrice;
    private String path;
    private String name;
    private int price;
    private int gid;
    private int userid;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getGid() {
        return gid;
    }

    public int getUserid() {
        return userid;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRealityPrice(float realityPrice) {
        this.realityPrice = realityPrice;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public String getInfo() {
        return info;
    }

    public int getStock() {
        return stock;
    }

    public float getRealityPrice() {
        return realityPrice;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
