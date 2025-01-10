package com.codedifferently.labs.partA;

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Call your play");
        System.out.println("(1) Rock");
        System.out.println("(2) Paper");
        System.out.println("(3) Scissors");
        System.out.println("Type choice below:");
        int call = scanner.nextInt();

        if (call == 1) {
            System.out.println("You picked Rock");
        } else if (call == 2) {
            System.out.println("You picked Paper");
        } else if (call == 3) {
            System.out.println("You picked Scissors");
        }

        int play = (int) Math.floor(Math.random() * 3);
        if (play == 0) {
            System.out.println("I picked Rock");
            if (call == 1) {
                System.out.println("We tied!");
            } else if (call == 2) {
                System.out.println("You won!");
            } else if (call == 3) {
                System.out.println("You lost!");
            }
        } else if (play == 1) {
            System.out.println("I picked Paper");
            if (call == 2) {
                System.out.println("We tied!");
            } else if (call == 3) {
                System.out.println("You won!");
            } else if (call == 1) {
                System.out.println("You lost!");
            }
        } else if (play == 2) {
            System.out.println("I picked Scissors");
            if (call == 3) {
                System.out.println("We tied!");
            } else if (call == 1) {
                System.out.println("You won!");
            } else if (call == 2) {
                System.out.println("You lost!");
            }
        }


    }
}
