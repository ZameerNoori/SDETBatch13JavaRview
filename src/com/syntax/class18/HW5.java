package com.syntax.class18;

public class HW5 {
    /*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
     */
    String name;
    int Math;
    int English;
    int Science;
    public HW5(int math, int eng, int science) {
        Math = math;
        English = eng;
        Science = science;
    }
    void averageGrade() {
        System.out.println("The average grade for " + name + " is " + ((Math + English + Science) / 3));
    }
}

