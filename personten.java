class PersonTen {
    protected String name; protected int age;
    PersonTen(String name, int age) {
        this.name = name; this.age = age;
        System.out.println("Person constructor");
    }
    void display() { System.out.println("Name: " + name + ", Age: " + age); }
}
class EmployeeTen extends PersonTen {
    protected int employeeId; protected double basicSalary;
    EmployeeTen(String name, int age, int id, double salary) {
        super(name, age);
        employeeId = id; basicSalary = salary;
        System.out.println("Employee constructor");
    }
    @Override void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId + ", Basic salary: " + basicSalary);
    }
}
class ManagerTen extends EmployeeTen {
    private String department; private double bonus;
    ManagerTen(String name, int age, int id, double salary, String department, double bonus) {
        super(name, age, id, salary);
        this.department = department; this.bonus = bonus;
        System.out.println("Manager constructor");
    }
    double totalSalary() { return basicSalary + bonus; }
    @Override void display() {
        super.display();
        System.out.println("Department: " + department + ", Bonus: " + bonus);
        System.out.println("Total salary: " + totalSalary());
    }
}
class Program10ManagerDemo {
    public static void main(String[] args) {
        ManagerTen m = new ManagerTen("Arjun", 35, 501, 60000, "Operations", 15000);
        m.display();
    }
}
