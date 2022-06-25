package com.syntax.class19;

//Write a Java program called Teacher.  Identify features and behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
// Test all 4 classes
public class Teacher {
    String name;
    String subject;

    void method1() {
        System.out.println(name + subject);
    }
}

class MathTeacher extends Teacher {
    MathTeacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

class PianoTeacher extends Teacher {
    PianoTeacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public static void main(String[] args) {
        ChemistryTeacher m=new ChemistryTeacher("Zameer: ","World War Z");
        m.method1();
        MathTeacher ma=new MathTeacher("Jennifer: ","Language");
        ma.method1();
        PianoTeacher p=new PianoTeacher("Selda: ","Arabic");
        p.method1();


    }
}