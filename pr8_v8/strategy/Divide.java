package pr8_v8.strategy;

public class Divide implements Strategy{
    @Override
    public double operation(double num1, double num2) {
        return num1 / num2;
    }
}
