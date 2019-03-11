package com.nbenja;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesClassChanges {

  public static void main(String[] args) throws IOException {
    Path path = Files.createTempFile(Paths.get(System.getProperty("test.dir", ".")), "test", ".txt");
    Files.writeString(path, "Hello World \nAgain");

    System.out.println( Files.readString(path));


  }
}
