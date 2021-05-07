package pr6.factory;

public class MacFactory implements Factory{
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
