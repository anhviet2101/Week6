public class MacFactory implements UIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
