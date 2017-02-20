package com.raycloud.myproject.test.dao;

import com.raycloud.myproject.test.bean.Ibatis;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 001117020012 on 2017/2/17.
 */
public interface Dao {
    public List getList() throws SQLException;
}
