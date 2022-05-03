# Concepts

## Constructors
**Definition :** A constructor in Java is a **special method** that is used to initialize objects.

- The constructor is called when an object of a class is created.
- It can be used to set initial values for object attributes.
- Every time an object is created using the new() keyword, at least one constructor is called.

> Note: It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn’t have any.


**Question :** How Constructors are Different From Methods in Java?
- Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
- Constructors do not return any type while method(s) have the return type or void if does not return any value.
- Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

###Need of Constructor
- It is basically used to initialize the data members/Global Variables of the class.
- If we want to perform same task on multiple objects as soon as objects are formed in order to avoid method calling again and again separately constructors are created.

Example : Suppose there is an application in which Login is the first operation then in that case whenever functionality is used it's objects would be created and the login creds must be instantiated at the time of object creation.

###The rules for writing constructors are as follows:

- Constructor(s) of a class must have the same name as the class name in which it resides.
- **A constructor in Java can not be abstract, final, static, or Synchronized.**
- Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

### Types of constructors in Java
- Parameterized
- Non-Parameterized or default

> **Note:** Constructor is the first method that is executed on any object.

````
**Question** Can we create a method with the same name as that of constructor/class?
**Answer:** Yes, refer the following program.

package oopsBasicConcepts;


public class ConstructorScenarios {
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


````
### Constructor Chaining

It is the process by which you make a call from one constructor to other using **this()** function. This reduces the burden of intantiating different constructors again and again.

_**this**_ : It is the keyword which hold the address of the current object and use to refer to the instance variables of the class.

_**this()**_ : It is the function which is used to make a call to the constructors of the same class.

> Note :
> 
>* this() should be ths first statement in any constructor while making a call.
>* You cannot make a recursive call using this()
> 


````
Example: 1

class ConstructorChaining {

    public ConstructorChaining() {
        this(10);
        System.out.println("Hello from First Constructor without any parameter");
    }

    public ConstructorChaining(int a) {
        this(); // Here we will get compilation error because we are trying to use recurssion in constructor chanining.
        System.out.println("Hello from second Constructor with one parameter");
    }
}
````

````
Example 2 : How constructor chaining works:

class ConstructorChaining {

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

O/p : 

Hello from third Constructor with two parameter
Hello from second Constructor with one parameter
Hello from First Constructor without any parameter


````

### InIt block:

- When we want to perform some common operation on each object then in that case **Constructors** are used.
- When we want to perform some common operation on each constructor then in that case **in it** block is used.
- It doesn't have any name, return type. It's just opening and closing braces. {}
````
  Example 1:
  
  class ConstructorChaining {
  // Below one is In it block . I
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
    
Output :
    
Hi from In it block
Hello from third Constructor with two parameter
Hello from second Constructor with one parameter
Hello from First Constructor without any parameter
````
> **Note:** In above exapmle as we have created only once instance that is why only one time init is called. If we would have created multiple instances of multiple constructors, everytime init must have been called.


## Polymorphism

1. The basic idea is "One name and Many forms".
2. Used to reduce the complexity of the program

````
Question : What will be the output of the following problem statement?
package oopsBasicConcepts;

public class MethodOverloading {

    // 1. When we pass different parameters like int and long by switching the positions

    public void demo(int a, long b) {
        System.out.println("Sum = " + a + b);
    }

    public void demo(long a, int b) {
        System.out.println("Sum = " + a + b);
    }

    // 2. Different return types

    public float show() {
        return 10.0f;
    }

    public int show() // Compile time error stating both methods have same erasure;
    {
        return 10;
    }

    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        obj1.demo(10, 10);

