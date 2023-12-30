package JavaPractice_2023.BasicPrograms;

public class SnippetsForDifferentOutputs {
    public static void main(String[] args) {
        outputQuestion1();
        outputQuestion2();
        outputQuestion3();
    }

    private static void outputQuestion1() {
        System.out.println('A' + 'B' + 'C'); // Output will be sum of ASCII values
    }

    private static void outputQuestion2() {
        System.out.println('A'); // Output will be A
    }

    private static void outputQuestion3() {
        System.out.println('A' + 1); // Output will be 66 (65 + 1)
    }
}
