package java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInAnArray {
    public static void main(String[] args) {
        Integer a[] = {1,3,4,2,4,5,6,8,1,4,6};
//        duplicateValuesInArray(a);
        removeDuplicatesFromArray(a);

    }


    private static void duplicateValuesInArray(Integer [] a){
        List<Integer> al = Arrays.asList(a);
        al.stream().filter(i->Collections.frequency(al, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }

    private static void removeDuplicatesFromArray(Integer [] a){
        List<Integer> al = Arrays.asList(a);
        al.stream().distinct().forEach(System.out::println);
    }
}
