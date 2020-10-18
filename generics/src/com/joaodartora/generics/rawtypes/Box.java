package com.joaodartora.generics.rawtypes;

import java.util.List;

public class Box<T> {

    private List<T> genericList;

    public Box(List<T> genericList) {
        this.genericList = genericList;
    }

    public List<T> getGenericList() {
        return genericList;
    }

    public void setGenericList(List<T> genericList) {
        this.genericList = genericList;
    }
}
