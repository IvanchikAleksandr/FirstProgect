package by.teachmeskills.lesson7.Interface;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Boss("Name1", "Surname1"),
                new Clerk("Name2", "Surname2"),
                (Employee) new Accountant("Name3", "Surname3")};
        getEmployeesJobTitles(employees);
    }

    private static void getEmployeesJobTitles(Employee[] employees) {
        for (Employee employee : employees) {
            employee.printJobTitle();
        }
    }
}

