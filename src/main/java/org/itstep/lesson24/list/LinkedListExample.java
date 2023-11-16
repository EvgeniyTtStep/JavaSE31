package org.itstep.lesson24.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Jack"));
        students.addFirst(new Student("Max"));
        students.addLast(new Student("Tom"));


        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println("===================");

        //проходиться від останнього ел-ту до першого
        ListIterator<Student> listIterator = students.listIterator(students.size());
        while (listIterator.hasPrevious()){
            Student previous = listIterator.previous();
            System.out.println(previous.getName());
        }
    }

}

