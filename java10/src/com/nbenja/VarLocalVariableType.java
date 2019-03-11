package com.nbenja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarLocalVariableType {

  public static void main(String[] args) {

    // old way of declaration
    List<String> stringList = Arrays.asList("Java 8", "Java 7");

    // old way of declaration
    List<String> strings = List.of("Java 9", "Java 8");

    //java 10
    var varStrings = List.of("Java 10", "Java 11");

    varStrings.stream().forEach(System.out::println);

    // Wont work, array initialization is not allowed
    // var arrayOfStrings = {"Java 10", "Java 11"};


  }

  @FunctionalInterface
  interface Test {

    void run();

  }
}
