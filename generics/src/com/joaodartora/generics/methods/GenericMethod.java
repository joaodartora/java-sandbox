package com.joaodartora.generics.methods;

public class GenericMethod {

    // To turn a method on generic method, is necessary to put type parameter
    // between angle brackets before de return type

    public static <T> String concat(T data) {
        return "Data is : " + data;
    }

    public static void main(String[] args) {
        System.out.println(concat("a very cool data"));
        System.out.println(concat(3131));

    }

}
