package com.codedifferently.labs.partB.ex03;

public class AbsoluteValue {
    public static void main(String[] args) {
        int a = - 445, b = 399, c = 33 - 212;
        int totalABC = a + b + c;
        int absVal = Math.abs(totalABC);
        System.out.println("Absolute Value of " + totalABC + " is " + absVal);
    }
}
