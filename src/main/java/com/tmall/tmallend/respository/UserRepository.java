package com.tmall.tmallend.respository;
import com.tmall.tmallend.domain.UserList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserList,Integer> {
    UserList findByNameAndPassword(String name,String password);
    UserList findByName(String name);
    UserList findByPhoneNumber(String phoneNumber);
}
