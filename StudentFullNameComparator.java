package com.itacademy.lesson9;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = 0;
        int firstNameComparator = o1.getFirstName().compareTo(o2.getFirstName());
        int lastNameComparator = o1.getLastName().compareTo(o2.getLastName());
        compareResult = firstNameComparator != 0 ? firstNameComparator : lastNameComparator;
        return compareResult;
    }
}
