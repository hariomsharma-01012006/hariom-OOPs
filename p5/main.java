
class ComplexNumber {
    double real;
    double imaginary;
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;

        return new ComplexNumber(r, i);
    }

    
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        ComplexNumber sum = c1.add(c2);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        System.out.print("Sum: ");
        sum.display();
    }
}
