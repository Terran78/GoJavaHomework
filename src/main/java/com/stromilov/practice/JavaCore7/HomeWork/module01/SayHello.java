package com.stromilov.practice.JavaCore7.HomeWork.module01;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Enter Your name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
        scanner.close();
    }
}
