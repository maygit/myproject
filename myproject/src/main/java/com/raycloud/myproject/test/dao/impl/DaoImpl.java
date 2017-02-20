package com.raycloud.myproject.test.dao.impl;

import com.alibaba.cobar.client.CobarSqlMapClientDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.raycloud.myproject.test.dao.Dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 001117020012 on 2017/2/17.
 */
public class DaoImpl extends CobarSqlMapClientDaoSupport implements Dao {
    int BATCH_SIZE = 1000;

    @Resource(name = "sqlMapClient")
    private SqlMapClient sqlMapClient;

    @PostConstruct
    public void initSqlMapClient() {
        super.setSqlMapClient(sqlMapClient);
    }

    @Override
    public List getList() throws SQLException {
        return super.getSqlMapClientTemplate().queryForList("Users", null);
    }
}
