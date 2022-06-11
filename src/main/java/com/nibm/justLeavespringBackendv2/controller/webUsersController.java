package com.nibm.justLeavespringBackendv2.controller;
import com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao.webUsersDAO;
import com.nibm.justLeavespringBackendv2.model.webUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class webUsersController {

    @Autowired
    private webUsersDAO wuDAO;

    @GetMapping("/webUsers")
    public List<webUsers> getEmployees(){
        return wuDAO.getAll();
    }


}
