package com.kts.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Date;

public class Main_Hire {

    @Id
    private int mainHireId;

    @ManyToMany
    @JoinColumn(name = "containerId")
    private Container container;

    private Date date;

    @ManyToMany
    @JoinColumn(name = "jobRoleId")
    private Job_Role job_role;

    @Override
    public String toString() {
        return "Main_Hire{" +
                "mainHireId=" + mainHireId +
                ", container=" + container +
                ", date=" + date +
                ", job_role=" + job_role +
                '}';
    }
}
