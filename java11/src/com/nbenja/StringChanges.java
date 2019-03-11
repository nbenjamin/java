package com.nbenja;

public class StringChanges {

  public static void main(String[] args) {
    var str = "java10\njava11\n\njava12";
    str.repeat(2).lines().filter(a -> !a.isBlank()).forEach(System.out::println);
  }
}
