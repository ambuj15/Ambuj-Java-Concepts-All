package javaBasicPrograms;

import java.util.Scanner;

public class StringAndStringBuilderBasics {
    public static void main(String[] args) {
        System.out.println("Enter the input string , the character you want to replace and the new character");
        Scanner sc = new Scanner(System.in);
        replaceCharacterInAGivenString(sc.nextLine(), sc.next().charAt(0), sc.next().charAt(0));
        System.out.println("*****************************************************************");
        System.out.println("Enter String that needs to be reversed");
        reverseAStringAtSameLocation(sc.nextLine());

    }

    private static void replaceCharacterInAGivenString(String s, char toBeReplaced, char toBeReplacedWith) {
        System.out.println("Input String is :" + s);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == toBeReplaced) {
                sb.setCharAt(i, toBeReplacedWith);
            }
        }
        System.out.println(sb);
    }

    private static void reverseAStringAtSameLocation(String s) { // I love India --> I evol aidnI
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(new StringBuilder(s.substring(prev, i)).reverse() + " "); // Till here we will get only "I evol"
                prev = i;
            }

        }
        sb.append(new StringBuilder(s.substring(prev)).reverse().toString().trim()); // Here we are appending I evol with aidnI
        System.out.println(sb);
    }
}
