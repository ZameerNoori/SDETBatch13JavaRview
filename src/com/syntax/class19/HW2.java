package com.syntax.class19;

public class HW2 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static void printF() {
        System.out.println("F");
    }

    static class B extends HW2 {
        public static void main(String[] args) {
            B ab=new B();
            ab.printF();
        }
    }
}