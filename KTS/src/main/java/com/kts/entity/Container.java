package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Container {

    @Id
    private String containerId;
    private int containerSize;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public int getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(int containerSize) {
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
