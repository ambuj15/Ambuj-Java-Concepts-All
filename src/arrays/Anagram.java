package arrays;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";

        char c[] = s1.toCharArray();
        char c1[] = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        if (Arrays.equals(c, c1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

