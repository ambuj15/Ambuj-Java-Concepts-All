package oopsBasicConcepts.constructor;

public class Test {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "BCDA";
        String emp = "";
        String emp2 = "";


        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();


        if(c1.length != c2.length){
            System.out.println("Strings cannot be circular");
        }
        else {
            for (int i = 0; i < c1.length-1; i++) {
                emp = emp + s1.charAt(i + 1);
                System.out.println("EMP is "+emp);

                emp2 = emp + s1.charAt(0);
                System.out.println("EMP 2 is "+emp2);

                if (emp2.equals(s2)) {
                    System.out.println("Circular");
                }

            }
            }
        }
    }

