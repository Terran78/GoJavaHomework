package com.stromilov.practice.module02.Homework_2_2;

public class HomeWork_2_2 {
    public static void main(String[] args) {
        double balance   = 100;
        double withrawal = 10;
        double commision = 0.05;

        System.out.println("Input");
        System.out.println("------");
        System.out.println(" ");
        System.out.println("balance    = " + balance);
        System.out.println("withdrawal = " + withrawal);
        System.out.println(" ");
        System.out.println("Output");
        System.out.println("-------");
        if ((withrawal + (withrawal*commision))<balance) {
            balance -= (withrawal + (withrawal * commision));
            System.out.println("OK " + (withrawal * commision) + " " + balance);
        }
            else System.out.println("NO ");
        }
    }
