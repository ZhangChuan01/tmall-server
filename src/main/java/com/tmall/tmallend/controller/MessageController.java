package com.tmall.tmallend.controller;


import com.tmall.tmallend.domain.FormatMessage;
import com.tmall.tmallend.domain.Message;
import com.tmall.tmallend.domain.UserList;
import com.tmall.tmallend.respository.MessageRespository;
import com.tmall.tmallend.respository.UserRepository;
import com.tmall.tmallend.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class MessageController {
    @Autowired
    private MessageRespository messageRespository;
    @Autowired
    private UserRepository userRepository;
    @PostMapping(value = "/message/save")
    public String message(@RequestBody Map<Object,Object> reqMap){
        int userid = Integer.parseInt(reqMap.get("userid").toString());
        String msg = reqMap.get("msg").toString();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        Date d = new Date();
        Message message = new Message();
        message.setUserid(userid);
        message.setMsg(msg);
        message.setTime(d);
        Message newMsg = messageRespository.saveAndFlush(message);
        Result data = new Result();
        return data.info(newMsg);
    }

    @GetMapping(value = "/message/list")
    public String list(){
        List<Message> result = messageRespository.getMessage();
        List<FormatMessage> res = new ArrayList<>();
        for (int i=0; i<result.size(); i++){
            FormatMessage formatMessage = new FormatMessage();
            formatMessage.setId(result.get(i).getId());
            formatMessage.setMsg(result.get(i).getMsg());
            UserList user = userRepository.findById(result.get(i).getUserid());
            formatMessage.setName(user.getName());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            formatMessage.setTime(format.format(result.get(i).getTime()));
            res.add(formatMessage);
        }
        Result data = new Result();
        return data.info(res);
    }
}
