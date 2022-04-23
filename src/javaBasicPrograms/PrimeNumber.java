package javaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for prime");
        isPrime(sc.nextInt());

    }

    private static void isPrime(int n) {
        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("Not Prime");
        } else System.out.println("Prime");
    }
}
