package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of a circle below: (in integer form)");
        int radius = scanner.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of given circle is: " + area);
    }
}
