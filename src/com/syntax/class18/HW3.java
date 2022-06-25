package com.syntax.class18;

import java.util.Arrays;

public class HW3 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private String vowel(String name){
        return name.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        HW3 v=new HW3();
        System.out.println(v.vowel("Zameer"));
    }


}
