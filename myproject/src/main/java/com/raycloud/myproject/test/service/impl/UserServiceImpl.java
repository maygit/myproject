package com.raycloud.myproject.test.service.impl;

import com.raycloud.myproject.test.bean.Ibatis;
import com.raycloud.myproject.test.dao.Dao;
import com.raycloud.myproject.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 001117020012 on 2017/2/17.
 */
@Service("UserServiceImpl")
public class UserServiceImpl  implements IUserService {
    @Autowired
    private Dao s;

    @Override
    public List<Ibatis> queryAll() throws SQLException {
        List<Ibatis> users = s.getList();
        System.out.println(users);
        return users;
    }
}
