public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        boolean check = (log1 == log2);
        System.out.println("Logger instances equal: " + check);

        log1.logInfo("Application started");
        log1.logInfo("Processing data...");
        log2.logError("Something went wrong");
    }
}
