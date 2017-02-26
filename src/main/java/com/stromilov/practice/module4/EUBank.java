package com.stromilov.practice.module4;



public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (getCurrency() == Currency.USD) { limitOfWithdrawal = 2000;  }
        if (getCurrency() == Currency.EUR) { limitOfWithdrawal = 2200;  }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        if (getCurrency() == Currency.USD) LimitOfFunding = 10000;
        if (getCurrency() == Currency.EUR) LimitOfFunding = 20000;
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int MonthlyRate = 0;
        if (getCurrency() == Currency.USD) MonthlyRate = 0;
        if (getCurrency() == Currency.EUR) MonthlyRate = 1;
        return MonthlyRate;
    }

    @Override
    int getCommission(int amount) {
        int Commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) Commission = 5; else Commission = 7;
        }
        if (getCurrency() == Currency.EUR) {
            if (amount <= 1000) Commission = 2; else Commission = 4;
        }
        return Commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return numberOfEmployees * avrSalaryOfEmployee;
    }
}
