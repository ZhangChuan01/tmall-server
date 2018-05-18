package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.Classification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationRepository extends JpaRepository<Classification,Integer> {
}
