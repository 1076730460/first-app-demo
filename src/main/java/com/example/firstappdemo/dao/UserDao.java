package com.example.firstappdemo.dao;

import com.example.firstappdemo.Util.UserDto;
import com.example.firstappdemo.pojo.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface  UserDao extends JpaRepository<User, Integer> {

    @Query(value = "SELECT new com.example.firstappdemo.Util.UserDto(u.id,r.rolename) FROM User u,Role r WHERE u.RoleId=r.id",
            countQuery = "SELECT count(*) FROM User u,Role r WHERE u.RoleId=r.id")
    List<UserDto> testRelation(Pageable pageable);
}
