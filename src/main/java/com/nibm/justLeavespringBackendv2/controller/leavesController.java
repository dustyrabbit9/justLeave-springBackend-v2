package com.nibm.justLeavespringBackendv2.controller;
import com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao.leavesDAO;
import com.nibm.justLeavespringBackendv2.model.leaves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class leavesController {

    @Autowired
    private leavesDAO lDAO;

    @GetMapping("/leaves")
    public List<leaves> getLeaves() { return lDAO.getAll(); }
}
