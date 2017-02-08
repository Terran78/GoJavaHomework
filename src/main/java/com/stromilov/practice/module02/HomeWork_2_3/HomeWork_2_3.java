package com.stromilov.practice.module02.HomeWork_2_3;

public class HomeWork_2_3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 210;
        double comission = 0.05;

        for (int i = 0; i < ownerNames.length; i++) {
             if (ownerNames[i] == ownerName) {
                if ((balances[i] > ((int)withdrawal+(int) withdrawal * (int) comission))) {
                    balances[i] = (int) (balances[i] - ((int)withdrawal+(int) withdrawal * comission));
                    System.out.println(ownerNames[i] + " " + (int)withdrawal + " " + balances[i]);
                } else {
                    System.out.println(ownerNames[i] + "  NO");
                }
            }

        }
    }
}
