# Java 11 main features

Covers only the major changes, there are many other changes apart from this in [java 11](https://openjdk.java.net/projects/jdk/11/)

### Read and write File as String

```java
    Path path = Files.createTempFile(Paths.get(System.getProperty("test.dir", ".")), "test", ".txt");
    Files.writeString(path, "Hello World \nAgain");

    System.out.println( Files.readString(path));
    
```

### Changes in String class
  1. isBlank
  2. lines
  3. repeat
  4. strip
  5. stripLeading
  6. stripTrailing
  
### Nest Based Class Access Control

```java
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

```