package com.joaodartora.generics.interfaces;

public class App {

    public static void main(String[] args) {

        DataInterface<String> dataInterface = new Data<>("Generic implemented interface");

        System.out.println(dataInterface.getData());
    }
}
