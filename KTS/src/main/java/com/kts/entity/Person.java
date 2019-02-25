package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {

    @Id
    private int personId;
    private String name;

    @OneToMany
    @JoinColumn(name = "jobRoleId")
    private Job_Role job_role;

}
