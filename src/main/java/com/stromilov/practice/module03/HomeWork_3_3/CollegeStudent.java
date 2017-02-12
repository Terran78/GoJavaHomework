package com.stromilov.practice.module03.HomeWork_3_3;

public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    protected CollegeStudent (String firstName, String lastName, int group, int age, Course[] coursesTaken, int rating, long id){
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
