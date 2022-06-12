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
    public int save(leaves user) {
        return jdbcTemplate.update("INSERT INTO leaves (userID, leaveDate, leaveType, status) VALUE (?, ?, 1, 1)", new Object[] {user.getUserID(), user.getLeaveDate()});
    }

    @Override
    public int update(leaves leave) {
//        return jdbcTemplate.update("UPDATE leaves SET status =" +leave.getStatus() +" WHERE id = "+leave.getId()+";", new Object[] {leave.getStatus()});
        return jdbcTemplate.update("UPDATE leaves SET status = ? WHERE id = ?;", new Object[] {leave.getStatus(), leave.getId()});

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
