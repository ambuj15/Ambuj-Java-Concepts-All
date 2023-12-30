package oopsBasicConcepts.constructor;

public class ParameterizedConstructorOnly {
    ParameterizedConstructorOnly(int a){
        System.out.println("Hi from only parameterized constructor of the class.");
    }

    public static void main(String[] args) {
        ParameterizedConstructorOnly obj = new ParameterizedConstructorOnly(10);
    }
}
