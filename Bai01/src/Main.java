public class Main {
    public static void main(String[] args) {
        System.out.println("Checking multithreading");

        Runnable task = () -> {
            AppConfig config = AppConfig.getInstance();
            System.out.println("Thread: " + Thread.currentThread().getName() + " | HashCode: " + config.hashCode());
        };
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }
}
