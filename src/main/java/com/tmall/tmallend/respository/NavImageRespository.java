package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.NavImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface NavImageRespository extends JpaRepository<NavImage,Integer> {
    @Query(value = "SELECT a.f_name,b.s_name,c.t_name,c.t_path  FROM nav_image_first a LEFT JOIN nav_image_second b ON a.f_id = b.p_id LEFT JOIN nav_image_third c ON b.s_id = c.p_id", nativeQuery = true)
    List<Object[]> getNavImageList();
}