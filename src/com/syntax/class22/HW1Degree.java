package com.syntax.class22;

import java.sql.SQLOutput;

public class HW1Degree {
    /*
 Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
 Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
 Call the method by creating an object of each of the three classes.
     */
     public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

    static class Masters extends HW1Degree{}
    static class Bachelors extends HW1Degree{ }

    public static void main(String[] args) {
        HW1Degree hw1=new HW1Degree();
        hw1.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
    }
}
