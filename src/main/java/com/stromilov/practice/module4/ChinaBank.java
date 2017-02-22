package com.stromilov.practice.module4;

/**
 * Created by Admin on 22.02.2017.
 */
public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }
}
