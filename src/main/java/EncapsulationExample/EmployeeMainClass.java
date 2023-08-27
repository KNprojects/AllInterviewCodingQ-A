package main.java.EncapsulationExample;

public class EmployeeMainClass {

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("john");
        emp.setLocation("USA");
        System.out.println(emp.getName().toUpperCase());
    }
}
