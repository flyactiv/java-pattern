package pr8_v8.strategy;

public class Operation {
    private Strategy strategy;

    public Operation(Strategy strategy) {
        this.strategy = strategy;
    }

    public double chooseOperation(double num1, double num2){
        return strategy.operation(num1, num2);
    }
}
