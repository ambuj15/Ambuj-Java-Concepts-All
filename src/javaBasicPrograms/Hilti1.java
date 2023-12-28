package javaBasicPrograms;

import java.util.HashMap;

public class Hilti1 {
    public static void main(String[] args) {
        String s = "aaabbcaacccbbb";
        // Expected output =
        int i = 0;
        char [] c = s.toCharArray();
        int count1 = 0;
        StringBuilder sb = new StringBuilder();

        for(int j = 0 ; j<s.length(); j++){
            if(s.charAt(i)=='a'){
                count1 ++;
            }
            sb.append(count1).append(s.charAt(i));
        }
        System.out.println(sb.toString());

//        HashMap<Integer, Character> hm = new HashMap<>();
//        for(char val : c){
//            if(hm.containsValue(val)){
//                i = hm.put(++i,val);
//            }
//        }
//        for(Integer val1 : hm.keySet()){
//            System.out.println(val1 + hm.get(val1));
//        }
    }
}
