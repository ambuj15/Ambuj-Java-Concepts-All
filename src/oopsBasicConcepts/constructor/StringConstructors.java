package oopsBasicConcepts.constructor;

import java.util.Arrays;

public class StringConstructors {
    public static void main(String[] args) {
        String s = "Ambuj";
        System.out.println(s);

        char[] c = {'A', 'M', 'B', 'U', 'J'};
        for (int val : c) {
            System.out.println(val);
        }

        for (char c1 : c) {
            System.out.println(c1);
        }

        String s1 = new String(c);
        System.out.println(s1);

        String s2 = Arrays.toString(c);
        System.out.println(s2);

        String s3 = c.toString();
        System.out.println(s3);
    }
}
