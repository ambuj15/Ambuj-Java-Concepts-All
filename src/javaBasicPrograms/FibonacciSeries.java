package javaBasicPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st and 2nd number for Fibonacci series");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        System.out.print(n1 + "," + n2);
        for (int i = 1; i < 10; i++) {
            sum = n1 + n2;
            System.out.print(",");
            System.out.print(sum);
            n1= n2;
            n2= sum;
        }

    }

}
