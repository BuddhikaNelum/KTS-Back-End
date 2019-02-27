package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Hire {

    @Id
    private int hireId;
    @ManyToOne
    private
    Container containerId;
    @ManyToOne
    private Driver driverId;
    private Date date;

    public int getHireId() {
        return hireId;
    }

    public void setHireId(int hireId) {
        this.hireId = hireId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Driver getDriverId() {
        return driverId;
    }

    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }


    public Container getContainerId() {
        return containerId;
    }

    public void setContainerId(Container containerId) {
        this.containerId = containerId;
    }
}
