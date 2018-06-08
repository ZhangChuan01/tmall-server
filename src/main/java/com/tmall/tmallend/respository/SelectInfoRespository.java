package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.SelectInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SelectInfoRespository extends JpaRepository<SelectInfo,Integer>{
    List<SelectInfo> findByGidOrderByIdAsc(int id);
    SelectInfo findByGidAndInfo(int gid,String ginfo);
}