        // Output : Ambiguity error as compiler will get confused bcz both can take 10 as input. To solve make one as  demo(int a, int b)
    }
}
````

## Inheritance

It is the concept in java by virtue of which one class called as **Child class** inherits the properties(fields) and behavior (methods and functions) of the parent class called as Base class.

#### Types of Inheritence

- Single Level Inheritence
- Multilevel Inheritence
- Multiple Inheritence (Not supported by Java)
- Hierarchical Inheritence

> You can refer about types from : https://www.geeksforgeeks.org/inheritance-in-java/

### Use of Inheritence
The main use of Inheritence is to achieve Method overriding and dynamic polymorphism or runtime polymorphism

## Overriding

Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.

**Example:**
````
public class MethodOverriding {
public void show() {
System.out.println("Show of Parent class");
}

}

class Child extends MethodOverriding {

    public void display() {
        super.show();
    }

    public void show() {
        System.out.println("Show of child class");
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
}
````
> Note : If we want to access the parent class functions in child class than you can use super keyword. But, super keyword doesn't work with class reference like **obji1.super.show()** instead **you need to call it in some method.**

### Rules for method overriding:

####    1. Overriding in case of access modifiers: 

- Overriding is possible from Weaker to stronger in case of access modifiers.
  
Weaker -> Stronger

Private -> Default -> Protected -> Public

The above phenomenon means that if in Parent class method is default then you can change it to either of Private, Protected or Public but reverse is not possible.

````
// A Simple Java program to demonstrate
// Overriding and Access-Modifiers
  
class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
  
class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }
  
    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
}
  
// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }
}

````

**OUTPUT**
>From parent m2()
> 
>From child m2()


### 2. Overriding a final method is prohibited

If we want to restrict a method from overriding declare it as final.

````
// A Java program to demonstrate that
// final methods cannot be overridden
  
class Parent {
    // Can't be overridden
    final void show() {}
}
  
class Child extends Parent {
    // This would produce error
    void show() {}
}
````
**OUTPUT**
>
> 13: error: show() in Child cannot override show() in Parent
void show() {  }
^
overridden method is final
> 

### 3. Static methods can not be overridden(Method Overriding vs Method Hiding) :

As static methods belongs to class hence even if you will try to override them in child class it will act as the child class specific method and not overriden method of parent class

````
// Java program to show that
// if the static method is redefined by
// a derived class, then it is not
// overriding, it is hiding
  
class Parent {
    // Static method in base class
    // which will be hidden in subclass
    static void m1()
    {
        System.out.println("From parent "
                           + "static m1()");
    }
  
    // Non-static method which will
    // be overridden in derived class
    void m2()
    {
        System.out.println("From parent "
                           + "non-static(instance) m2()");
    }
}
  
class Child extends Parent {
    // This method hides m1() in Parent
    static void m1()
    {
        System.out.println("From child static m1()");
    }
  
    // This method overrides m2() in Parent
    @Override
    public void m2()
    {
        System.out.println("From child "
                           + "non-static(instance) m2()");
    }
}
  
// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Child();
  
        // As per overriding rules this
        // should call to class Child static
        // overridden method. Since static
        // method can not be overridden, it
        // calls Parent's m1()
        obj1.m1();
  
        // Here overriding works
        // and Child's m2() is called
        obj1.m2();
    }
}
````
**OUTPUT**
>
> From parent static m1()
> 
>From child non-static(instance) m2()


### 4. Private methods can not be overridden : Private methods cannot be overridden as they are bonded during compile time. Therefore we can’t even override private methods in a subclass.

If we try to create overriden methods in child class they will also act as class specific methods

### 5. The overriding method must have same return type (or subtype): 

From Java 5.0 onwards it is possible to have different return type for a overriding method in child class, but child’s return type should be sub-type of parent’s return type. This phenomena is known as **covariant return type.**

### 6. Invoking overridden method from sub-class : 

We can call parent class method in overriding method using **super keyword.**

````
// A Java program to demonstrate that overridden
// method can be called from sub-class
  
// Base Class
class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
  
// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}
  
// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj = new Child();
        obj.show();
    }
}
````
**OUTPUT**

>
> Parent's show()
> 
> Child's show()

### 7. Overriding and constructor : 
**We can not override constructor as parent and child** class can never have constructor with same name(Constructor name must always be same as Class name).

