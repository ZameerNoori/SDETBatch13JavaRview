package com.syntax.class16;
/*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
public class syntaxEmployee {
    int emID;
    int salary;
    static String coFounder="Sumair";

    void syntaxCom(){
        System.out.println("Empl1 "+emID+" $ "+salary+" CEO "+coFounder);
    }

    public static void main(String[] args) {
        syntaxEmployee e1=new syntaxEmployee();
        e1.emID=123;
        e1.salary=356;
        e1.coFounder="Sumair";

        syntaxEmployee e2=new syntaxEmployee();
        e2.emID=123;
        e2.salary=356;
        e2.coFounder="Sumair";

        e1.syntaxCom();
        e2.syntaxCom();

    }

}
