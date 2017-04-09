package com.stromilov.practice.module06.HomeWork_6_3;

import com.stromilov.practice.module06.HomeWork_6_2.User;

public class UsersMain {
    public static void main(String[] args) {

        User userFirst = new User(123,"Piter", "Poroshenko", 1000, 3000);
        User userSecond = new User(234,"Voldemar", "Groisman", 500, 1000);
        User userThird = new User(345,"Arsen", "Yacenuk", 2000, 30000);
        User userForth = new User(456,"Ivan", "Petrov", 1500, 10000);
        User userFifth = new User(567,"Sidor", "Ivanov", 300, 500);

        User[] users = new User[] {userFirst, userSecond, userThird, userForth, userFifth};

        System.out.println(users);

        // Как запустить проверку списков?
    }
}
