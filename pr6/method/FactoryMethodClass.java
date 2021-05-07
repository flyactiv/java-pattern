package pr6.method;

public abstract class FactoryMethodClass {
    public void mainWork(){
        Button button = createButton();
        button.onClick();
    }

    public abstract Button createButton();
}
