package com.joaodartora.generics.classes;

public class App {

    public static void main(String[] args) {

        Data<String> stringData = new Data<>("This is first data");

        System.out.println(stringData);

        Data<Integer> integerData = new Data<>(31);

        System.out.println(integerData);
    }
}
