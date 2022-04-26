package javaBasicPrograms;

public class DecimalToBinary {

    public static void main(String[] args) {
        decimalToBinary(8);
    }

    private static int[] decimalToBinary(int number) {
        int rem[] = new int[25];
        int index = 0;
        while (number >= 1) {
            rem[index] = (number % 2);
            number = number / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(rem[i]);
        }
        return rem;
    }
}
