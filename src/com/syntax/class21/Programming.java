package com.syntax.class21;
/*
Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Programming {
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String z){
        System.out.println("programming language "+z);
    }

    public static void main(String[] args) {
        Programming pro=new Programming("java");
        Programming pro2=new Programming();
    }
}
