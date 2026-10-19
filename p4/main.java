
class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


class Employee {
    double calculatePay() {
        return 0.0;
    }
}


class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 50000.0; 
    }
}


class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 20000.0; 
    }
}

public class Main {
    public static void main(String[] args) {

        
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(10, 20));
        System.out.println("Add three integers: " + calc.add(10, 20, 30));
        System.out.println("Add two doubles: " + calc.add(10.5, 20.5));
        
        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full-time pay: " + emp.calculatePay());

        emp = new PartTimeEmployee();
        System.out.println("Part-time pay: " + emp.calculatePay());
    }
}
