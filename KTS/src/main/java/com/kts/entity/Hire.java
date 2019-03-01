package com.kts.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Hire {

    @Id
    private int hireId;

    @ManyToOne
    @JoinColumn(name = "containerNo")
    private Container containerNo;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "driver")
    private Person driver;

    @ManyToOne
    @JoinColumn(name = "mate")
    private Person mate;

    @ManyToOne
    @JoinColumn(name = "vechileNo")
    private Vehicle vehicle;


    public int getHireId() {
        return hireId;
    }

    public void setHireId(int hireId) {
        this.hireId = hireId;
    }

    public Container getContainer() {
        return containerNo;
    }

    public void setContainer(Container containerNo) {
        this.containerNo = containerNo;
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


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Hire{" +
                "hireId=" + hireId +
                ", containerNo=" + containerNo +
                ", date=" + date +
                ", driver=" + driver +
                ", mate=" + mate +
                ", vehicle=" + vehicle +
                '}';
    }
}
