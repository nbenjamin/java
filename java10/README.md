# Few major Java 10 Features

This covers basic commonly used java 10 features, 
Rest of the feature [details](https://www.oracle.com/technetwork/java/javase/10-relnote-issues-4108729.html)

### Optional.orElseThrow
  [Example](src/com/nbenja/OptionaOrElseThrow.java)

### Var - Local Variable Type
  ```java
      
    // java 8 declaration
    List<String> stringList = Arrays.asList("Java 8", "Java 7");

    // java 9 declaration
    List<String> strings = List.of("Java 9", "Java 8");

    //java 10 declaration
    var varStrings = List.of("Java 10", "Java 11");
    varStrings.add("String");
    
    varStrings.stream().forEach(System.out::println);
    
    // Wont work, array initialization is not allowed
    var arrayOfStrings = {"Java 10", "Java 11"};
  ```
  
### Parallel Full GC for G1

### Application Class-Data Sharing
  Reduce footprint by sharing common class metadata across different Java processes
  
###  APIs for Creating Unmodifiable Collections 

```java
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
    // Exception throws here  `Exception in thread "main" java.lang.UnsupportedOperationException`
    copyImmutableTestArray.add("fail here");
```