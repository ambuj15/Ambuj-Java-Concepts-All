package javaBasicPrograms;

public class Hilti2 {
    public static void main(String[] args) {
        int sumLeft = 0;
        int sumRight = 0;
        int index  = 0;
        int[] a = {3, 4, 2, 1, 5, 7, 3};

//        if (a.length >= 3) {
            for (int i = 1; i < a.length; i++) {
                sumLeft = 0;
                sumRight = 0;
                for(int j = 0; j<i; j++){
                    sumLeft = sumLeft + a[j];
                }
                for(int k = i+1; k<a.length; k++){
                    sumRight = sumRight + a[k];
                }
                if(sumLeft==sumRight){
                    index = i;
                }
            }
            System.out.println(index);
//        }
    }
}
