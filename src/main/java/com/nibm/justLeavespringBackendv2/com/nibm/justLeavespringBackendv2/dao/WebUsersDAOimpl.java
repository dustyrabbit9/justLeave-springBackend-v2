package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;

import com.nibm.justLeavespringBackendv2.model.WebUsers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WebUsersDAOimpl implements WebUsersDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(WebUsers user) {
        return jdbcTemplate.update("INSERT INTO web_users (name, email, password, userType) VALUE (?, ?, ?, 1)", new Object[] {user.getName(), user.getEmail(), user.getPassword()});
    }

    @Override
    public int update(WebUsers webUser, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<WebUsers> getAll() {
        return jdbcTemplate.query("SELECT * FROM web_users;", new BeanPropertyRowMapper<WebUsers>(WebUsers.class));
    }

    @Override
    public WebUsers getByIId(int id) {
        return null;
    }



    @Override
    public WebUsers signIn(String email, String password) {
        WebUsers wbTemp = new WebUsers();
        Logger logger = LoggerFactory.getLogger(WebUsersDAOimpl.class);

        wbTemp = jdbcTemplate.queryForObject("SELECT * FROM web_users;", new BeanPropertyRowMapper<WebUsers>(WebUsers.class), email);
        logger.info(wbTemp.getName());

        return null;
    }

}
