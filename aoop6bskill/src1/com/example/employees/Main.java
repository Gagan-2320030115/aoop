package com.example.employees;

public class Main {
	public static void main(String[] args) {
        GenericList<Employee> employeeList = new GenericList<>();

        employeeList.addItem(new Employee(1, "Alice", 75000));
        employeeList.addItem(new Employee(2, "Bob", 50000));
        employeeList.addItem(new Employee(3, "Charlie", 60000));

        System.out.println("Original List:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        employeeList.sortByNaturalOrder();
        System.out.println("\nSorted by ID:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        employeeList.sortByComparator(new EmployeeNameComparator());
        System.out.println("\nSorted by Name:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        employeeList.sortByComparator(new EmployeeSalaryComparator());
        System.out.println("\nSorted by Salary:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        System.out.println("\nCloned Employee:");
        Employee cloned = employeeList.cloneItem(employeeList.iterator().next());
        System.out.println(cloned);
    }
}
