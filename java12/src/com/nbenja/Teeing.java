package com.nbenja;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Teeing {
    public static void main(String[] args) {

        BiFunction<Optional<Integer>, Optional<Integer>, Optional<String>> ofOp = (o, o2) -> {
            return Optional.of("min value - " + o.get() +" Max value - "+ o2.get());
        };

        Optional<String> result = Stream.of(5,11,1,9,3)
                .collect(teeing(minBy(Integer::compareTo), maxBy(Integer::compareTo),ofOp));

        System.out.println(result.get());
    }
}
