package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lim Evgeny");
        student.setGroupNumber("CS-420");
        student.setAccepted(new Date());

        System.out.println(student.getAccepted() + " " +  student.getName() + " is a student of " + student.getGroupNumber() + " group");
    }
}
