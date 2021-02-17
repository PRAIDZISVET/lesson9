package com.itacademy.lesson9;

public class Actor implements Comparable<Actor> {
    private String firstName;
    private String lastName;
    private int fee;

    public Actor(String firstName, String lastName, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                '}';
    }

    @Override
    public int compareTo(Actor o) {
        return this.firstName.compareTo(o.firstName);
    }
}
