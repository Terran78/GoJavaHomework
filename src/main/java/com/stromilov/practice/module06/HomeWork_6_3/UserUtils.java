package com.stromilov.practice.module06.HomeWork_6_3;

import com.stromilov.practice.module06.HomeWork_6_2.User;

public class UserUtils {
   public static User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && i != j) {
                    if (users[i].equals(users[j])) users[j] = null;
                }
            }
        }

        return deleteEmptyUsers(users);
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
       User[] usersWithConditionalBalances = new User[users.length];
       for (int i = 0; i < users.length; i++) {
           if (users[i].getBalance() == balance) usersWithConditionalBalances[i] = users[i];
        }
        return usersWithConditionalBalances;
    }

    public static User[]  paySalaryToUsers(User[] users){
        for (User user : users) {
            if (user != null) {
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
        return users;
    }

    public static long[] getUsersId(User[] users){
        long[] userID = new long[users.length];
        for (int i =0;  i < users.length; i++) {
            if (users[i] != null) {
                userID[i] = users[i].getId();
            }
        }
        return userID;
    }

    public static User[] deleteEmptyUsers(User[] users){
        int count = 0;
        for (User user : users) {
            if (user != null) count++;
        }
        User[] noEmptyUsers = new User[count];
        count = 0;
        for (User user : users) {
            if (user != null) {
                noEmptyUsers[count] = user;
                count++;
            }

        }
        return noEmptyUsers;
    }
}
