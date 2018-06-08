package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Integer> {
    Goods findByGid(int id);
    @Query("select goods from Goods goods where goods.name like %?1%")
    List<Goods> searchGood(String name);
}
