class Complex {
    double real;
    double imaginary;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        Complex temp = new Complex(0, 0);
        temp.real = real + c.real;
        temp.imaginary = imaginary + c.imaginary;
        return temp;
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        Complex temp = new Complex(0, 0);
        temp.real = (real * c.real) - (imaginary * c.imaginary);
        temp.imaginary = (real * c.imaginary) + (imaginary * c.real);
        return temp;
    }

    // Method to compare magnitudes
    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First complex number has greater magnitude.");
        else if (m1 < m2)
            System.out.println("Second complex number has greater magnitude.");
        else
            System.out.println("Both complex numbers have equal magnitude.");
    }

    // Method to copy an object
    Complex copy() {
        return new Complex(real, imaginary);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Addition
        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();

        // Multiplication
        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        // Compare magnitude
        System.out.println("Magnitude Comparison:");
        c1.compareMagnitude(c2);

        // Copy object
        Complex c3 = c1.copy();
        System.out.print("Copied Object: ");
        c3.display();

        // Modify original object
        c1.real = 10;
        c1.imaginary = 20;

        System.out.print("Modified First Object: ");
        c1.display();

        System.out.print("Copied Object After Modification: ");
        c3.display();
    }
}
