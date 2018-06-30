package com.company.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Stream API
        //String value
        //for
        //if
        // if
        //....
        //String value
        //for
        //if
        // if
        //
        //String value
        //for
        //if
        // if


        Integer integer = Stream.of(
                "this",
                "is",
                "java",
                "23",
                "stream",
                "api",
                "webinar")

                .filter(value -> value.length() < 5)
                /*
                "this", "is", "java", "23", "api"
                */
                .map(value -> value.length())
                //[4, 2, 4, 2, 3]
                .reduce((a, b) -> a + b)
                .get();

        System.out.println(integer);

        String[] names = {"Peter", "Jacob", "Sarah", "Barbara"};

        //public U map(T name)
        //public boolean filter(T name)
        //public void peek(T name)

        Person[] people = Arrays.stream(names)
                .map(name -> new Person(name))
                .peek(person -> {
                    if (person.getName().equals("Peter") ||
                            person.getName().equals("Jacob")) {
                        person.setGender("male");
                    } else {
                        person.setGender("female");
                    }
                })
                .sorted(Comparator.comparing(Person::getName))
                /*  .count(), .min(), .max()  */
//                .toArray(x -> new com.company.demo.Person[x]);
                .toArray(Person[]::new);

        Arrays.stream(people)
                .forEach(System.out::println);

    }
}

