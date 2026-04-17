public class Main{
    public static void main(String[] args) {
        System.out.println("Send only by Email");
        Notifier defaultnotifier = new EmailNotifier();
        defaultnotifier.send("Hello");

        System.out.println("\nSend by Email and Facbook");
        Notifier mix1Notifier = new FacebookNotifier(defaultnotifier);
        mix1Notifier.send("Facebook and Email");

        System.out.println("\nSend by Email, Facebook and SMS");
        mix1Notifier = new SMSNotifier(mix1Notifier);
        mix1Notifier.send("SMS, FB and Email");
    }
}