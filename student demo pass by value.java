class StudentDemo {
    int marks;

    StudentDemo(int marks) {
        this.marks = marks;
    }
}

public class PassByValueDemo {

    static void change(int x, StudentDemo s) {
        x = 100;
        s.marks = 95;
        s = new StudentDemo(50);
    }

    public static void main(String[] args) {

        int n = 20;
        StudentDemo st = new StudentDemo(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}
