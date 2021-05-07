package pr8.v8.strategy;

public class Plus implements Strategy {
    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
