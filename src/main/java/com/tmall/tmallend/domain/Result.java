package com.tmall.tmallend.domain;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Result {

    public String info(Object res,String err){
        Map<Object,Object> info = new HashMap<>();
        if(res != null){
            info.put("res",res);
            info.put("msg","");
            info.put("code",1);
        }else {
            info.put("res","");
            info.put("msg",err);
            info.put("code",0);
        }
        String json = new Gson().toJson(info);
        return json;
    }

    public String info(Object res){
        Map<Object,Object> info = new HashMap<>();
        if(res != null){
            info.put("code",1);
            info.put("res",res);
            info.put("msg","");
        }else {
            info.put("code",0);
            info.put("res","");
            info.put("msg","");
        }
        String json = new Gson().toJson(info);
        return json;
    }
}
