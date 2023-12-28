package JavaPractice_2023.BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReversal {
    public static void main(String[] args) {
        reversedString("I Am Ambuj Goyal");
        reversedPositionOfWords("I Am Ambuj Goyal");
        reverseWordsAtSameLocation("I Am Ambuj Goyal");
    }

    // 1. Reverse the full string. Eg : I Am Ambuj Goyal --> layoG jubmA mA I

    private static String reversedString(String stringToReverse) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringToReverse.length(); i++) {
            sb.append(stringToReverse.charAt(i));
        }
        String reversedString = sb.reverse().toString();
        System.out.println("The full reversed string is : " + reversedString);
        return reversedString;
    }

    // 2. Reverse the position of the words in string. Eg : I am Ambuj --> Ambuj am I

    private static String reversedPositionOfWords(String inputString) {
        String[] s1 = inputString.split(" ");
        String rev = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            rev = rev + s1[i] + " ";
        }
        System.out.println("The position of words of string is : " + rev.trim());
        return rev;
    }

    //3. Reverse the words of the string at their location only. Eg : I Love my India --> I evoL ym aidnI
    private static String reverseWordsAtSameLocation(String inputString) {
        StringBuilder sb = new StringBuilder();
        String finalString = "";
        for (int i = 0; i < inputString.length(); i++) {
            sb.append(inputString.charAt(i));
        }
        String[] reversed = sb.reverse().toString().split(" ");
        List<String> al = new ArrayList<>();
        al = Arrays.asList(reversed);
        List<String> finalAl = al;
        for (int i = reversed.length - 1; i >= 0; i--) {
            finalString = finalString + reversed[i] + " ";
        }
        System.out.println("String character reversed at same location : " + finalString.trim());

        return finalString;
    }
}
