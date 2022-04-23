package javaBasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check for armstrong");
        Scanner sc = new Scanner(System.in);
        if (isArmstrong(sc.nextInt())) {
            System.out.println("Armstrong");
        } else System.out.println("Not Armstrong");
    }

    private static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }
}
