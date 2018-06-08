package com.tmall.tmallend.respository;
import com.tmall.tmallend.domain.UserList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserList,Integer> {
    UserList findByNameAndPassword(String name,String password);
    UserList findByPhoneNumberAndPassword(String phoneNumber,String password);
    UserList findByName(String name);
    UserList findByPhoneNumber(String phoneNumber);
    UserList findById(int id);
    @Modifying
    @Transactional
    @Query("update UserList user set user.password = ?1 where user.id = ?2")
    int setPassword(String newPassword,int id);
}
