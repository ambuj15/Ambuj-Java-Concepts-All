package javaBasicPrograms;

public class NumberPallindrome {
    public static void main(String[] args) {
        if (isNumberPallindrome(221)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }

    private static boolean isNumberPallindrome(int n) {
        int sum = 0; int temp=n;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n = n / 10;
        }
        if (sum == temp) {
            return true;
        } else
            return false;
    }
}
