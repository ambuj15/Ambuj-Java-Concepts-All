package java8.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullAndEmptyValues {
    public static void main(String[] args) {
        String names[] = {"Ambuj", "", null, "Goyal"};
        removeNullAndEmpty(names);
    }

    private static void removeNullAndEmpty(String[] s) {
        Predicate<String> p = s1 -> s1 != null && s1.length() != 0;
        ArrayList<String> al = new ArrayList<>();
        for (String a : s) {
            if (p.test(a)) {
                al.add(a);
            }
        }
        System.out.println("The list without ull and EMoty values is :" + al);
    }

}
