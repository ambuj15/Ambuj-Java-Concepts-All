package JavaPractice_2023.BasicPrograms;

public class PrintPrograms {
    public static void main(String[] args) {
        printABC();
        printABCInSmallCase();
        printaBcDeF();
        printAbCdEf();
    }

    private static void printABC() {
        System.out.println("abc in capital case : ");
        for (int i = 65; i < 91; i++) {
            System.out.print((char) i + " ");
        }
    }

    private static void printABCInSmallCase() {
        System.out.println("\nabc in small case : ");
        for (int i = 97; i < 123; i++) {
            System.out.print((char) i + " ");
        }
        System.out.print("\n");
    }

    private static void printaBcDeF() {
        System.out.println("Printing aBcDe");
        int count = 0;
        for (int i = 97; i < 123; i += 2) {                             // This will run a loop to print a,c,e,g
            for (int j = i - 31; j < 91; j += 2) {                      // This will run a loop to print B,D,F. i-31 is the constant difference(97-66 = 31, 99-68 = 31, 101-70 = 31)
                System.out.print((char) i + "," + (char) j + ",");
                count++;
                if (count > 0) {
                    break;
                }

            }
        }
        System.out.print("\n");
    }

    private static void printAbCdEf() {
        System.out.println("Printing AbCdE");
        int count = 0;
        for (int i = 65; i < 91; i += 2) {                             // This will run a loop to print A,C,E,G
            for (int j = i + 33; j < 123; j += 2) {                      // This will run a loop to print b,d,f. i+33 is the constant difference(98-65 = 33, 100-67 = 33)
                System.out.print((char) i + "," + (char) j + ",");
                count++;
                if (count > 0) {
                    break;
                }

            }
        }
    }
}
