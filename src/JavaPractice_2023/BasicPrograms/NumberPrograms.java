package JavaPractice_2023.BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorialOfNumber(5);
        pallindromNumber(223);
        fibonacciSeries(10, 20, 10);
        primeNumber(sc.nextInt());
        armstrongNumber(sc.nextInt());
        automorphicNumber(sc.nextInt());
        numberOfPrimeWithingRange(5, 13);
        sc.close();
    }

//  1. Number factorial
    private static int factorialOfNumber(int number) {
        int rev = 1;
        int temp = number;
        while (number > 0) {
            rev = rev * number;
            number = number - 1;
        }
        System.out.println("Factorial of " + temp + " is " + rev);
        return rev;
    }

//  2. Pallindrome number
    private static int pallindromNumber(int number) {
        int temp = number;
        int sum = 0;
        int rem = 0;
        while (number > 0) {
            rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is pallindrome");
        } else {
            System.out.println("Number " + temp + " is not pallindrome");
        }
        return sum;
    }

//  3. Fibonacci series
    private static void fibonacciSeries(int firstInput, int secondInput, int limit) {
        int temp = 0;
        System.out.print(firstInput + "," + secondInput + ",");
        for (int i = 0; i <= limit; i++) {
            temp = firstInput + secondInput;
            firstInput = secondInput;
            secondInput = temp;
            System.out.print(temp + ",");
        }
    }

//  4. Prime Number
    private static void primeNumber(int number) {
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Number " + number + " is not a prime number");
        } else System.out.println("Number " + number + " is a prime number");
    }

//  5. Armstrong Number
    private static void armstrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (number > 0) {
            int rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
    }

//  6. Automorphic Number
    private static void automorphicNumber(int number) {
        int sq = number * number;
        System.out.println("The square of " + number + " is :" + sq);
        int temp = number;
        int i = 1;
        while (number > 0) {
            i = i * 10;
            number = number / 10;
        }
        if (temp == (sq % i)) {
            System.out.println(temp + " is Automorphic");
        } else System.out.println(temp + " is not automorphic");
    }

//  8. Number of prime numbers in a specific range
    private static void numberOfPrimeWithingRange(int startingRange, int endingRange) {
        int count = 0;
        List<Integer> al = new ArrayList<>();
        for (int i = startingRange + 1; i < endingRange; i++) {
            if (isPrime(i)) {
                al.add(i);
                ++count;
            }
        }
        System.out.println("The prime numbers between" + startingRange + " and " + endingRange + ":" + count);
        for (int a1 : al
        ) {
            System.out.println(a1);
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

