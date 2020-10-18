package com.joaodartora.generics.rawtypes;

import java.util.List;

public class RawTypeDemo {

//  Raw-Type is a generic class without type argument/parameters
//  Is not type-safe
//  Avoid using raw types, compiler will not raise compile-time exception if a raw-type collection had more than 1 type
//  Raw-type were retained to maintain compatibility with older versions of Java

    public static void main(String[] args) {

        Box<Integer> genericBox = new Box<>(List.of(1, 2, 3));

        genericBox.getGenericList()
                .forEach(System.out::println);

        Box rawBox = new Box(List.of(1, 2, "stringError"));
    }

}
