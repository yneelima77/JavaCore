package codingRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Employee {
    //add fields
    String firstName, lastName, department;

    // add constructor
    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    // Do not change
    public Employee() {
    }
    public static ArrayList<Employee> addEmployees(String[] array) {
        ArrayList<Employee> employees = new ArrayList<>();
       /* employees.add(new Employee("Herold", "Riddle", "Production"));
        employees.add(new Employee("Luciano", "Zavala", "r&d"));*/
        /*for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }*/
        for (String emparray : array) {
            String[] empdetails = emparray.split(" ");
            String firstName = empdetails[0];
            String lastName = empdetails[1];
            String department = empdetails[2];
            //Employee employee = new Employee(firstName, lastName, department);
            employees.add(new Employee(firstName, lastName, department));

        }
       // add code
        return employees;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + department;

    }
    /// Do not change
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }

}
