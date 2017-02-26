package com.stromilov.practice.module4;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount != 0) {
            Bank userBank = user.getBank();
            double commission = (userBank.getCommission(amount));
            System.out.println("Balance: " + user.getBalance() + " Limit withdrawal: "+userBank.getLimitOfWithdrawal()+" Sum withdraw: "+amount+" Commission: "+ amount*commission/100);
            if (isCheckLimitWithdrawal(user, amount)) {
                double newBalance = user.getBalance() - (amount + (amount * (commission/100)));
                user.setBalance(newBalance);
                System.out.println("Balance after withdrawal: " + user.getBalance());
            } else {
                System.out.println("Error in Withdrawal");
            }
        }

    }

    public void fundUser(User user, int amount) {
        if (amount != 0) {
            Bank userBank = user.getBank();
            System.out.println("Limit of fund: " + userBank.getLimitOfFunding() + "Sum Fund: " + amount);
            if (isCheckLimitFunding(user, amount)) {
                double newBalance = user.getBalance() + amount;
                user.setBalance(newBalance);
            } else {
                System.out.println("Error in Funding");
            }
        }

    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount != 0) {
            Bank fromUserBank = fromUser.getBank();
            double comission = fromUserBank.getCommission(amount);
//            System.out.println("Amount: " + amount + " Comis: " + comission);
            if (isCheckLimitWithdrawal(fromUser, amount) && isCheckLimitFunding(toUser,amount)) {
                fromUser.setBalance(fromUser.getBalance() - (amount + (amount * comission/100)));
                toUser.setBalance(toUser.getBalance() + amount);
            } else {
                System.out.println("Error in transfer");
            }
        }
    }

    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        user.setMonthsOfEmployment(user.getMonthsOfEmployment() + 1);
    }

    private boolean isCheckLimitWithdrawal(User user, int amount) {
        Bank userBank = user.getBank();
        double comission = userBank.getCommission(amount);
//        System.out.println("Amount: " + amount + " Comis: " + comission);
        return userBank.getLimitOfWithdrawal() >= amount + (amount * comission/100);
    }
    private boolean isCheckLimitFunding(User user, int amount) {
        Bank userBank = user.getBank();
        return userBank.getLimitOfFunding() >= amount ;
    }

}
