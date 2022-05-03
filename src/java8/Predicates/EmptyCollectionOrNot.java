package java8.Predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class EmptyCollectionOrNot {
    public static void main(String[] args) {
        // Prdeicate to validate : Passed collection as input and cl is the parameter to test method of predicate
        Predicate<Collection> p = cl -> cl.isEmpty();

        // Creating a collection

        ArrayList<String> al = new ArrayList();
        al.add("Ambuj");

        // Validating whether al is Empty or not:
        System.out.println(p.test(al));
    }
}
