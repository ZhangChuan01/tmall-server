package com.tmall.tmallend.controller;

import com.tmall.tmallend.domain.Cart;
import com.tmall.tmallend.domain.CartList;
import com.tmall.tmallend.respository.CartRespository;
import com.tmall.tmallend.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
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
        Cart cart = cartRespository.findByGidAndUseridAndGinfo(gId,userId,gInfo);
        Result data = new Result();
        if(cart != null){
            int res = cartRespository.updateGoodsNum(gNumber + cart.getGnum(),cart.getId());
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
            Cart res = cartRespository.saveAndFlush(newCart);
            return data.info(res);
        }
    }

    @GetMapping(value = "/cart/getCartList")
    public String getCartList(@RequestParam("userId") int userId){
        List<Object[]> result = cartRespository.getCartList(userId);
        List<CartList> res = new ArrayList<>();
        for(int i = 0;i<result.size();i++){
            List<Object> arr = Arrays.asList(result.get(i));
            CartList cart = new CartList();
            cart.setId((int) arr.get(0));
            cart.setGid((int) arr.get(1));
            cart.setNum((int) arr.get(2));
            cart.setUserid((int) arr.get(3));
            cart.setInfo((String) arr.get(4));
            cart.setStock((int) arr.get(5));
            cart.setRealityPrice((float) arr.get(6));
            cart.setPath((String) arr.get(7));
            cart.setName((String) arr.get(8));
            cart.setPrice((int) arr.get(9));
            res.add(cart);
        }
        Result data = new Result();
        return data.info(res);
    }

    @DeleteMapping(value = "/cart/delete")
    public String deleteGoods(@RequestParam("id") int id){
        int res = cartRespository.deleteGoods(id);
        Result data = new Result();
        if(res != 0){
            return data.info("删除成功");
        }else {
            return data.info(null,"删除失败");
        }
    }

    @PutMapping(value = "/cart/updateNum")
    public String updateNum(@RequestBody Map<Object,Object> reqMap){
        int id = Integer.parseInt(reqMap.get("id").toString());
        int num = Integer.parseInt(reqMap.get("num").toString());
        int result = cartRespository.updateGoodsNum(num,id);
        Result data = new Result();
        if(result != 0){
            return data.info("数量更新成功");
        }else{
            return data.info(null,"数量更新失败");
        }
    }
}
