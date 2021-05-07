package pr6.method;

public class WindowsFactoryMethodClass extends FactoryMethodClass{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
