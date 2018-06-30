package com.company.fitering;

import com.company.demo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class FilteringApplication {

    static List<String> strings = Arrays.asList(
            "a1",
            "a2",
            "b1",
            "b2",
            "c1",
            "c2");

    public static void main(String[] args) {
        //string - immutable


        boolean hasMoreThanTwoChars = strings.stream()
                .map(x -> x.toUpperCase())
                .anyMatch(x -> x.length() > 2);

        System.out.println(hasMoreThanTwoChars);

//        strings.stream()
        System.out.println(strings);
        //Collectors

        Optional<Person> optionalS = null;


        Person person = null;
        String data = "1, 2, 3, 4, 5, 6, 7, 8, 9, a";
        Optional<String> possibleValue =
                //Stream
                Stream.of(data.split(", ")) // Stream<String>
                .map(x -> {
                    try {
                        return Integer.parseInt(x);
                    } catch (Exception e) {
                        return null;
                    }
                }) //                       Integer
                .filter(Objects::nonNull) //boolean
//                .filter(x -> x!= null)
                .reduce((a, b) -> a + b) //Optional<Integer>

                //Optional
                .filter(totalAmount -> totalAmount.equals(46))// //Optional<Integer>
                .map(Object::toString); //Optional<String>


        System.out.println(possibleValue.orElse("No value below 46"));

        int count = new Person("asd")
                .getName()
                .toUpperCase()
                .substring(1)
                .trim()
                .toCharArray()
                .length;

    }
}
