package com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao;
import com.nibm.justLeavespringBackendv2.model.leaves;
import java.util.List;
public interface leavesDAO {
    int save(leaves leave);
    int update(leaves leave, int id);
    int delete(int id);
    List<leaves> getAll();
    leaves getByIId(int id);

}
