package com.nbenja;

public class NestedClassAccess {

  public static void main(String[] args) {
    Inner nestedClassAccess = new NestedClassAccess().new Inner();
    nestedClassAccess.sayHello();
  }

  private String hello() {
    return "Hello";
  }

  class Inner {
    public void sayHello() {
      System.out.println(hello());
    }
  }
}
