package oopsBasicConcepts.constructor;

public class ValueInitialization {
    int amount;

    public ValueInitialization(){
        amount = 1000;
    }
    public void print(){
        System.out.println(amount);
    }

    public static void main(String[] args) {
        ValueInitialization obj1 = new ValueInitialization();
        ValueInitialization obj2 = new ValueInitialization();
        obj2.print();
        obj1.print();
    }
}
