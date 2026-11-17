public class Employee {

    int employeeId;
    String name;
    double basicSalary;

    // Parent class constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    // Calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    // Permanent Employee subclass
    static class PermanentEmployee extends Employee {

        double allowance;
        double bonus;

        PermanentEmployee(int employeeId, String name,
                          double basicSalary,
                          double allowance, double bonus) {

            super(employeeId, name, basicSalary);
            this.allowance = allowance;
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return basicSalary + allowance + bonus;
        }
    }

    // Contract Employee subclass
    static class ContractEmployee extends Employee {

        int hoursWorked;
        double hourlyRate;

        ContractEmployee(int employeeId, String name,
                         double basicSalary,
                         int hoursWorked, double hourlyRate) {

            super(employeeId, name, basicSalary);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Creating Employee array
        Employee[] employees = {
                new PermanentEmployee(101, "Rahul",
                        30000, 5000, 3000),

                new ContractEmployee(102, "Priya",
                        20000, 100, 200)
        };

        // Display details and calculate salary
        for (int i = 0; i < employees.length; i++) {

            System.out.println("\n----- Employee Details -----");

            employees[i].displayDetails();

            System.out.println("Calculated Salary: "
                    + employees[i].calculateSalary());
        }
    }
}
