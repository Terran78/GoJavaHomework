package com.stromilov.practice.module4;

import java.util.Currency;

public class USBank extends Bank{


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    int getLimitOfWithdrawal() {
        return 0;
    }

    int getLimitOfFunding() {
        return 0;
    }

    int getMonthlyRate() {
        return 0;
    }

    int getCommission(int summ) {
        return 0;
    }
}
