package pr6.factory;

public class Test {
    public static void main(String[] args) {
        Factory windows = new WindowsFactory();
        Factory mac = new MacFactory();

        Button windowsButton = windows.createButton();
        Button macButton = mac.createButton();

        CheckBox windowsBox = windows.createCheckBox();
        CheckBox macBox = mac.createCheckBox();

        windowsButton.drawButton();
        macButton.drawButton();

        windowsBox.drawCheckBox();
        macBox.drawCheckBox();
    }
}