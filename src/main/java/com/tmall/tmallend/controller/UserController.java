package com.tmall.tmallend.controller;

import com.google.gson.Gson;
import com.tmall.tmallend.domain.Result;
import com.tmall.tmallend.domain.UserList;
import com.tmall.tmallend.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/list")
    public String getList(){
        List<UserList> res = userRepository.findAll();
        Result data = new Result();
        return data.info(res);
    }
    @PostMapping(value = "/user/login")
    public String login(@RequestBody Map<String,Object> reqMap){
        String name = reqMap.get("name").toString();
        String password = reqMap.get("password").toString();
        UserList user =  userRepository.findByNameAndPassword(name,password);
        Map<Object,Object> info = new HashMap<>();
        if(user != null){
            info.put("code",1);
            info.put("res",user);
            info.put("msg","");
        }else {
            info.put("code",0);
            info.put("res","");
            info.put("msg","用户名或密码错误");
        }
        String json = new Gson().toJson(info);
        return json;
//        return userRepository.findByNameAndPassword(name,password);
    }
}
