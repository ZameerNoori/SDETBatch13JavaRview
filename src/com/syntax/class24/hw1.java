package com.syntax.class24;

/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file
 we need Microsoft word to be installed etc
 */
public abstract class hw1 {
    abstract void open();

    abstract void edit();

    abstract void close();

    public static void main(String[] args) {
        hw1[] tester = {new JavaFile(), new WordFile(), new PdfFile()};
        for (hw1 HW1 : tester) {
            HW1.open();
            HW1.edit();
            HW1.close();
            System.out.println();
        }
    }
}

class JavaFile extends hw1 {

    @Override
    void open() {
        System.out.println("Open Java");
    }

    @Override
    void edit() {
        System.out.println("Edit Java");
    }

    @Override
    void close() {
        System.out.println("Close Java");
    }
}

class WordFile extends hw1 {

    @Override
    void open() {
        System.out.println("Open Wordpad");
    }

    @Override
    void edit() {
        System.out.println("Edit Wordpad");
    }

    @Override
    void close() {
        System.out.println("close Wordpad");
    }
}

class PdfFile extends hw1 {

    @Override
    void open() {
        System.out.println("Open pdf");
    }

    @Override
    void edit() {
        System.out.println("Edit pdf");
    }

    @Override
    void close() {
        System.out.println("close pdf");
    }
}

