package com.codedifferently.labs.partB.ex02;

public class Maximum {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int max = Math.max(num1, num2);
        System.out.println("Max number between " + num1 + " and " + num2 + " is: " + max);
    }
}
