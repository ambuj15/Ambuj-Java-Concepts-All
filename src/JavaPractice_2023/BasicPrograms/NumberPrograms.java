package JavaPractice_2023.BasicPrograms;

public class NumberPrograms {
    public static void main(String[] args) {
//        factorialOfNumber(5);
        pallindromNumber(223);
    }

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
}
