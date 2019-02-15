package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Port_In {

    @Id
    private int portInId;
    private int hireId;
    private Date date;

    public int getPortInId() {
        return portInId;
    }

    public void setPortInId(int portInId) {
        this.portInId = portInId;
    }

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

    @Override
    public String toString() {
        return "Port_In{" +
                "portInId=" + portInId +
                ", hireId=" + hireId +
                ", date=" + date +
                '}';
    }
}
