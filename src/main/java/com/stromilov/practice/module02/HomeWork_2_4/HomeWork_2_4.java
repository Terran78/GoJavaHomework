package com.stromilov.practice.module02.HomeWork_2_4;

public class HomeWork_2_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double fund = 100;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                balances[i] += fund;
                System.out.println(ownerName + " " + balances[i]);
            }
        }
    }
}
