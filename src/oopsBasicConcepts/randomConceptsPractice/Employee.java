package oopsBasicConcepts.randomConceptsPractice;
// This is the process of checking whether we can call static members of the class using object instance or not?

import org.w3c.dom.ls.LSOutput;

public class Employee {
    public static String companyName = "TCS";
    public String employeeName;
    public int salary;

    public void putValues(String name, int sal) {
        employeeName = name;
        salary = sal;
    }

    public void printValues() {
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Company :" + companyName);
        System.out.println("Salary : " + salary);
    }

    public void companyChange(String changedCompanyName) {
        companyName = changedCompanyName;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Calling company name static variable via instance variable " + e.companyName);
        System.out.println("Calling company name static variable via class name " + Employee.companyName);
        e.putValues("Ambuj",3500000);
        e.companyChange("IBM");
        e.printValues();

    }

}
