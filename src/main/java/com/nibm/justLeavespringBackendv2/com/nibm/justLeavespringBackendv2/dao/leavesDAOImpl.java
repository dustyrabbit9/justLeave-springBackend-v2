package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;

import com.nibm.justLeavespringBackendv2.model.leaves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class leavesDAOImpl implements leavesDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(leaves leave) {
        return 0;
    }

    @Override
    public int update(leaves leave, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<leaves> getAll() {
        return jdbcTemplate.query("SELECT * FROM leaves;", new BeanPropertyRowMapper<leaves>(leaves.class));
    }

    @Override
    public leaves getByIId(int id) {
        return null;
    }
}
