public class Main {
    public static void main(String[] args) {
        String os = "win";
        UIFactory factory;
        if (os.equalsIgnoreCase("mac")){
            factory = new MacFactory();
        } else if (os.equalsIgnoreCase("win")) {
            factory = new WindowsFactory();
        } else {
            System.out.println("Unsuitable os");
            return;
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
