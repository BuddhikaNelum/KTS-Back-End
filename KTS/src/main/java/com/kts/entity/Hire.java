package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Hire {

    @Id
    private int hireId;
    private String containerId;
    private int driverId;
    private Date date;

    public int getHireId() {
        return hireId;
    }

    public void setHireId(int hireId) {
        this.hireId = hireId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Hire{" +
                "hireId=" + hireId +
                ", containerId='" + containerId + '\'' +
                ", driverId=" + driverId +
                ", date=" + date +
                '}';
    }
}
