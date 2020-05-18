package br.com.devdojo.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * author: Jose Augusto for DevDojo SpringBoot Course on 5/18/20
 */

public class Student {
    private int id;
    private String name;
    public static List<Student> studentList;

    static {
        studentRepository();
    }

    public Student(int id, String name) {
        this(name);
        this.id = id;

    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    private static void studentRepository() {
        studentList = new ArrayList<>(asList(new Student(0,"Deku"),new Student(1,"Todoroki")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
