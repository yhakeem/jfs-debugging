package com.jfs;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Student studentOne = new Student("dallas@gmail.com", "Becca", LocalDate.of(2000, Month.AUGUST, 25), 3.5f);

        System.out.println(studentOne.getName());
        System.out.println(studentOne.getEmail());
        System.out.println(studentOne.getDob());
        System.out.println(studentOne.getGpa());

    }


}
