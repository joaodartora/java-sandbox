package com.joaodartora.generics.multipletypeparameters;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

//    You can pass as many type parameters as you want to a class
//    For example, HashMap receives 2 type parameters, a key and a value
//    The Java convention to name type parameters is single, uppercase letters


    public static void main(String[] args) {

        Bin<String, Integer> bin = new Bin<>("Paper", 4);

        System.out.println("Dry: " + bin.getDryTrash() + " Wet: " + bin.getWetTrash());

        Map<String, BigDecimal> codeValueMap = new HashMap<>();
        codeValueMap.put("Bankslip", BigDecimal.TEN);

        System.out.println("Bankslip value: " + codeValueMap.get("Bankslip"));
    }

}
