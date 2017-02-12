package com.stromilov.practice.module03.HomeWork_3_3;

public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }
}
