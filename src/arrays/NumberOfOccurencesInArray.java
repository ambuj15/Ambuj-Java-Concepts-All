package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurencesInArray {

    public static void main(String[] args) {
//        numberOfOccurencesOfCharacterInString("MALAYALAM");
//        numberOfOccurencesOfWordInSentence("I am Ambuj.Ambuj is a good boy");
//        separatingOand1(new int[]{0, 1, 1, 0, 0, 1});
//        shiftPosition0to1(new int[]{1,0,1,0,0,0,1,1});
//        shiftPosition1to0(new int[]{1,0,1,0,0,0,1,1});


    }

    private static void numberOfOccurencesOfCharacterInString(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                int value = m.get(s.charAt(i));
                m.put(s.charAt(i), ++value);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        m.forEach((k, v) -> System.out.println("Character :" + k + " Occurence : " + v));
    }

    private static void numberOfOccurencesOfWordInSentence(String sentence) {
        String[] s1 = sentence.split("[ .\\s,]"); // To split on the basis of , you need to add "\\s," else it will not eliminate , form the strings
        System.out.println(Arrays.toString(s1));
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if (m.containsKey(s1[i])) {
                int value = m.get(s1[i]);
                m.put(s1[i], ++value);
            } else {
                m.put(s1[i], 1);
            }

        }
        m.forEach((k, v) -> System.out.println("Word : " + "\'" + k + "\'" + " is occuring " + v + " times"));
    }

    public static void separatingOand1(int[] a) {
//        for(int i =0; i<a.length;i++)
//        {
//            for (int j = i+1;j<a.length;j++)
//            {
//                if(a[i]>a[j])
//                {
//                    a[i]=a[i]+a[j];
//                    a[j]=a[i]-a[j];
//                    a[i]=a[i]-a[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i] = 0;//a[i] - 1;
                a[i + 1] = 1;//1a[i + 1] + 1;
                i = -1; // This will make the loop run from 0 always as in for loop when the value of i will be increased as i++ then -1 + 1 = 0
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static int[] shiftPosition0to1(int[] input) {
        if (input.length == 1) {
            return input;
        } else {
            int pos = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == 0) {
                    input[i] = input[pos];
                    input[pos] = 0;
                    pos = pos + 1;
                }
            }
            System.out.println(Arrays.toString(input));
            return input;
        }

    }

    private static int[] shiftPosition1to0(int[] input) {
        if (input.length == 1) {
            return input;
        } else {
            int pos = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == 1) {
                    input[i] = input[pos];
                    input[pos] = 1;
                    pos = pos + 1;
                }
            }
            System.out.println(Arrays.toString(input));
            return input;
        }

    }
}
