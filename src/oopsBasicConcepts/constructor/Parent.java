package oopsBasicConcepts.constructor;

public class Parent {
    {
        System.out.println(1);
    }

}

class Child1 extends Parent {

    {
        System.out.println(2);
    }

}

class Child2 extends Child1 {
    {
        System.out.println(3);
    }

}

class Main {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
    }

}

/*
Output :

1
2
3

The reason for this is that when child class constructor is called it by default calls the parent class constructor by internally putting super() keyword.
*/
