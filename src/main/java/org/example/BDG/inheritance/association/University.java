package org.example.BDG.inheritance.association;

import java.util.ArrayList;
import java.util.List;
public class University {
    private List<Student> students;
    public University() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);

    }
}

