package com.kts.entity;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    private int personId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "jobRoleId")
    private Job_Role job_role;


    public Person() {
    }

    public Person(int personId, String name, Job_Role job_role) {
        this.personId = personId;
        this.name = name;
        this.job_role = job_role;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job_Role getJob_role() {
        return job_role;
    }

    public void setJob_role(Job_Role job_role) {
        this.job_role = job_role;
    }
}
