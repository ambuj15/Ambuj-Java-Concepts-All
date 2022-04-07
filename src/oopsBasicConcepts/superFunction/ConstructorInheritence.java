package oopsBasicConcepts.superFunction;


public class ConstructorInheritence {

    ConstructorInheritence()
    {
        System.out.println("Parent Class");
    }
}

class B1 extends ConstructorInheritence{
    B1(){
        System.out.println("Child B1");
    }
}

class C1 extends B1{
    C1(){
        System.out.println("Child C1");
    }

    public static void main(String[] args) {
        C1 obj = new C1();
    }
}

// Output :

//    Parent Class
//    Child B1
//    Child C1

// Here you see the compiler internally by default calling the constructors of immediate parent class. This is happening because internally java compiler have added super() keyword in each child class constructor.

