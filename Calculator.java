package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take input till user does not press X or x

        while (true) {
            System.out.print("Enter the operator or 'x' to exit: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter first Int");
                int n = input.nextInt();
                System.out.println("Enter second Int");
                int x = input.nextInt();
                if (op == '+') {
                    System.out.println(n + x);
                }
                if (op == '-') {
                    System.out.println(n - x);
                }
                if (op == '*') {
                    System.out.println(n * x);
                }
                if (op == '/') {
                    if (x != 0) {
                        System.out.println(n / x);
                    }
                }
            } else if (op == 'x') {

                break;
            } else {
                System.out.println("Invalid Syntax Try Again");
            }
        }
    }
}
