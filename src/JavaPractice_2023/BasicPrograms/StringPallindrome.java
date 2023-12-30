package JavaPractice_2023.BasicPrograms;

public class StringPallindrome {
    public static void main(String[] args) {
        pallindromeOfAStringUsingBasic("MALAYALAM");
        pallindromStringUsingBuilder("Ambuj");
        numberOfPallindromesInAWord("I am NITIN I know MALAYALAM");
    }

    private static void pallindromeOfAStringUsingBasic(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("Not a pallindrom");
        }
    }

    private static void pallindromStringUsingBuilder(String s) {
        String finalString = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb = sb.append(s.charAt(i));
        }
        finalString = sb.reverse().toString();
        if (finalString.equals(s)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not a pallindrome");
        }
    }

    private static void numberOfPallindromesInAWord(String word) {
        int count = 0;
        String[] s = word.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(reverseOfString(s[i]))) {
                count++;
            }
        }
        System.out.println("Number of pallindromes in the given word : " + count);
    }

    private static String reverseOfString(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }

}
