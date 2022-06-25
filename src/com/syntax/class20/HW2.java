package com.syntax.class20;
/*
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code
 */
public class HW2 {
    int radius;

        HW2(int radius) {
        this.radius = radius;
    }

    public void cA(int radius) {
        double s=0;
        s=(5.5)*(radius*radius);
        System.out.println(s);
    }
}
class circle extends HW2{
        circle(int radius) {
        super(radius);
    }


    public static void main(String[] args) throws InterruptedException {
        HW2 hw2=new HW2(50);
        hw2.cA(50);
    }
}


