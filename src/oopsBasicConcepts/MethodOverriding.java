package oopsBasicConcepts;

public class MethodOverriding {
    public void show() {
        System.out.println("Show of Parent class");
    }

    // Overridiing static method
    public static void staticMethod() {
        System.out.println("Static Method of Parent class");
    }

    private void privateMethod(){                          // As it is private it can never be overriden or even accessed from other class via objects too.
        System.out.println("I am Private Method of Parent");
    }

    protected void protectedMethod(){
        System.out.println("I am protected method of parent class");
    }

}

class Child extends MethodOverriding {

    public void display() {
        super.show();
    }

    public void show() {
        System.out.println("Show of child class");
    }

    public static void staticMethod() {
        System.out.println("Static Method of Child class");
    }

    private void privateMethod(){                          // As it is private it can never be overriden or even accessed from other class via objects too.
        System.out.println("I am private method in child");
    }

    public void protectedMethod() {
        System.out.println("I am protected method in child");

    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.show(); // Show of child class
        obj1.display(); // Show of Parent class -- To access show of parent class using child class object super keyword is needed as compiler will otherwise call the method from it's own class
        System.out.println("========================================");

        MethodOverriding obj2 = new MethodOverriding();
        obj2.show(); // Show of Parent class
        // Parent class objects can be created in chil class but they will have access only to the parent class methods

        System.out.println("========================================");

        MethodOverriding obj3 = new Child();
        obj3.show(); // Show of child class
//        Child obj4 = new MethodOverriding(); // Using reference of child class object of parent class cannot be created

        // To check overriding of static Method
        Child static1 = new Child();
        static1.staticMethod();
        // Output : Static Method of Child class

        MethodOverriding static2 = new MethodOverriding();
        static2.staticMethod();
        // Output : Static Method of Parent class

        MethodOverriding static3 = new Child();
        static3.staticMethod();
        // As per overriding rules this
        // should call to class Child static
        // overridden method. Since static
        // method can not be overridden, it
        // calls Parent's staticMehod()
        // Hence output will be : Static Method of Parent class
    }

}
