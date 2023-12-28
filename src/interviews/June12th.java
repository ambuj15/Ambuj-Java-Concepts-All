package interviews;

import java.util.Arrays;

public class June12th {

    public static void main(String[] args) {
        char temp;
        String s = "AmbujGoyal";
        String []s1 = s.split("");
        System.out.println(Arrays.toString(s1));
        char [] c = s.toCharArray();
        for(int i = 0; i<c.length;i++){
            for(int j = i+1; j<c.length; j++){
                if(c[i]>c[j]){
                    temp = c[i];
                    c[i]=c[j];
                    c[j]= temp;
                }
            }
        }
        System.out.println(c);
    }
}
