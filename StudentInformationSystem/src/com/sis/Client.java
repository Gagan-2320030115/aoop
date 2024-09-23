package com.sis;

public class Client {
    public static void main(String[] args) {
      
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");


        Enrollment enrollment = new SimpleEnrollment();

 
        enrollment.enroll(student1, course1);
        enrollment.enroll(student2, course2);

      
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(course1);
        System.out.println(course2);
    }
}
