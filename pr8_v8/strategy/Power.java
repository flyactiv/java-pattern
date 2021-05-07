package pr8_v8.strategy;

public class Power implements Strategy {
    @Override
    public double operation(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
