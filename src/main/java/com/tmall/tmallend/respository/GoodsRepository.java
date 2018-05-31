package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,Integer> {
    Goods findByGid(int id);
}
