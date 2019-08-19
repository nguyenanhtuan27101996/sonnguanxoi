/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.oop.java;

/**
 *
 * @author
 */
public class Student {
    private Integer id;
    private String fullName;
    private Integer age;
    private String grade;
    private Float mathPoint;
    private Float englishPoint;
    private Float literaturePoint;

    public Student() {
    }

    public Student(Integer id, String fullName, Integer age, String grade, Float mathPoint, Float englishPoint, Float literaturePoint) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.grade = grade;
        this.mathPoint = mathPoint;
        this.englishPoint = englishPoint;
        this.literaturePoint = literaturePoint;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(Float mathPoint) {
        this.mathPoint = mathPoint;
    }

    public Float getEnglishPoint() {
        return englishPoint;
    }

    public void setEnglishPoint(Float englishPoint) {
        this.englishPoint = englishPoint;
    }

    public Float getLiteraturePoint() {
        return literaturePoint;
    }

    public void setLiteraturePoint(Float literaturePoint) {
        this.literaturePoint = literaturePoint;
    }
            
    
}
