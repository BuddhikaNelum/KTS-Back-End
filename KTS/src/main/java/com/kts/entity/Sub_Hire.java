package com.kts.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Sub_Hire {

    @Id
    private int subHireId;

    @ManyToOne
    @JoinColumn(name = "mainHireId")
    private Main_Hire main_hire;

    private Date date;

    @ManyToMany
    @JoinColumn(name = "jobRoleId")
    private Job_Role job_role;

    public int getSubHireId() {
        return subHireId;
    }

    public void setSubHireId(int subHireId) {
        this.subHireId = subHireId;
    }

    public Main_Hire getMain_hire() {
        return main_hire;
    }

    public void setMain_hire(Main_Hire main_hire) {
        this.main_hire = main_hire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Job_Role getJob_role() {
        return job_role;
    }

    public void setJob_role(Job_Role job_role) {
        this.job_role = job_role;
    }

    @Override
    public String toString() {
        return "Sub_Hire{" +
                "subHireId=" + subHireId +
                ", main_hire=" + main_hire +
                ", date=" + date +
                ", job_role=" + job_role +
                '}';
    }
}
