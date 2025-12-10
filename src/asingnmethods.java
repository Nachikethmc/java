class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
}

class asignmethods {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double num1 = 50, num2 = 60;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("\n--- Results ---");
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}

