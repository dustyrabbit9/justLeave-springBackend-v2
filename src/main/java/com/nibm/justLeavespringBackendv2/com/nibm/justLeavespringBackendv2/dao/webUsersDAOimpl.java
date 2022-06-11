package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;

import com.nibm.justLeavespringBackendv2.model.webUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class webUsersDAOimpl implements  webUsersDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(webUsers webuser) {
        return 0;
    }

    @Override
    public int update(webUsers webUser, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<webUsers> getAll() {
        return jdbcTemplate.query("SELECT * FROM web_users;", new BeanPropertyRowMapper<webUsers>(webUsers.class));
    }

    @Override
    public webUsers getByIId(int id) {
        return null;
    }
}
