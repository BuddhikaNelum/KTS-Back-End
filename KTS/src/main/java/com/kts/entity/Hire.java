package com.kts.entity;

import javax.persistence.*;
import java.util.Date;

public class Hire {

    @Id
    private int hireId;

    @ManyToOne
    @Column(name = "containerId")
    private Container container;

    private Date date;

    @ManyToOne
    @Column(name = "driverId")
    private Person driver;

    @ManyToOne
    @Column(name = "mateId")
    private Person mate;


    public int getHireId() {
        return hireId;
    }

    public void setHireId(int hireId) {
        this.hireId = hireId;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Person getMate() {
        return mate;
    }

    public void setMate(Person mate) {
        this.mate = mate;
    }
}
