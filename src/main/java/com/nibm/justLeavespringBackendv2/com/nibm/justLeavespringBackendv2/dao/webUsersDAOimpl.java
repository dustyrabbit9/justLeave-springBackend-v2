package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;

import com.nibm.justLeavespringBackendv2.model.webUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class webUsersDAOimpl implements  webUsersDAO{

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
        return null;
    }

    @Override
    public webUsers getByIId(int id) {
        return null;
    }
}
