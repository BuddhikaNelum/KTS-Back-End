package com.kts.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Container {

    @Id
    private String containerId;

    @ManyToOne
    @Column(name = "containerSizeId")
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
