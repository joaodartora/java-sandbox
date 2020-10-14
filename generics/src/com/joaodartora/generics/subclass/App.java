package com.joaodartora.generics.subclass;

public class App {

    public static void main(String[] args) {

        Data<String> sonClass = new Data<>("Son class");

        System.out.println(sonClass.getData());

        BaseData<String> dadClass = sonClass;

        System.out.println(dadClass);

//      If super class and son class must be off the same type, othercase compiler will throw a
//      compile time exception
    }
}
