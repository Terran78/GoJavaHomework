package com.stromilov.practice.module4;

public class USBank extends Bank{


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) { limitOfWithdrawal = 1000;  }
        if (getCurrency() == Currency.EUR) { limitOfWithdrawal = 1200;  }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        if (getCurrency() == Currency.USD) LimitOfFunding = Integer.MAX_VALUE;
        if (getCurrency() == Currency.EUR) LimitOfFunding = 10000;
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int MonthlyRate = 0;
        if (getCurrency() == Currency.USD) MonthlyRate = 1;
        if (getCurrency() == Currency.EUR) MonthlyRate = 2;
        return MonthlyRate;
    }

    @Override
    int getCommission(int amount) {
        int Commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) Commission = 5; else Commission = 7;
        }
        if (getCurrency() == Currency.EUR) {
            if (amount <= 1000) Commission = 6; else Commission = 8;
        }
        return Commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return numberOfEmployees * avrSalaryOfEmployee;
    }
}
