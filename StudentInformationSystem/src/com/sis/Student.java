package com.sis;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private String id;
    private List<String> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void enrollInCourse(String courseId) {
        courses.add(courseId);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", courses=" + courses + "]";
    }
}
