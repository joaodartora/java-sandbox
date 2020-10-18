package com.joaodartora.generics.boundedtypeparameter;

import java.util.Arrays;
import java.util.List;

public class BoundedT {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,8,9);
        List<Double> doubleList = Arrays.asList(2.5, 25.9, 7.4, 3.1);

        DataSorter<Integer> integerSorter = new DataSorter<>(integerList);
        DataSorter<Double> doubleSorter = new DataSorter<>(doubleList);

        integerSorter.getSortedData();
        doubleSorter.getSortedData();
        getSortedData(doubleList);
    }

    // Just like class bounded type parameters, method bounded type parameters forces the received generic class to follow some rules like extending some other class

    public static <T extends Number> void getSortedData(List<T> list){
        list.sort(null);
        for (T t : list){
            System.out.println(t);
        }
    }

}
