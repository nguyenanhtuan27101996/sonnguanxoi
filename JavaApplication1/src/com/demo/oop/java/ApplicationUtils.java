/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.oop.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class ApplicationUtils {

    private static List<Student> students;

    public static boolean checkLogin(User user) {
        return (user.getUsername().equals("admin") && user.getPassword().equals("123456")) ? true : false;
    }

    public static List<Student> initStudents() {
        students = new ArrayList<>();

        Student student1 = new Student(1, "John Doe", 19, "A1", 10.0f, 9.0f, 8.0f);
        Student student2 = new Student(2, "James Mcavoy", 19, "A2", 9.0f, 9.0f, 8.0f);
        Student student3 = new Student(3, "T Bag", 19, "A1", 7.0f, 6.0f, 8.0f);
        Student student4 = new Student(4, "John Snow", 19, "A1", 10.0f, 7.0f, 8.0f);
        Student student5 = new Student(5, "Doraemon", 19, "A1", 8.0f, 9.0f, 8.0f);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (student.getId().equals(students.get(i).getId())) {
                students.set(i, student);
            }
            
        }
    }
    
    public static void removeStudent(Integer id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.remove(i);
            }
            
        }
    }
    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        ApplicationUtils.students = students;
    }

}
