package com.stromilov.practice.module03.HomeWork_3_3;

public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent (String firstName, String lastName, int group, Course[] coursesTaken, long secretKey){
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

}
