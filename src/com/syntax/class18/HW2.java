package com.syntax.class18;

public class HW2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static void main(String[] arg) {
        String stringinput = "Zameer";
        char[] resultarray = stringinput.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--)
            System.out.print(resultarray[i]);

    }

}
