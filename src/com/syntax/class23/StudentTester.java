package com.syntax.class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] StudentTester = {new CollegeStudent(), new SchoolStudent(), new SyntaxStudent()};
        for (Student studentTester:StudentTester){
            studentTester.study();
            studentTester.hWork();
            studentTester.cWork("CW");
            System.out.println();
        }
    }
}
