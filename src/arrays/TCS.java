package arrays;

import java.util.Arrays;

public class TCS {

    public static void main(String[] args) {
        int a[] = {1, 2, 7, -1, 0, 6, -5};
        smallestNumberUsingSorting(a);
        minMaxUsingOneLoop(a);
    }

    private static void smallestNumberUsingSorting(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

    private static void minMaxUsingOneLoop(int[] a) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
