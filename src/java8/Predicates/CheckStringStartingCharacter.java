package java8.Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

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
