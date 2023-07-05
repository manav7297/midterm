package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();

        System.out.println("Enter the arithmetic operation to perform: ");
        String operationString = sc.next();

        Operation operation = Operation.valueOf(operationString.toUpperCase());

        ArithmeticBase calculator = new ArithmeticBase();
        double result = calculator.calculate(x, y, operation);

        System.out.println("Result: " + result);
    }
    public double x, y;

    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    public double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }


}
