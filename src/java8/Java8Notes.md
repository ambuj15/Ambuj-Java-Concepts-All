## Pre-Defined Functional Interfacesnby Java 1.8

### 1. Predicate (I)

- When we want to perform any **conditional check which returns boolean value then go for Predicates**
- Introduced in Java 1.8 version
- Present in Java.util.function package
- Contains only 1 single abstract method **test()** which returns **boolean value**
-  Test method takes only 1 argument.

**Example 1:** Check whether given number is greater than 10 or not

**a) Without Predicate:**
````
 public void check(int n){
 if(n>10){
return true
 }
else 
return false;
}
````

**b) With Predicate:**
````
 Predicate<Integer> p = i -> i > 10;           // Here we are giving body to the SAM of Predicate with condition to check whether number >10 or not
        return p.test(20);                // Here we are calling the implemented method
````

**Example 2:** Whether length of Given string is greater than 5 or not

````
public class LengthOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (lengthOfGivenStringGreaterThan5(sc.nextLine())) {
            System.out.println("Length of the given string is greater than 5");
        } else System.out.println("Length is not greater than 5");
    }

    private static boolean lengthOfGivenStringGreaterThan5(String s) {
        Predicate<String> p = input -> input.length() > 5;
        return p.test(s);
    }
}
````

**Example 3:** Whether Collection is empty or not

````
public class EmptyCollectionOrNot {
    public static void main(String[] args) {
        // Prdeicate to validate : Passed collection as input and cl is the parameter to test method of predicate
        Predicate<Collection> p = cl -> cl.isEmpty();

        // Creating a collection

        ArrayList<String> al = new ArrayList();
        al.add("Ambuj");

        // Validating whether al is Empty or not:
        System.out.println(p.test(al));
    }
}

````

#### Predicate Joining

There comes some situations when we want to join two or more predicates to perform some functional checks like : **A number is greater than 10 and even. This problem requires two conditional checks and hence predicate joining comes into picture**

There are some **default methods and not SAM (SAM is test() method only)** present inside Predicate interface.

P1 : Number is greater than 10

P2 : Number is even

1. **P1.negate() :** This is used if we want to negate the condition hence here it will return all numbers which doesn't satisfy P1.
2. **P1.and(P2) :** This will combine two conditions i.e. number greater than 10 and even.
3. **P1.or(P2) :** This will return the numbers which will satisfy either of the conditions.

**Example :**

````
public class PredicateJoiningExample {

    public static void main(String[] args) {
        int[] x = {1, 2, 8, 6, 9, 10, 25, 40, 22, 15};
        Predicate<Integer> p1 = i -> i > 10;             // Predicate to check whether number is greater than 10 or not
        Predicate<Integer> p2 = i -> i % 2 == 0;        // PREDICATE TO CHECK WHETHER NUMBER IS EVEN OR NOT

        System.out.println("Numbers greater than 10 are :");
        predicateJoining(p1, x);

        System.out.println("Only even number are");
        predicateJoining(p2, x);

        System.out.println("Number that are less than 10");
        predicateJoining(p1.negate(), x);

        System.out.println("Only odd numbers :");
        predicateJoining(p2.negate(), x);

        System.out.println("Even and greater than 10");
        predicateJoining(p1.and(p2), x);

        System.out.println("Either even or greater than 10");
        predicateJoining(p2.or(p1), x);
    }

    public static void predicateJoining(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1)) {                            // For all values of X1 check if it is satisfying the Predicate condition
                System.out.print(x1);
            }
        }
    }
}
````

**OUTPUT :**

````
Numbers greater than 10 are :
25
40
22
15
Only even number are
2
8
6
10
40
22
Number that are less than 10
1
2
8
6
9
10
Only odd numbers :
1
9
25
15
Even and greater than 10
40
22
Either even or greater than 10
2
8
6
10
25
40
22
15

````