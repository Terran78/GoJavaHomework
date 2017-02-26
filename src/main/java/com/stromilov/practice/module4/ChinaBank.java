package com.stromilov.practice.module4;


public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) { limitOfWithdrawal = 100;  }
        if (getCurrency() == Currency.EUR) { limitOfWithdrawal = 150;  }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        if (getCurrency() == Currency.USD) LimitOfFunding = 10000;
        if (getCurrency() == Currency.EUR) LimitOfFunding = 5000;
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int MonthlyRate = 0;
        if (getCurrency() == Currency.USD) MonthlyRate = 1;
        if (getCurrency() == Currency.EUR) MonthlyRate = 0;
        return MonthlyRate;
    }

    @Override
    int getCommission(int amount) {
        int Commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) Commission = 3; else Commission = 5;
        }
        if (getCurrency() == Currency.EUR) {
            if (amount <= 1000) Commission = 10; else Commission = 11;
        }
        return Commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return numberOfEmployees * avrSalaryOfEmployee;
    }
}
