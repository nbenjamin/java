package com.nbenja;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

  public static void main(String[] args) {
    // List.of - return Unmodifiable Lists Strings
    var strings = List.of("Java9", "Java10");

    // List.copyOf - returns Unmodifiable Lists Strings
    var copyStrings = List.copyOf(strings);
    //copyStrings.add("Java11");
    //copyStrings.add(0, "Java11");

    var testArray = asList("Test", "again");
    testArray.set(0, "adding again");
    System.out.println(testArray);

    var copyImmutableTestArray = List.copyOf(testArray);
    System.out.println(copyImmutableTestArray);
    copyImmutableTestArray.add("fail here");
    System.out.println(copyImmutableTestArray);;
  }
}
