package com.tmall.tmallend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SelectInfo {
    @Id
    @GeneratedValue
    private int id;
    private String kind;
    private int stock;
    private int gid;
    private float price;
    private String info;
    private String path;

    public void setId(int id) {
        this.id = id;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    public int getStock() {
        return stock;
    }

    public int getGid() {
        return gid;
    }

    public float getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }

    public String getPath() {
        return path;
    }
}
