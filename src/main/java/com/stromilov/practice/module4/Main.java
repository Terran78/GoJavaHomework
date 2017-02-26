package com.stromilov.practice.module4;

public class Main {
    public static void main(String[] args) {
        Bank USBank = new USBank(123, "United States", Currency.USD, 15, 3000, 1, 10000000);
        Bank EUBank = new EUBank(456, "Germany", Currency.EUR, 10, 5000, 2, 15000000);
        Bank ChinaBank = new ChinaBank(789, "China", Currency.USD, 10, 5000, 2, 15000000);

        User userUSBankFirsrt = new User(1, "Ivan Dorn", 10000, 12, "FirstCompany", 2000, USBank);
        User userUSBankSecond = new User(2, "Petr I", 20000, 18, "SecondCompany", 3000, USBank);

        User userEUBankFirst = new User(3, "Sidor", 25000, 24, "Company First", 2500, EUBank);
        User userEUBankSecond = new User(4, "Anton", 5000, 10, "Company Second", 500, EUBank);

        User userChinaBankFirst = new User(5, "Genryh", 45000, 36, "BMW", 4000, ChinaBank);
        User userChinaBankSecond = new User(6, "Bob", 500000, 6, "Airbus", 40000, ChinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(userUSBankFirsrt, 500);
        bankSystem.fundUser(userUSBankFirsrt, 3000);
        bankSystem.transferMoney(userUSBankFirsrt, userUSBankSecond, 300);
        bankSystem.paySalary(userUSBankFirsrt);
        System.out.println(userUSBankFirsrt);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userUSBankSecond, 300);
        bankSystem.fundUser(userUSBankSecond, 1000);
        bankSystem.transferMoney(userUSBankSecond, userUSBankFirsrt, 600);
        bankSystem.paySalary(userUSBankSecond);
        System.out.println(userUSBankSecond);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userEUBankFirst, 500);
        bankSystem.fundUser(userEUBankFirst, 3000);
        bankSystem.transferMoney(userEUBankFirst, userEUBankSecond, 300);
        bankSystem.paySalary(userEUBankFirst);
        System.out.println(userEUBankFirst);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userEUBankSecond, 300);
        bankSystem.fundUser(userEUBankSecond, 1000);
        bankSystem.transferMoney(userEUBankSecond, userEUBankFirst, 600);
        bankSystem.paySalary(userEUBankSecond);
        System.out.println(userEUBankSecond);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userChinaBankFirst, 500);
        bankSystem.fundUser(userChinaBankFirst, 3000);
        bankSystem.transferMoney(userChinaBankFirst, userChinaBankSecond, 300);
        bankSystem.paySalary(userChinaBankFirst);
        System.out.println(userChinaBankFirst);
        System.out.println(" ");

        bankSystem.withdrawOfUser(userChinaBankSecond, 300);
        bankSystem.fundUser(userChinaBankSecond, 1000);
        bankSystem.transferMoney(userChinaBankSecond, userChinaBankFirst, 600);
        bankSystem.paySalary(userChinaBankSecond);
        System.out.println(userChinaBankSecond);
        System.out.println(" ");


    }
}
