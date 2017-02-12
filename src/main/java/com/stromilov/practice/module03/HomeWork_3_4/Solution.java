package com.stromilov.practice.module03.HomeWork_3_4;

/*
 Create User class with the following fields: String name, int balance, int monthsOfEmployment,
 String companyName, int salary, String currency.

 Create getters and setters and constructor with all fileds.

 Write methods:
 void paySalary() -  that add salary to the balance of the user
 withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
 companyNameLenght - calculates name of the company name
 monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */
public class Solution {
    public static void main(String[] args) {

        User Alex = new User("Alexander", 10000, 13, "Antonov", 3000, "UAH");

        Alex.paySalary();
        Alex.withdraw(500);
        Alex.withdraw(1500);
        Alex.companyNameLength("Antonov");
        Alex.monthIncreaser(1);


    }
}
