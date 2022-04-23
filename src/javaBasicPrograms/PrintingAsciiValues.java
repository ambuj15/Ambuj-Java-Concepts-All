package javaBasicPrograms;

public class PrintingAsciiValues {
    public static void main(String[] args) {
        String s = "Ambuj";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println("Ascii Value of " + c[i] + " is " + (int) (c[i])); // 1st Way of printing by typeCasting char array elements to int type
        }
        for (int i : c) {
            System.out.println(i); // 2nd Way of printing
        }
    }
}
