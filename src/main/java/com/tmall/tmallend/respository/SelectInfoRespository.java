package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.SelectInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SelectInfoRespository extends JpaRepository<SelectInfo,Integer>{
    SelectInfo findById(int id);
    List<SelectInfo> findByGidOrderByIdAsc(int id);
    SelectInfo findByGidAndInfo(int gid,String ginfo);
    @Query("update SelectInfo selectInfo set selectInfo.id = ?1 where selectInfo.stock = ?2")
    int updateGoodsNum(int id,int num);
}
