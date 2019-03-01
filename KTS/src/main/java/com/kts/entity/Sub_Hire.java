package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sub_Hire {

    @Id
    private int subHireId;

    @OneToOne
    private Hire mainHire;

    @OneToOne
    private Hire subHire;

    public Sub_Hire() {
    }

    public Sub_Hire(Hire mainHire, Hire subHire) {
        this.setMainHire(mainHire);
        this.setSubHire(subHire);
    }


    public int getSubHireId() {
        return subHireId;
    }

    public void setSubHireId(int subHireId) {
        this.subHireId = subHireId;
    }

    public Hire getMainHire() {
        return mainHire;
    }

    public void setMainHire(Hire mainHire) {
        this.mainHire = mainHire;
    }

    public Hire getSubHire() {
        return subHire;
    }

    public void setSubHire(Hire subHire) {
        this.subHire = subHire;
    }
}
