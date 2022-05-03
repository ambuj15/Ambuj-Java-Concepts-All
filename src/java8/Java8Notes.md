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