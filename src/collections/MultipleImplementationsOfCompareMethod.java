package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class MultipleImplementationsOfCompareMethod {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new myComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);

    }


}

class myComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        // As Integer class has compareToMethod, hence we are directly calling it here to perform sorting the way we want.

//        // 1. DNSO
        return i1.compareTo(i2);
//        //Output: [0, 5, 10, 15, 20]

//        // 2. Descending Order
//        return -i1.compareTo(i2);
        //Output: [20, 15, 10, 5, 0]

//        // 3. Descending Order other way
//        return i2.compareTo(i1);
//        Output : [20, 15, 10, 5, 0]


////        4. Ascending Order
//        return -i2.compareTo(i1);
//        Output : [0, 5, 10, 15, 20]

////        5. Preserving Insertion Order : We are telling JVM to always return +1 no matter what the result are hence it will allow duplicates too
//        return +1;
//          Output :[10, 0, 15, 5, 20, 20]


////        6. Preserving Insertion Order in Reverse Order: We are telling JVM to always return +1 no matter what the result are hence it will allow duplicates too
//        return -1;
//        //Output : [20, 20, 5, 15, 0, 10]

//        7. Only allowing 1 element into the Tree Set . As 0 is returned whenever two objects are equal/duplicates and as TreeSet doesn't allow duplicates therefore only 1st element will get added
//                return 0;
//        Output: [10]
    }
}
