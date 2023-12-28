package oopsBasicConcepts;

public class ReverseStringUsingRecurssion {
    public static String s = "AmbujGoyal";
    public static int i = s.length()-1;

    public static void main(String[] args) {
        String rev = "";
        if(i>=0) {
            rev = rev + s.charAt(i);
            System.out.print(rev);
        }
            i = i - 1;
        if(i>=0){
            main(null);}


    }
}
