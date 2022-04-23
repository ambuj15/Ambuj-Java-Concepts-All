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

### 3. What will be the output of the following?

````
package oopsBasicConcepts.constructor;

public class StringConstructors {
    public static void main(String[] args) {
// 1
        String s = "Ambuj";
        System.out.println(s);

//2
        char [] c = {'A', 'M','B','U','J'};
        for(int val : c){
            System.out.println(val);
        }

//3
        for (char c1: c){
            System.out.println(c1);
        }

//4
        String s1 = new String(c);
        System.out.println(s1);
        
//5        
        String s2 = Arrays.toString(c);
        System.out.println(s2);
        
//6
        String s3 = c.toString();
        System.out.println(s3);
    }
}

````
**OUTPUT:**

````
1. This will be treated as normal String and output will be : Ambuj
2. In second we are using :

char [] c = {'A', 'M','B','U','J'};
        for(int val : c){
            System.out.println(val);
        }
        
As we are printing int values so here it will take ASCII values of all the Characters and not their location in case of advance for loop.

Therefor, output is

65
77
66
85
74

3. In third we are traversing a character and fetching the characters only and hence output will be :

A
M
B
U
J

4. In 4th we are passing character to string constructor which is one of the way to convert char array to string hence, output will be :
AMBUJ

5. Output will be : [A, M, B, U, J]

6. Output will be : [C@4617c264 (Hashcode)

````

