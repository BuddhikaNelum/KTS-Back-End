package com.kts.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Container {

    @Id
    private String containerId;
    @ManyToOne
    private Container_Size containerSize;

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

    @Override
    public String toString() {
        return "Container{" +
                "containerId='" + containerId + '\'' +
                ", containerSize=" + containerSize +
                '}';
    }
}
