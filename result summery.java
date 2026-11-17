class ResultSummary {
    private String usn;
    private String name;
    private int total;
    private double average;

    ResultSummary(String usn, String name, int total, double average) {
        this.usn = usn;
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void displaySummary() {
        System.out.println("\n----- RESULT SUMMARY -----");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

class Student {

    // Private fields
    private String usn;
    private String name;
    private int marks1, marks2, marks3;

    // Final variable
    private final int MAX_MARKS = 100;

    // Static variable
    static int studentCount = 0;

    // Constructor
    Student(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        if (validateMarks(m1) && validateMarks(m2)
                && validateMarks(m3)) {
            marks1 = m1;
            marks2 = m2;
            marks3 = m3;
            studentCount++;
        } else {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100");
        }
    }

    // Validation method
    private boolean validateMarks(int marks) {
        return marks >= 0 && marks <= MAX_MARKS;
    }

    // Getter methods
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    // Calculate total
    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Calculate average
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display basic details
    public void display() {
        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    // Overloaded display method
    public void display(boolean showResult) {
        display();

        if (showResult) {
            System.out.println("Subject 1 Marks: " + marks1);
            System.out.println("Subject 2 Marks: " + marks2);
            System.out.println("Subject 3 Marks: " + marks3);
            System.out.println("Total: " + calculateTotal());
            System.out.println("Average: " + calculateAverage());
        }
    }

    // Return a new object containing result summary
    public ResultSummary getResultSummary() {
        return new ResultSummary(
                usn, name, calculateTotal(), calculateAverage());
    }

    // Main method
    public static void main(String[] args) {

        Student s1 = new Student(
                "4CB24DS001", "Rahul", 85, 90, 80);

        Student s2 = new Student(
                "4CB24DS002", "Priya", 75, 88, 92);

        // Display basic details
        s1.display();

        // Display complete result
        s1.display(true);

        s2.display(true);

        // Result summary objects
        ResultSummary r1 = s1.getResultSummary();
        ResultSummary r2 = s2.getResultSummary();

        r1.displaySummary();
        r2.displaySummary();

        // Display student count
        System.out.println("\nTotal Students Created: "
                + Student.studentCount);
    }
}
