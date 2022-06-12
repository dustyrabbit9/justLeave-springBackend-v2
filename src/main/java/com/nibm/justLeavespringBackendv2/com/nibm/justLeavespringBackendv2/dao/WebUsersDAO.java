package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;
import com.nibm.justLeavespringBackendv2.model.WebUsers;
import java.util.List;

public interface WebUsersDAO {
    int save(WebUsers user);
    int update(WebUsers webUser, int id);
    int delete(int id);
    List<WebUsers> getAll();
    WebUsers getByIId(int id);
    WebUsers signIn(String email, String password);

}
