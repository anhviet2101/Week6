public abstract class NotificationApp {
    protected abstract Notification createNotification();
    public void notifyUser(String msg){
        Notification notification = createNotification();
        notification.send(msg);
    }
}
