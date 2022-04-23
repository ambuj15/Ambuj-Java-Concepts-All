package javaBasicPrograms;

public class NumberFactorial {
    private static int fact = 1;

    public static void main(String[] args) {
//        factorial(5);
        factByRecurssion(6);

    }

    private static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
        return fact;
    }

    private static int factByRecurssion(int n) {
        if (n > 1) {
            fact = fact * n;
            factByRecurssion(n - 1);
        }
        if (n == 1) {
            System.out.println(fact);
        }
        return fact;
    }
}
