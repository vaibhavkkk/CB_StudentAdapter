package com.example.vaibhav.cb_studentadapter;

/**
 * Created by vaibhav on 13-06-2017.
 */

public class Student {
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
