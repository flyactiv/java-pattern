package pr6.method;

public class Test {
    public static void main(String[] args) {
        FactoryMethodClass windows = new WindowsFactoryMethodClass();
        FactoryMethodClass mac = new MacFactoryMethodClass();

        windows.mainWork();
        mac.mainWork();

    }
}