But it is a property of java that in case of inhertience Paren'ts constructor is always called before child class constructor. And if you want to make a call to parent class constructor use **super()**

### 8. Overriding and Exception-Handling : 

Overriding can also take place even if the overriden methods throws exception but there are some rules to it which are listed below:

**RULE 1:** If the super-class overridden method does not throw an exception, subclass overriding method can only throws the unchecked exception, throwing checked exception will lead to compile-time error.

````
/* Java program to demonstrate overriding when 
  superclass method does not declare an exception
*/
  
class Parent {
    void m1()
    {
        System.out.println("From parent m1()");
    }
  
    void m2()
    {
        System.out.println("From parent  m2()");
    }
}
  
class Child extends Parent {
    @Override
    // no issue while throwing unchecked exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child m1()");
    }
  
    @Override
    // compile-time error
    // issue while throwing checked exception
    void m2() throws Exception
    {
        System.out.println("From child m2");
    }
}
````
**OUTPUT**
>
> error: m2() in Child cannot override m2() in Parent
>void m2() throws Exception{ System.out.println("From child m2");}
>^
>overridden method does not throw Exception

**RULE 2:** If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.

````
// Java program to demonstrate overriding when
// superclass method does declare an exception
  
class Parent {
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}
  
class Child1 extends Parent {
    @Override
    // no issue while throwing same exception
    void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }
}
class Child2 extends Parent {
    @Override
    // no issue while throwing subclass exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child2 m1()");
    }
}
class Child3 extends Parent {
    @Override
    // no issue while not throwing any exception
    void m1()
    {
        System.out.println("From child3 m1()");
    }
}
class Child4 extends Parent {
    @Override
    // compile-time error
    // issue while throwing parent exception
    void m1() throws Exception
    {
        System.out.println("From child4 m1()");
    }
}
````

**OUTPUT**

>error: m1() in Child4 cannot override m1() in Parent
void m1() throws Exception
^
overridden method does not throw Exception
> 

## Constructor Inheritence

There is no such concept of constructor inheritance in Java. Java by default use **super()** to refer to the constructor of parent class.

### Some examples to understand super()

**Definition :** 
- The **super()** is a function which is used to call the constructor of immediate parent class.
- super and super() are different and used differently.
- Java by default applies super() in the constructor of chile class to refer or call the constructor of parent class.
- **If you are explicitly refering to parent class constructor the super() should be the first function in the child class constructor**

**Example 1: Default calling of Parent class constructor**

````
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
````

**OUTPUT:**
>Parent Class
> 
>Child B1
> 
>Child C1
>
> Explaination : Here you see the compiler internally by default calling the constructors of immediate parent class. This is happening because internally java compiler have added super() keyword in each child class constructor.


**Example 2 : What happens when we create parameterized constructor and don't make a call from child**

````
package oopsBasicConcepts.superFunction;

public class A {
    A(int a) {
        System.out.println("A" + a);
    }
}

class B extends A {
    B(int a) {    // Here we will get error : There is no default constructor available in 'oopsBasicConcepts.superFunction.A'
        System.out.println("B" + a);
    }
}

class C extends B {
    C(int a) {   // Here we will get error : There is no default constructor available in 'oopsBasicConcepts.superFunction.B'
        System.out.println("C" + a);
    }
}

class Demo {
    public static void main(String[] args) {
        C obj = new C(10);
    }
}
````
**OUTPUT**
> Error because compiler by default creates a constructor only if you are not creating one but here parameterized constructor is created which is not explicitly called and compiler will by default apply super() to call default constructor of parent which is also absent hence we will get error.

**Solution to above issue**

````
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

````
**OUTPUT**
>A10
>B10
>C10

## Abstraction

Abstraction is the way by which we can show only neccessary details and hide the implementation from the end user.

###Some Important points about Abstraction.

