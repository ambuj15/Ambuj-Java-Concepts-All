/*
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
*/
