package com.tmall.tmallend.respository;

import com.tmall.tmallend.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRespository extends JpaRepository<Message,Integer> {
    @Query(value = "select message from Message message order by time asc")
    List<Message> getMessage();
}