- If a method is Abstract then class must be declared abstract.
- Abstract methods cannot be private, static or final because in all these cases method gets restricted by some or the other way and hence it cannot be used in other class for implementation
- Abstract class can never be final. (Neither private or Static but woh toh class waise bhi nhi ho sakti)
- We can have an abstract class even without any single abstract method
- Abstract class can never be instantiated
- Abstract class can have constructors which can be called from child class explicitly using super() or by JVM 
- Abstract is basically aimed to provide generalization like :
````
public abstract class Vehicle{

public abstract void hasSpeed();
public abstract void hasWheels();
}

Now we can create a child class and child class can be bike, truk etc which can give implementation to generalized methods as per their behaviour.
````

**Example:**

````
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

    // Abstract methods cannot be private
//    private abstract void m4();


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

````

**OUTPUT:**
````
I am abstract class constructor
I am abstract m1 from child class
---------------------------------
I am abstract class constructor
I am abstract m1 from child class
I am m2 which is non-abstract from Parent
I am m3 which is non-abstract but overided from child
````

**Questions:**
````
1. Can we use super and this together?
Ans : No, because both needs to be the first statement in constructor.

2. Can we create constructors in Abstract class?
Ans : Yes we can but it will not be called from current class as Abstract class cannot be instantiated and hence it's constructor will be invoked from child class constructor when the object of child class will be created.

3. Can we have an Abstract class without even a single abstract method in it?
Ans : Yes, an abstract class without a single abstract method is possible but it can not be instantiated in this case too but can have constructors.

4. Why we cannot create objects in Abstract class?
Ans: An abstract class is a class which doesnt have an implementation for one or more methods. It means that the jvm doesnt have any direction of what to do in case if someone calls the method which is abstract. So if you are able to create an object for the abstract class and call any abstract method of it the jvm will not be able to decide what to do and hence it my be crashed. So to avoid this situation we are restricted to instantiate a abstract class. If you need a object for that abstract class create a concrete subclass and create an object for it and use it.

5. Suppose, there is an abstract class but without any abstract method. Can we instantiate it now?
Ans: No, still it cannot be instantiated.

6. Identify the problem in below code snippet.

a) private class Ambuj{} : Class can never be Private
b) public static class Ambuj{} : Class can never be static.
c) public final class Ambuj{} : This is right
d) public abstract final Ambuj{} : Class can be either final or abstract because if abstract class is made final then it won't get extended further and without extending abstract class nothing can be done on it.

7. In Java-8 interface can have default and static methods along with abstract method then how they are different from abstract class?
Ans : There are multiple reasons few of them are:

a) With interface one can achieve multiple inheritence but with abstract class it is not possible.
b) In abstract class you can have constructor which you can use to initialize the global variables through child class but in interface you cannot do it.

8. Can abstract class have private static methods?
Ans : It depends on situation:

a) **If method is abstract then it cannot be private static** because it will be part of the same class then how we can give body to it.
b) **If method is concrete then yes it can be private and static both**

9. What is the difference between isAlphabet and isLetter?
Ans : Both the methods are of Character class. 

The Unicode character '\u2164' when passed to the isLetter() method returns false. On the other hand, when passed to the isAlphabetic() method, it returns true. The unicode is for V which is 5 in roman and V in English.

10. What is Java String?
Ans: String is a sequence of character.

Note: Why sequence and not group because in group there is no pattern but in sequence there is some pattern.

11. How to print Ascii value in Java?
Ans : The best and most simple way is to store the Character as Int type and then print it. It will print all the Ascii values.

Eg:

public class PrintingAsciiValues {
    public static void main(String[] args) {
        String s = "Ambuj";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println("Ascii Value of " + c[i] + " is " + (int) (c[i])); // 1st Way of printing by typeCasting char array elements to int type
        }
        for (int i : c) {
            System.out.println(i); // 2nd Way of printing
        }
    }
}


// Output :

Ascii Value of A is 65
Ascii Value of m is 109
Ascii Value of b is 98
Ascii Value of u is 117
Ascii Value of j is 106
65
109
98
117
106

12. How to convert int to string?
Ans : String.valuOf(int number);

13. How to convert Integer to int?
Ans : int a = Integer.valueOf(Integer number);

````
