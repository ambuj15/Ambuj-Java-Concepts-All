package oopsBasicConcepts.constructor;

public class PassingClassReferenceInConstructor {
    int a, b, c;

    public PassingClassReferenceInConstructor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PassingClassReferenceInConstructor(PassingClassReferenceInConstructor object1) {
        a = object1.a;
        b = object1.b;
        c = object1.c;
    }

    public static void main(String[] args) {
        PassingClassReferenceInConstructor p = new PassingClassReferenceInConstructor(10,20,30);
        PassingClassReferenceInConstructor p1 = new PassingClassReferenceInConstructor(p);
        System.out.println(p1.a + p1.b + p1.c);
    }
}
