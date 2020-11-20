package com.webgis.demo.controll;

import com.webgis.demo.code.Result;
import com.webgis.demo.pojo.User;
import com.webgis.demo.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class Logincontroll {
    @Autowired
    UserServer userserver;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        String password = requestUser.getPassword();
        password = HtmlUtils.htmlEscape(password);
        return userserver.finduser(username,password);
    }

}
