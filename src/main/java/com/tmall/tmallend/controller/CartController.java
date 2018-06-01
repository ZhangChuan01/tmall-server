package com.tmall.tmallend.controller;

import com.tmall.tmallend.domain.Cart;
import com.tmall.tmallend.respository.CartRespository;
import com.tmall.tmallend.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CartController {
    @Autowired
    private CartRespository cartRespository;
    @PostMapping(value = "/cart/addCart")
    public String addCart(@RequestBody Map<Object,Object> reqMap){
        int userId = Integer.parseInt(reqMap.get("userId").toString());
        int gId = Integer.parseInt(reqMap.get("gId").toString());
        int gNumber = Integer.parseInt(reqMap.get("gNumber").toString());
        String gInfo = reqMap.get("gInfo").toString();
        String gPath = reqMap.get("gPath").toString();
        Cart cart = cartRespository.findByGidAndUseridAndGinfo(gId,userId,gInfo);
        Result data = new Result();
        if(cart != null){
            int res = cartRespository.updateGoods(gNumber + cart.getGnum(),cart.getId());
            if(res != 0){
                return data.info("添加成功");
            }else {
                return data.info(null,"添加失败");
            }
        }else {
            Cart newCart = new Cart();
            newCart.setGid(gId);
            newCart.setGnum(gNumber);
            newCart.setGinfo(gInfo);
            newCart.setUserid(userId);
            newCart.setGpath(gPath);
            Cart res = cartRespository.saveAndFlush(newCart);
            return data.info(res);
        }
    }

    @GetMapping(value = "/cart/getCartList")
    public String getCartList(@RequestParam("userId") int userId){
        List<Cart> res = cartRespository.findByUserid(userId);
        Result data = new Result();
        return data.info(res);
    }

    @PostMapping(value = "/cart/delete")
    public String deleteGoods(@RequestBody Map<Object,Object> reqMap){
        int userId = Integer.parseInt(reqMap.get("userId").toString());
        int gId = Integer.parseInt(reqMap.get("gId").toString());
        String gInfo = reqMap.get("gInfo").toString();
        int res = cartRespository.deleteGoods(userId,gId,gInfo);
        Result data = new Result();
        if(res != 0){
            return data.info("删除成功");
        }else {
            return data.info(null,"删除失败");
        }
    }
}
