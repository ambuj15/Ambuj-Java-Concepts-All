package oopsBasicConcepts.constructor;

public class MethodNameSameAsClassConstructorName {
    {
        System.out.println("Hello from init block");
    }
    public MethodNameSameAsClassConstructorName()
    {
        System.out.println("Hello from the constructor");
    }

    public void MethodNameSameAsClassConstructorName(){
        System.out.println("Hello from method with name same as that of class or constructor");
    }

    public static void main(String[] args) {
        MethodNameSameAsClassConstructorName m1 = new MethodNameSameAsClassConstructorName();
        MethodNameSameAsClassConstructorName m2 = new MethodNameSameAsClassConstructorName();
        m1.MethodNameSameAsClassConstructorName();
        m2.MethodNameSameAsClassConstructorName();
    }
}
