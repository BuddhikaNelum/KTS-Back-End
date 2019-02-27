package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job_Role {
    @Id
    private int jobRoleId;
    private String title;

    public int getJobRoleId() {
        return jobRoleId;
    }

    public void setJobRoleId(int jobRoleId) {
        this.jobRoleId = jobRoleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Job_Role() {
    }

    @Override
    public String toString() {
        return "Job_Role{" +
                "jobRoleId=" + jobRoleId +
                ", title='" + title + '\'' +
                '}';
    }
}
