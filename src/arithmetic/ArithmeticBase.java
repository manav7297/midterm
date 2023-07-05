package arithmetic;

import static arithmetic.ArithmeticBase.Operation.DIVIDE;
import static arithmetic.ArithmeticBase.Operation.MINUS;
import static arithmetic.ArithmeticBase.Operation.PLUS;
import static arithmetic.ArithmeticBase.Operation.TIMES;

public class ArithmeticBase {
    public double x, y;
    private String operation;

    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    public double calculate(int x, int y) {
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
