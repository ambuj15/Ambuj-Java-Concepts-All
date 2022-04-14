package oopsBasicConcepts;

public class SumOfTwoNumbersWithoutUsingMathOperator {
    public static void main(String[] args) {
        sum(10, 15);
    }


    private static int sum(int a, int b) {
        for (int i = 1; i <= b; i++) {
            a++; // Here 1 will get added to 'a' for 'b' number of times
        }
        System.out.println(a);
        return a;
    }
}
