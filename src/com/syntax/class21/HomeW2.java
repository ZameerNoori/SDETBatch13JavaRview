package com.syntax.class21;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class HomeW2 {
    static void str(String a){
        System.out.println("Soccer is the "+a);
    }
    static void str2(String a, int b){
        System.out.println("Dodge "+a+" has a supercharger with a "+b+" HP");
    }
    static void str3(char a, char b, char c, char d){
        System.out.println(a+""+b+""+c+""+d);
    }
    public static void main(String[] args) {
        str("best sport");
        str2("Demon", 820);
        str3('N','O','V','A');
    }
}
