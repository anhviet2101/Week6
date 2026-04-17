public class Main {
    public static void main(String[] args) {
        System.out.println("Email App");
        NotificationApp emailApp = new EmailApp();
        emailApp.notifyUser("You have a new email");

        System.out.println("\nSMS app");
        NotificationApp smsApp = new SmsApp();
        smsApp.notifyUser("You have a new sms");
    }
}
