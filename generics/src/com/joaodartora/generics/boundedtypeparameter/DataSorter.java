package com.joaodartora.generics.boundedtypeparameter;

import java.util.List;

public class DataSorter<T extends Number> {

    // Bounded type parameters on classes forces the generic class to follow some rules like extending some other class

    private List<T> list;

    public DataSorter(List<T> list) {
        this.list = list;
    }

    public void getSortedData(){
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }
}
