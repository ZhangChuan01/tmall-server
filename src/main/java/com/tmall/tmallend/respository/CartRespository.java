package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface CartRespository extends JpaRepository<Cart,Integer> {
    Cart findByGidAndUseridAndGinfo(int gid,int userid,String ginfo);
    List<Cart> findByUserid(int userid);
    @Modifying
    @Transactional
    @Query("update Cart cart set cart.gnum = ?1 where cart.id = ?2")
    int updateGoods(int num,int id);
    @Modifying
    @Transactional
    @Query("delete from Cart cart where cart.userid = ?1 and cart.gid = ?2 and cart.ginfo = ?3")
    int deleteGoods(int userid,int gid,String info);
}
