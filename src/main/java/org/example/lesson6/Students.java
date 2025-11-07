package org.example.lesson6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Students {
    private Set<Student> students;

    public Students() {
        students = new HashSet<>();
    }

    public void addStudent(String name, String group, int course) {
        Student student = new Student(name, group, course);
        students.add(student);
    }

    public void deleteStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public void transferStudents() {
        for (Student student : students) {
            if (student.averageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
