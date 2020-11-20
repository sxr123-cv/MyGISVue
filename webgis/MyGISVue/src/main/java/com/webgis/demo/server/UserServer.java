package com.webgis.demo.server;

import com.webgis.demo.DAO.UserDao;
import com.webgis.demo.code.Result;
import com.webgis.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServer {
    @Autowired
    UserDao userDao;
    public Result finduser(String username,String password){
       User getUser=userDao.getByUsernameAndPassword(username,password);
        int code=400;
        if(getUser!=null)
            code=200;
       return new Result(code);
    }
}
