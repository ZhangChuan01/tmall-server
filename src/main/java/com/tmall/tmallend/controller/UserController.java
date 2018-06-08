package com.tmall.tmallend.controller;

import com.tmall.tmallend.util.Result;
import com.tmall.tmallend.domain.UserList;
import com.tmall.tmallend.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HttpSession httpSession;

    @GetMapping(value = "/user/list")
    public String getList(){
        List<UserList> res = userRepository.findAll();
        Result data = new Result();
        return data.info(res);
    }
    @PutMapping(value = "/user/login")
    public String login(@RequestBody Map<String,Object> reqMap){
        String name = reqMap.get("name").toString();
        String password = reqMap.get("password").toString();
        UserList user1 =  userRepository.findByNameAndPassword(name,password);
        UserList user2 =  userRepository.findByPhoneNumberAndPassword(name,password);
        Result data = new Result();
        if(user1 != null){
            httpSession.setAttribute("userInfo", user1);
            httpSession.setMaxInactiveInterval(1800);
            return data.info(user1);
        }
        if(user2 != null){
            httpSession.setAttribute("userInfo", user2);
            httpSession.setMaxInactiveInterval(1800);
            return data.info(user2);
        }
        return data.info(null,"用户名或密码错误");
    }
    @PostMapping(value = "/user/register")
    public String register(@RequestBody Map<Object,Object> reqMap){
        String name = reqMap.get("name").toString();
        String password = reqMap.get("password").toString();
        String phoneNumber = reqMap.get("phoneNumber").toString();
        UserList checkName = userRepository.findByName(name);
        UserList checkNumber = userRepository.findByPhoneNumber(phoneNumber);
        if(checkNumber != null){
            Result data = new Result();
            return data.info(null,"该手机号已注册");
        }
        UserList addUser = new UserList();
        if(checkName != null){
            Result data = new Result();
            return data.info(null,"用户名已存在");
        }
        addUser.setName(name);
        addUser.setPassword(password);
        addUser.setPhoneNumber(phoneNumber);
        UserList res = userRepository.saveAndFlush(addUser);
        Result data = new Result();
        return data.info(res);
    }
    @PutMapping(value = "/user/forgetPassword")
    public String resetPassword(@RequestBody Map<Object,Object> reqMap){
        String phoneNumber = reqMap.get("phoneNumber").toString();
        String newPassword = reqMap.get("newPassword").toString();
        UserList checkNumber = userRepository.findByPhoneNumber(phoneNumber);
        Result data = new Result();
        if(checkNumber != null){
            int result = userRepository.setPassword(newPassword,checkNumber.getId());
            if(result != 0){
                return data.info("重置成功");
            }else {
                return data.info(null,"重置失败");
            }
        }else {
            return data.info(null,"该手机号未注册");
        }
    }
}
