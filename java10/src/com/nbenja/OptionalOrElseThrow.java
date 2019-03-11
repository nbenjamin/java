package com.nbenja;

import static java.util.Optional.of;
import static java.util.Optional.ofNullable;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class OptionalOrElseThrow {

  static  Map<String, Book> books = Map.of("Java10", new Book("Java10", "isbn10"),
      "Java11", new Book("Java10", "isbn11"));

  public static void main(String[] args) throws Throwable {

    System.out.println(getBookByName("Java10").orElseThrow(RuntimeException::new));

    System.out.println(getBookByName("Java12").orElseThrow(RuntimeException::new));
  }

  static Optional<Book> getBookByName(String name) {
    return Optional.ofNullable(books.get(name));
  }

  static class Book {
    String name;
    String isbn;

    public Book(String name, String isbn) {
      this.name = name;
      this.isbn = isbn;
    }

    @Override
    public String toString() {
      return name + " - "+ isbn;
    }
  }
}
