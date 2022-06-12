package com.nibm.justLeavespringBackendv2.controller;
import com.nibm.justLeavespringBackendv2.com.nibm.justLeavespringBackendv2.dao.WebUsersDAO;
import com.nibm.justLeavespringBackendv2.model.WebUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebUsersController {

    @Autowired
    private WebUsersDAO wuDAO;

    @GetMapping("/webUsers")
    public List<WebUsers> getEmployees(){
        return wuDAO.getAll();
    }

    @PostMapping("/api/signup")
    public String signUp(@RequestBody WebUsers user){
        return wuDAO.save(user)+"No. of Accounts Created";

    }


}
