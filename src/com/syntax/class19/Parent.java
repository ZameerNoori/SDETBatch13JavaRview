package com.syntax.class19;

public class Parent {
    String name="Noori";
    double money=1000000;

}
class Child extends Parent{
    void printInfo(){
        System.out.println("My full name is Zameer "+name);
    }
    void buyCar(){
        System.out.println("Buying car from Papas money "+money);
    }
}
class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
        child.buyCar();
    }
}
