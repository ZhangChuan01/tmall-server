package com.tmall.tmallend.controller;

import com.tmall.tmallend.domain.Goods;
import com.tmall.tmallend.domain.SelectInfo;
import com.tmall.tmallend.respository.GoodsRepository;
import com.tmall.tmallend.respository.SelectInfoRespository;
import com.tmall.tmallend.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;
    @GetMapping(value = "/goods")
    public String getGoods(){
        List<Goods> res = goodsRepository.findAll();
        Result data = new Result();
        return data.info(res);
    }
    @GetMapping(value = "/goods/detail")
    public String getGood(@RequestParam("goodId") int id){
        Goods res = goodsRepository.findByGid(id);
        Result data = new Result();
        return data.info(res);
    }
    @Autowired
    private SelectInfoRespository selectInfoRespository;
    @GetMapping(value = "/goods/detail/selectInfo")
    public String getSelctInfo(@RequestParam("gId") int id){
       List<SelectInfo> res = selectInfoRespository.findByGidOrderByIdAsc(id);
        Result data = new Result();
        return data.info(res);
    }
}
