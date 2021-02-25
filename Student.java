package com.itacademy.lesson9;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;
    private double averageMark;

    public Student(String firstName, String lastName, int age, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
   public String toString () {
        return "Student {" +
                " firstName: " + firstName + "," +
                " lastName: " + lastName + "," +
                " age: " + age + "," +
                " averageMark: " + averageMark +
                "}";
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }
}
