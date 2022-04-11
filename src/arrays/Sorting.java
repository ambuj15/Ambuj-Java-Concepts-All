package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

    public static void main(String[] args) {
        int[] a = {0, 7, -1, 6, 2, 5, 4};
        sortUsingSingleLoop(a);
    }

    private static void sortUsingSingleLoop(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
