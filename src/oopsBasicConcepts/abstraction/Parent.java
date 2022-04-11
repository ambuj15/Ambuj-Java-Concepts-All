package oopsBasicConcepts.abstraction;

import org.w3c.dom.ls.LSOutput;

public abstract class Parent {

    Parent() {
        System.out.println("I am abstract class constructor");
    }


    public abstract void m1();

    public void m2() {
        System.out.println("I am m2 which is non-abstract from Parent");
    }

    public void m3() {
        System.out.println("I am m3 which is non-abstract from Parent");
    }

// Static and Abstract cannot be together as Static is class level and for abstract method need to be implemented in it's child class
//    public static abstract void m3();

// Abstract methods cannot be private but abstract class can have private methods
// private abstract void m4(); - Compilation Error
// private void m5(){} : This will work fine

// Abstract class can have static private methods but they should be concrete
    private static void m6(){}
}

class Child extends Parent {

    @Override
    public void m1() {
        System.out.println("I am abstract m1 from child class");
    }

    public void m3() {
        System.out.println("I am m3 which is non-abstract but overided from child");
    }

    public static void main(String[] args) {
        Child c = new Child(); // I am abstract class constructor
        c.m1(); // I am abstract m1 from child class
        System.out.println("---------------------------------");
        Parent p = new Child(); // Dynamic Binding
        //  I am abstract class constructor    : This is called because we have created child's object and jab bhi object banega child se pehle parent ka constructor call hoga hi hoga

        p.m1();   // I am abstract m1 from child class  : Overrided method

        p.m2();  // I am m2 which is non-abstract from Parent - Yeh child class mein nhi hai islie parent se aa gaya
        p.m3();  // I am m3 which is non-abstract but overided from child
    }
}

