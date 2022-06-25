package com.syntax.class21;
/*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
 */
public class HomeW1 {
    public void Ar(int w, int l) {
        System.out.println("rectangle =" + (w * l));
    }

    public void Ar(double side) {
        System.out.println("square =" + (side * side));
    }

    public void Ar(int h, double b) {
        System.out.println("box =" + (h * b));
    }

    public static void main(String[] args) {
        HomeW1 area=new HomeW1();
        area.Ar(5,10);
        area.Ar(5.5);
        area.Ar(10,10.5);
    }
}