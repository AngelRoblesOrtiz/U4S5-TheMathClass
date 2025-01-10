package com.codedifferently.labs.partC;

import java.util.Scanner;

public class KeypadConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder conversion = new StringBuilder();

        System.out.println("Enter a message below: ");
        String message = scanner.nextLine().toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            String character = message.substring(i, (i + 1));
            if (character.equals("a")) {
                conversion.append("2");
            } else if (character.equals("b")) {
                conversion.append("22");
            } else if (character.equals("c")) {
                conversion.append("222");
            } else if (character.equals("d")) {
                conversion.append("3");
            } else if (character.equals("e")) {
                conversion.append("33");
            } else if (character.equals("f")) {
                conversion.append("333");
            } else if (character.equals("g")) {
                conversion.append("4");
            } else if (character.equals("h")) {
                conversion.append("44");
            } else if (character.equals("i")) {
                conversion.append("444");
            } else if (character.equals("j")) {
                conversion.append("5");
            } else if (character.equals("k")) {
                conversion.append("55");
            } else if (character.equals("l")) {
                conversion.append("555");
            } else if (character.equals("m")) {
                conversion.append("6");
            } else if (character.equals("n")) {
                conversion.append("66");
            } else if (character.equals("o")) {
                conversion.append("666");
            } else if (character.equals("p")) {
                conversion.append("7");
            } else if (character.equals("q")) {
                conversion.append("77");
            } else if (character.equals("r")) {
                conversion.append("777");
            } else if (character.equals("s")) {
                conversion.append("7777");
            } else if (character.equals("t")) {
                conversion.append("8");
            } else if (character.equals("u")) {
                conversion.append("88");
            } else if (character.equals("v")) {
                conversion.append("888");
            } else if (character.equals("w")) {
                conversion.append("9");
            } else if (character.equals("x")) {
                conversion.append("99");
            } else if (character.equals("y")) {
                conversion.append("999");
            } else if (character.equals("z")) {
                conversion.append("9999");
            } else if (character.equals(" ")) {
                conversion.append(" ");
            }
        }
        System.out.println(conversion);

    }
}
