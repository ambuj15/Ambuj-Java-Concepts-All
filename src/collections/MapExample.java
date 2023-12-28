package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Employee emp1=new Employee("Martin",27);
        Map<Employee,String> hm=new HashMap();
        hm.put(emp1, "Verified");
        emp1.setName("John");
        System.out.println(hm.get(emp1));
    }

}

class Employee{
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String toString(String name){
        return "Name :" + name;
    }
}
