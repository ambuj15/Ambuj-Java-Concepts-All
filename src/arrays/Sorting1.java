package arrays;

import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {

        int arr[] = {1,0,1,0,0,0,1,1};

        for(int i =0 ;i<arr.length-1;i++)
        {
            int index1,index0;


            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] >= arr[j]) {
                    arr[i] = arr[j] + arr[i];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
