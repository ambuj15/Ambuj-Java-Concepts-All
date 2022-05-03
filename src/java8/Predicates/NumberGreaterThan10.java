package java8.Predicates;

import java.util.function.Predicate;

public class NumberGreaterThan10 {

    public static void main(String[] args) {
        withoutPredicate(100);
        withPredicate(200);
    }

    private static boolean withoutPredicate(int number) {
        if (number > 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean withPredicate(int number) {
        Predicate<Integer> p = i -> i > 10; // Here we are giving body to the SAM of Predicate with condition to check whether number >10 or not
        return p.test(number); // Here we are calling the implemented method
    }
}
