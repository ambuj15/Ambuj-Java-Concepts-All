package javaBasicPrograms;

import java.util.Locale;
import java.util.Scanner;

public class CapitalizeFirstLetterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string whose first letter you want to capitalize");
//        capitalizeUsingBasic(sc.nextLine());
        capitalizeUsingStringManipulation(sc.nextLine());

    }

    private static void capitalizeUsingBasic(String input) {
        String output = "";
        String[] a1 = input.split("[ ]");
        for (int i = 0; i < a1.length; i++) {
            output = a1[i].substring(0, 1).toUpperCase() + a1[i].substring(1) + " ";
            System.out.print(output.trim());
        }

    }

    private static void capitalizeUsingStringManipulation(String s) {
        String[] arr = s.split("[ ]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
