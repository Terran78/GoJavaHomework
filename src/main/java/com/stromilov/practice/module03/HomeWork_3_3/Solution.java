package com.stromilov.practice.module03.HomeWork_3_3;

/*
  You need to create following structure of the classes.
 Class Course with fields: Date startDate, String name,
 int hoursDuration, String teacherName. Create two constructors with fields startDate, name;
 and hourseDuration, name, teacherName.
 Class Student with fields: String firstName, String lastName, int group,
 Course[] coursesTaken, int age. With 2 constructors firstName, lastName, group; and lastName, coursesTaken.
 CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
 Create three constructors: two the same as in Student and one with all the fields of the class.
 Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
 Create three constructors: two the same as in CollegeStudend and one with secretKey field.
 Create getters and setters for all fields and make fields private as OOP principle follows.
 Create 5 objects Course class. Create objects of others classes using every constructor.
 You must have 13 objects in Main class.
 */

import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Course[] coursesTaken = new Course[6];

        Student AlexStr = new Student("Alexandr", "Stromilov", 3);
        Student SviatVak = new Student("Vakarchuk", coursesTaken);

        CollegeStudent IvoBobul = new CollegeStudent("Ivo", "Bobul", 1);
        CollegeStudent JoSmith = new CollegeStudent("Smith", coursesTaken);
        CollegeStudent BlJack = new CollegeStudent("Black", "Jack", 3, 21, coursesTaken, 5, 123456);

        SpecialStudent TomHan = new SpecialStudent("Tom", "Hanks", 1);
        SpecialStudent VilSm = new SpecialStudent("Smith", coursesTaken);
        SpecialStudent IvIvan = new SpecialStudent("Ivan", "Ivanov", 4, coursesTaken, 654321);

        Course GoStart = new Course(new Date(18012017), "Start GoIt learning");
        Course GoEnd = new Course(new Date(20062017), "End GoIt Learning");
        Course Stud1 = new Course("Alexandr", 1, "Pasha");
        Course Stud2 = new Course("Piter", 2, "Andrew");
        Course Stud3 = new Course("Frank", 3, "Viktory");


    }
}
