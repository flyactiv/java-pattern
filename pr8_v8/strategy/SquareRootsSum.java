package pr8_v8.strategy;

public class SquareRootsSum implements Strategy {
    @Override
    public double operation(double num1, double num2) {
        return Math.sqrt(num1) + Math.sqrt(num2);
    }
}
