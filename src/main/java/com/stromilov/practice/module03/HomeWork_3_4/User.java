package com.stromilov.practice.module03.HomeWork_3_4;

public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String compsnyName;
    private int salary;
    private String currency;

    protected User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.compsnyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public String getCompsnyName() {
        return compsnyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public void setCompsnyName(String compsnyName) {
        this.compsnyName = compsnyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary(){
        System.out.println("Total balances with salary after " + monthOfEmployment + " month of work = " + (balance + salary) + currency);
    }

    void withdraw (int summ) {
        if (summ < 1000) {
            System.out.println("Balances = " + balance + " Withdrawal = " + summ);
            System.out.println("Withdraw with commission = " + (summ * 1.05) + " " + currency);
            System.out.println("Balance after withdrawal = " + (balance - summ * 1.05) + " " + currency);
        } else {
            System.out.println("Withdraw with commission = " + (summ * 1.1) + " " + currency);
            System.out.println("Balance after withdrawal = " + (balance - summ * 1.1) + " " + currency);
        }
    }

    void companyNameLength (String companyName){
        System.out.println("Company name " + companyName + " length - " + companyName.length() + " characters");
    }

    void monthIncreaser (int addMonth){
        System.out.println("Now employer worked at company - " + (monthOfEmployment + addMonth) + " month");
    }


}
