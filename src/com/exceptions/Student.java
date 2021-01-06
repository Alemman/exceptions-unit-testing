package com.exceptions;

public class Student {
    private String id;
    private String nombre;
    private int grade;
    private int average = 0;

    public Student(String nombre,String id) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return nombre;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getGrade(){
        return grade;
    }
    public void setAverage(int average) {
        this.average = average;
    }

    public int getAverage() {
    return average;
    }
}
