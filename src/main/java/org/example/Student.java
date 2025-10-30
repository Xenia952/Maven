package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double averageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
}
