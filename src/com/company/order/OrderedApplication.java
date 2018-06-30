package com.company.order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class OrderedApplication {

    static List<String> words = Arrays.asList(
            "java",
            "class",
            "method",

            "tel-ran",
            "computer"
    );

    public static void main(String[] args) {
        Stream<String> stringStream = words.stream()
                //for example, 500 000 words
                //15
                .filter(x -> x.length() <= 6)
                .map(x -> x.toUpperCase());

        stringStream
                .forEach(/*x -> */System.out::println/*(x)*/);
//                .forEach(x -> System.out.println(x));

        //code....
        String firstResult = stringStream.findFirst().get();
        System.out.println(firstResult);


    }


}
