package com.kts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Container_Size {

    @Id
    private int containerSizeId;
    private int containerSize;

    public int getContainerSizeId() {
        return containerSizeId;
    }

    public void setContainerSizeId(int containerSizeId) {
        this.containerSizeId = containerSizeId;
    }

    public int getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(int containerSize) {
        this.containerSize = containerSize;
    }

    @Override
    public String toString() {
        return "Container_Size{" +
                "containerSizeId=" + containerSizeId +
                ", containerSize=" + containerSize +
                '}';
    }
}
