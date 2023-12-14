package com.model;

import java.util.Objects;


public class Student {

    private int id;
    private String name;
    private double age;
    private double marks;
    private boolean isPassed;

//    no args constructor
    private Student(){

    }
//    parameterized constructor
public Student(int id, String name, double age, double marks, boolean isPassed){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.isPassed = isPassed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", isPassed=" + isPassed +
                '}';
    }
}
