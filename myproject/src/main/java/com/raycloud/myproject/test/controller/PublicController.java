package com.raycloud.myproject.test.controller;

import com.raycloud.myproject.test.bean.Ibatis;
import com.raycloud.myproject.test.controller.request.Request;
import com.raycloud.myproject.test.controller.response.Response;
import com.raycloud.myproject.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 001117020012 on 2017/2/17.
 */

@Controller
public class PublicController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private IUserService service;


    //spring中提供了四种途径输出模型数据 1.ModeAndView  2.map作为参数   3.SessionAttributes
    // 4.ModelAttributes注解用于修改密码
    @RequestMapping(value = "/test")
    @ResponseBody
    public Response test(Request request)  {
        Response response = new Response();
        response.setApi_name(request.getApi_name());
        List<Ibatis> users = null;
        try {
            users = service.queryAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setData(users);
        return response;
    }
}
