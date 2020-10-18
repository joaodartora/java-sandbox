package com.joaodartora.generics.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

//      The method below will raise a ClassCastException at runtime
        typeUnsafeExecution();

//      The method below is type safe and will not raise any Exception
        typeSafeExecution();

    }

    private static void typeSafeExecution() {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("1");
        for (String object: list) {
            String stringObject = object;
        }
    }

    private static void typeUnsafeExecution() {
        List list = new ArrayList();
        list.add("John");
        list.add(1);
        for (Object object: list) {
            String stringObject = (String) object;
        }
    }
}
