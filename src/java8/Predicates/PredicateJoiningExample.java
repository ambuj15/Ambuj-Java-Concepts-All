package java8.Predicates;

import java.util.function.Predicate;

public class PredicateJoiningExample {

    public static void main(String[] args) {
        int[] x = {1, 2, 8, 6, 9, 10, 25, 40, 22, 15};
        Predicate<Integer> p1 = i -> i > 10;             // Predicate to check whether number is greater than 10 or not
        Predicate<Integer> p2 = i -> i % 2 == 0;        // PREDICATE TO CHECK WHETHER NUMBER IS EVEN OR NOT

        System.out.println("Numbers greater than 10 are :");
        predicateJoining(p1, x);

        System.out.println("Only even number are");
        predicateJoining(p2, x);

        System.out.println("Number that are less than 10");
        predicateJoining(p1.negate(), x);

        System.out.println("Only odd numbers :");
        predicateJoining(p2.negate(), x);

        System.out.println("Even and greater than 10");
        predicateJoining(p1.and(p2), x);

        System.out.println("Either even or greater than 10");
        predicateJoining(p2.or(p1), x);
    }

    public static void predicateJoining(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1)) {                            // For all values of X1 check if it is satisfying the Predicate condition

                System.out.println(x1);

            }
        }
    }
}
