## Java Programs All

#### 1. WAP to add two numbers without using any math operator.

````
package oopsBasicConcepts;

public class SumOfTwoNumbersWithoutUsingMathOperator {
    public static void main(String[] args) {
        sum(10, 15);
    }


    private static int sum(int a, int b) {
        for (int i = 1; i <= b; i++) {
            a++; // Here 1 will get added to 'a' for 'b' number of times
        }
        System.out.println(a);
        return a;
    }
}

````

#### 2. WAP to add two validate whether two arrays are Anagram or not.

````
package arrays;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";

        char c[] = s1.toCharArray();
        char c1[] = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        if (Arrays.equals(c, c1)) {  // Arrays. equals method is used to compare two arrays contents.
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}


````