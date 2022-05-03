package java8.Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class LengthOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (lengthOfGivenStringGreaterThan5(sc.nextLine())) {
            System.out.println("Length of the given string is greater than 5");
        } else System.out.println("Length is not greater than 5");
    }

    private static boolean lengthOfGivenStringGreaterThan5(String s) {
        Predicate<String> p = input -> input.length() > 5;
        return p.test(s);
    }
}
