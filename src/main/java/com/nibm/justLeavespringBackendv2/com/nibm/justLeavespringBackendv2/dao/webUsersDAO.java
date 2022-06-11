package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;
import com.nibm.justLeavespringBackendv2.model.webUsers;
import java.util.List;

public interface webUsersDAO {
    int save(webUsers webuser);
    int update(webUsers webUser, int id);
    int delete(int id);
    List<webUsers> getAll();
    webUsers getByIId(int id);
}
