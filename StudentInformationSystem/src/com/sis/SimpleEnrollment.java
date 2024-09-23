package com.sis;


public class SimpleEnrollment implements Enrollment {

    @Override
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course.getCourseId());
        course.addStudent(student);
    }
}
