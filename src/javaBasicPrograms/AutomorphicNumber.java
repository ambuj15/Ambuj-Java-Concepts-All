package javaBasicPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for Automorphic");
//        isAutomorphic(sc.nextInt());
        findAutomorphicNumber(sc.nextInt());

    }

//    private static void isAutomorphic(int number) {
//        int sqr = number * number;
//        int i = 1;
//        int temp = number;
//        while (number > 0) {
//            i = i * 10;
//            number = number / 10;
//        }
//        if (sqr % i == temp) {
//            System.out.println(temp + " is Automorphic");
//        } else System.out.println(temp + " is not Automorphic");
//
//    }

    private static void findAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;
        int i = 1;
        while (number > 0) {
            i = i * 10;
            number = number / 10;
        }
        if (square % i == temp) {
            System.out.println("Number " + temp + " is automorphic");
        } else {
            System.out.println("Number " + temp + " is not automorphic");
        }


    }

}
