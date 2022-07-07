package com.syntax.class23;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    public void study() {
        System.out.println("study hard");
    }

    public void hWork() {
        System.out.println("Do homework");
    }

    public void cWork(String classwork) {
        System.out.println("Do " + classwork);
    }
}

class SyntaxStudent extends Student {
    @Override
    public void study() {
        System.out.println("syntax students study hard");
    }

    @Override
    public void hWork() {
        System.out.println("syntax students do a lot of HW");
    }

    public void cWork(String classwork) {
        System.out.println("syntax students do a lot of " + classwork);
    }
}

class CollegeStudent extends Student {
    @Override
    public void study() {
        System.out.println("college students study really hard");
    }

    @Override
    public void hWork() {
        System.out.println("college students do less HW");
    }

    public void cWork(String classwork) {
        System.out.println("college students do less " + classwork);
    }
}

class SchoolStudent extends Student {
    @Override
    public void study() {
        System.out.println("school students study everything");
    }

    @Override
    public void hWork() {
        System.out.println("school students do no HW");
    }

    public void cWork(String classwork) {
        System.out.println("school students do no " + classwork);
    }
}
