package oopsBasicConcepts.constructor;


public class ConstructorScenarios {
    private static int a;

    public ConstructorScenarios() {
        System.out.println("Hello from the constructor");
    }

    public void ConstructorScenarios() {
        System.out.println("Hello from the method having same name as of class");
    }

    public static void main(String[] args) {
        ConstructorScenarios c = new ConstructorScenarios();
        c.ConstructorScenarios();
    }
}

// Output :
//Hello from the constructor
//Hello from the method having same name as of class


class ConstructorChaining {
    {
        System.out.println("Hi from In it block");
    }

    public ConstructorChaining() {
        this(10);
        System.out.println("Hello from First Constructor without any parameter");
    }

    public ConstructorChaining(int a) {
        this(10, 20);
        System.out.println("Hello from second Constructor with one parameter");
    }

    public ConstructorChaining(int a, int b) {
        System.out.println("Hello from third Constructor with two parameter");
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining();
    }

}


