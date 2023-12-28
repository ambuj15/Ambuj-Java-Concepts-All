package java8.Predicates;
// WAP to check whether software Engineer is allowed in Pub or not? The condition is that he should be atleast 18 years old and must be having a girlfriend

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SoftwareEngineersPub {
    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngineersPub(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String toString() {
        return "Name :" + name + " " + "Age: " + age;
    }
}

class Test {
    public static void main(String[] args) {
        List<SoftwareEngineersPub> se = Arrays.asList(new SoftwareEngineersPub("Ram", 17, true),
                new SoftwareEngineersPub("Shyam", 20, true),
                new SoftwareEngineersPub("Vindo", 26, false),
                new SoftwareEngineersPub("Ravi", 22, true));

        Predicate<SoftwareEngineersPub> predicate = data -> data.age >= 18 && data.isHavingGf == true;
        for (SoftwareEngineersPub data : se) {
            if (predicate.test(data)) {
                System.out.println(data.name + " you are allowed to party");
            } /*else System.out.println(data.name + " you doesn't fulfill the criteria");*/
        }
    }
}
