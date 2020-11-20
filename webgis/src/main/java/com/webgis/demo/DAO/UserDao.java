package com.webgis.demo.DAO;

import com.webgis.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao extends JpaRepository<User, Integer> {
     User getByUsernameAndPassword(String username,String password);
}
