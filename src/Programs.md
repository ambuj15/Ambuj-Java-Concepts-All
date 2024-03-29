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

### 4. WAP to reverse the words in String at their location. (Example : I love India will become I evold aidnI)

````
private static void reverseAStringAtSameLocation(String s) { // I love India --> I evol aidnI
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(new StringBuilder(s.substring(prev, i)).reverse() + " "); // Till here we will get only "I evol"
                prev = i;
            }

        }
        sb.append(new StringBuilder(s.substring(prev)).reverse().toString().trim()); // Here we are appending I evol with aidnI
        System.out.println(sb);
    }

"sb" wala String builder is used for append operation only and append ke andar ek naya string builder object use kar rahe hai to perform reversal operations.
````
**Explaination** : We have created an empty String Builder and whenever we are finding any space in String we are taking substring from previous location which is zero initially to that space and then we are reversing it.
This will reverse till last space and we will store this in prev and now to print last word we will take substring from prev location and reverse it.

### 5. WAP to print Automorphic Numbers
**It is a number whose last digits are equivalent to the number. Eg : 5 (It's square is 25 hence 5 is equalt to 25%10), 25 it's square is 125 hence 25 is equalt to 125%100**
````
package javaBasicPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for Automorphic");
        isAutomorphic(sc.nextInt());

    }

    private static void isAutomorphic(int number) {
        int sqr = number * number;
        int i = 1;
        int temp = number;
        while (number > 0) {
            i = i * 10; // This will give us the value by which we need to divide the number finally
            number = number / 10;
        }
        if (sqr % i == temp) {
            System.out.println(temp + " is Automorphic");
        } else System.out.println(temp + " is not Automorphic");

    }
}

````

### 6. WAP to check whether the String is starting with character supplied by the user using JAVA-8
In this problem we have used Predicate to verify
````
public class CheckStringStartingCharacter {
    public static void main(String[] args) {
        String[] s = {"Ambuj", "Kusum", "Sanchi", "Apoorva", "Anil", "Guddi", "Shiv"};
        System.out.println("Enter the character you want to search in the String");
        Scanner sc = new Scanner(System.in);
        stringStartsWith(s, sc.next().charAt(0));
    }

    private static void stringStartsWith(String[] s1, char c) {
        Predicate<String> startsWith = s -> s.charAt(0) == c;
        System.out.println("The names starting with : " + c + " are ");
        for (String s : s1) {
            if (startsWith.test(s)) {
                System.out.println(s);
            }
        }
    }
}
````

### 7. WAP to remove all the null and empty values from the given String and print the new list usingh Java-8 Predicates

````
package java8.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullAndEmptyValues {
    public static void main(String[] args) {
        String names[] = {"Ambuj", "", null, "Goyal"};
        removeNullAndEmpty(names);
    }

    private static void removeNullAndEmpty(String[] s) {
        Predicate<String> p = s1 -> s1 != null && s1.length() != 0;  // Checking the condition here
        ArrayList<String> al = new ArrayList<>();
        for (String a : s) {
            if (p.test(a)) {
                al.add(a);
            }
        }
        System.out.println("The list without ull and EMoty values is :" + al);
    }

}

````

### 8. WAP to print the number as per the currencies of different regions.

**Sample Input**

>12324.134

**Sample Output**

>US: $12,324.13
> 
>India: Rs.12,324.13
> 
>China: ￥12,324.13
> 
>France: 12 324,13 €


````
package javaBasicPrograms;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatCurrencyAsPerDifferentRegions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        Locale indiaLoc = new Locale("en","IN"); // As India's Locale is not present we are creating it explicitly
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLoc);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

````


