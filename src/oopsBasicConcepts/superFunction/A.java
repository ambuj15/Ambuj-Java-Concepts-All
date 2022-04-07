package oopsBasicConcepts.superFunction;

public class A {
    A(int a) {
        System.out.println("A" + a);
    }
}

class B extends A {
    B(int a) {
        super(a);
        System.out.println("B" + a);
    }
}

class C extends B {
    C(int a) {
        super(a);
        System.out.println("C" + a);
    }
}

class Demo {
    public static void main(String[] args) {
        C obj = new C(10);
    }
}
