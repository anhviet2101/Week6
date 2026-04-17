public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier wrap){
        super(wrap);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        this.sendSMS(msg);
    }

    private void sendSMS(String msg){
        System.out.println("SMS sent: " + msg);
    }
}
