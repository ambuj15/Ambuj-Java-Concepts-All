package oopsBasicConcepts.superFunction;

public class Parent_01 {
    Parent_01(int a){
        System.out.println("Hello for the Parent_01 constructor");
    }
    public void show(int a){
        System.out.println("I am the show method of Parent class");
    }
}

class Child_01 extends Parent_01{
    Child_01(int b){
        super(10);
        System.out.println("Hello from the Child_01 constructor");
    }
    public void show(int a){
        System.out.println("I am the show method of the child class");
    }

    public static void main(String[] args) {
        Parent_01 p = new Child_01(10);
        Parent_01 p1 = new Parent_01(20);
        p.show(10);
        p1.show(20);
    }


}

class Test_01{
    public static void main(String[] args) {
        Parent_01 c = new Child_01(20);
        c.show(10);
    }
}