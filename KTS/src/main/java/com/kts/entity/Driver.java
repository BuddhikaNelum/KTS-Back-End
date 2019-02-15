package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    private int driverId;
    private String name;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                '}';
    }
}
