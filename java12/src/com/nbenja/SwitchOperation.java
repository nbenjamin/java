package com.nbenja;


import java.util.Scanner;

public class SwitchOperation {

    public static void main(String[] args) {


        String result = switch ("M") {
            case "M", "T", "W", "F" -> {
                System.out.println("Testing break return feature");
                break "Weekdays";
            }
            case "S" -> "Weekends";
            default -> throw new IllegalStateException("Unexpected value: ");
        };

        System.out.println("First switch result  - " + result);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String type = switch (scanner.next()) {
                case "M", "T", "W", "F" -> "Weekdays";
                case "S" -> "Weekends";

                default -> throw new IllegalStateException("Unexpected value: " + scanner.next());
            };

            System.out.println(" Switch return type - "+ type);
        }


    }
}
