package com.tmall.tmallend.controller;

import com.tmall.tmallend.domain.*;
import com.tmall.tmallend.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ImageListController {


    @Autowired
    private ClassificationRepository classificationRepository;

    @GetMapping(value = "/image/classification")
    public String getClassification(){
        List<Classification> res = classificationRepository.findAll();
        Result data = new Result();
        return data.info(res);
    }

    @Autowired
    private BannerRespository bannerRespository;

    @GetMapping(value = "/image/banner")
    public String getBanner() {
        List<Banner> res = bannerRespository.findAll();
        Result data = new Result();
        return data.info(res);
    }

    @Autowired
    private GoodsRepository goodsRepository;
    @GetMapping(value = "/image/goods")
    public String getGoods(){
        List<Goods> res = goodsRepository.findAll();
        Result data = new Result();
        return data.info(res);
    }

    @Autowired
    private NavImageRespository navImageRespository;
    @GetMapping(value = "/image/navImage")
    public String testGoods(){
        List<Object[]> result = navImageRespository.getNavImageList();
        List<NavImage> res = new ArrayList<>();
        for(int i = 0;i<result.size();i++){
            List<Object> arr = Arrays.asList(result.get(i));
            NavImage nav = new NavImage();
            nav.setF_name((String) arr.get(0));
            nav.setS_name((String) arr.get(1));
            nav.setT_name((String) arr.get(2));
            nav.setT_path((String) arr.get(3));
            res.add(nav);
        }
        Result data = new Result();
        return data.info(res);
    }

}
