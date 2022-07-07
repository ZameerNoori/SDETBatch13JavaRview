package com.syntax.class19;

public class A {
    void methodA() {
        System.out.println("Zam");
    }

    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    static class B extends A {
        void methodB() {
            System.out.println("Jen");
        }

        public void printF() {
            System.out.println("F");
        }
    }

    static class C extends B {
        void methodC() {
            System.out.println("Kat");
        }

        public static void main(String[] args) {
            C b = new C();
            b.methodA();
            b.methodB();
            b.methodC();
        }
    }
}

