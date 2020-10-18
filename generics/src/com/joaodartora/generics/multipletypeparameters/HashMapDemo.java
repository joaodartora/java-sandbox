package com.joaodartora.generics.multipletypeparameters;

public class HashMapDemo {

//    You can pass as many type parameters as you want to a class
//    For example, HashMap receives 2 type parameters, a key and a value
//    The Java convention to name type parameters is single, uppercase letters


    public static void main(String[] args) {

        Bin<String, Integer> bin = new Bin<>("Paper", 4);

        System.out.println("Dry: " + bin.getDryTrash() + " Wet: " + bin.getWetTrash());

    }

}
