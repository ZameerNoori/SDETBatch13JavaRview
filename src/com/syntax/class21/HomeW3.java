package com.syntax.class21;
/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class HomeW3 {
    private static void math(int a){
        System.out.println(a);
    }
    private void math(double b, double c){
        System.out.println(b+c);
    }
    private void math(int f, double h, int d){
        System.out.println(f+h+d);
    }

    public static void main(String[] args) {
        HomeW3 hw=new HomeW3();
        hw.math(1,2.2);
    }
}
