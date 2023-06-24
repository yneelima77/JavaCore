package codingRoom;

import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        String[] employeeList = {"Harold Riddle production", "Luciano Zavala r&d"};

        Employee employee = new Employee();
        System.out.println(employee.addEmployees(employeeList));

    }
}
