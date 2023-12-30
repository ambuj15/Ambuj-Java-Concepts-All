package oopsBasicConcepts.staticConcept;

import java.util.Scanner;

public class StaticBlock1 {
    public static int x;

    static {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("First call " + StaticBlock1.x);
        System.out.println("Second call " + StaticBlock1.x);
    }
}
