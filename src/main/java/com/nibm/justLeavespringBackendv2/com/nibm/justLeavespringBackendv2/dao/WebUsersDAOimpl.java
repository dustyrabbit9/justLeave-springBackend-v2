package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;

import com.nibm.justLeavespringBackendv2.model.WebUsers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

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
    public List<WebUsers> getByLogin(WebUsers user) {

        List<WebUsers> wpTemp = jdbcTemplate.query("SELECT * FROM web_users WHERE email='"+user.getEmail()+"';", new BeanPropertyRowMapper<WebUsers>(WebUsers.class));
        if (Objects.equals(wpTemp.get(0).getPassword(), user.getPassword())){
            return wpTemp;
        }
        return null;

    }
}
