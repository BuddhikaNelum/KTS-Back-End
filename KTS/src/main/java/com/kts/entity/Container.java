package com.kts.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
>>>>>>> b792e4b8aed415b55e47da47419ffdde28d128c9

@Entity
public class Container {

    @Id
    private String containerId;
<<<<<<< HEAD
    @ManyToOne
    private Container_Size containerSize;
=======

    @OneToMany
    @JoinColumn(name = "containerSizeId")
    private int containerSize;
>>>>>>> b792e4b8aed415b55e47da47419ffdde28d128c9

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public Container_Size getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(Container_Size containerSize) {
        this.containerSize = containerSize;
    }

    public Container() {
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerId='" + containerId + '\'' +
                ", containerSize=" + containerSize +
                '}';
    }
}
