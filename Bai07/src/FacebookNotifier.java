public class FacebookNotifier extends NotifierDecorator{
    public FacebookNotifier(Notifier wrap){
        super(wrap);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        this.sendFB(msg);
    }

    private void sendFB(String msg){
        System.out.println("Facebook sent: " + msg);
    }

}
