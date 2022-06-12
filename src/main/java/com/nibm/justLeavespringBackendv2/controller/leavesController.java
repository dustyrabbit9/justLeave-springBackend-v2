package com.nibm.justLeavespringBackendv2.controller;
import com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao.leavesDAO;
import com.nibm.justLeavespringBackendv2.model.leaves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class leavesController {

    @Autowired
    private leavesDAO lDAO;

    @GetMapping("api/leaves")
    public List<leaves> getLeaves() {
        return lDAO.getAll();
    }

    @PostMapping("/api/addleave")
    public String addLeave(@RequestBody leaves user){
        return lDAO.save(user)+"No. of Leaves added";
    }

    @PatchMapping
    public String updateStatus(leaves leave, int id) {
        return lDAO.update(leave, id)+ "Updated leaves Status";
    }
}
