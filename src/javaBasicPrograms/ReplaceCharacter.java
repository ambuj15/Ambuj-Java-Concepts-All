package javaBasicPrograms;
// Input = "Tomorrow"  Output Required: T$m$$rr$$$w
public class ReplaceCharacter {
    public static void main(String[] args) {
        int count=0;
        String s = "Tomorrow";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i<s.length();i++){
            if(s.charAt(i)=='o'){
                count++;
                
            }
        }
    }
}
