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
    @Query("update Cart cart set cart.gnum = ?1 where cart.cid = ?2")
    int updateGoodsNum(int num,int id);
    @Modifying
    @Transactional
    @Query("delete from Cart cart where cart.cid = ?1")
    int deleteGoods(int id);
    @Query(value = "SELECT a.*,b.stock,b.price,b.path,b.id,c.name,c.price2  FROM cart a LEFT JOIN select_info b ON a.gid = b.gid AND a.ginfo = b.info LEFT JOIN goods c ON b.gid = c.gid WHERE a.userid = ?1", nativeQuery = true)
    List<Object[]> getCartList(int userid);
}
