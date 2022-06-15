package com.syntax.class16;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */

public class Students {
    String name;
    int ID;
   static int numberOfStudents;

    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Zam";
        s1.ID=123456;
        s1.numberOfStudents++;

        Students s2=new Students();
        s2.name="Jen";
        s2.ID=82978097;
        s2.numberOfStudents++;

        Students s3=new Students();
        s3.name="Kat";
        s3.ID=328732;
        s3.numberOfStudents++;

        System.out.println(numberOfStudents);
    }
}

