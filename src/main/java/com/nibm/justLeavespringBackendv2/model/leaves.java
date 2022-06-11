package com.nibm.justLeavespringBackendv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class leaves {

    private int id;
    private String userID;
    private int leaveType;
    private String leaveDate;
    private int status;


    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setLeaveType(int leaveType) {
        this.leaveType = leaveType;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public int getLeaveType() {
        return leaveType;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public int getStatus() {
        return status;
    }

}