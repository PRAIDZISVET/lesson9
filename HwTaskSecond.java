package com.itacademy.lesson9;

import java.util.*;

public class HwTaskSecond {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Den", "Kuznezov", 20, 9.2),
                new Student("Eva", "Petrova", 20, 9.0),
                new Student("Eva", "Petrova", 20, 8.7),
                new Student("Kim", "Fillipov", 21, 6.7),
                new Student("Olga", "Ivanovich", 18, 9.4),
                new Student("Eva", "Krug", 19, 7.1)
        );

        print(students);

        findBestStudent(students);

        Collections.sort(students);
        print(students);

        students.sort(new StudentFullNameComparator());
        print(students);

        students.sort(new StudentAgeComparator());
        print(students);

        students.sort(new StudentAverageMarkComparator());
        print(students);

        students.sort(Comparator.comparing(Student::getFirstName)
                                .thenComparing(Student::getLastName)
                                    .thenComparing(Student::getAge)
                                    .thenComparing(Student::getAverageMark).reversed());
    print(students);
    }


    private static void findBestStudent (List<Student> list) {
        Iterator<Student> iterator = list.listIterator();
        Student bestStudent = list.get(0);
        for (Student student: list) {
            bestStudent = student.getAverageMark() > bestStudent.getAverageMark()? student : bestStudent;
        }
        System.out.println("Best student: " + bestStudent);
        System.out.println();
    }

    private static void print (List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
