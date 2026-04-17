import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Checking Singleton");
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        log1.print("Hello");
        boolean check = (log2 == log1);
        System.out.println("Log1 and log2 is the same: " + check + "\n");

        System.out.println("Checking Factory Method");
        ExportFactory pdfFactory = new PdfExportFactory();
        ExportFactory excelFactory = new ExcelExportFactory();

        Export pdf = pdfFactory.createExport();
        Export excel = excelFactory.createExport();

        pdf.exportData();
        excel.exportData();

        System.out.println("\nChecking Adapter");
        Player filePlayer = new PlayerAdapter();
        filePlayer.play("Song");

        System.out.println("\nChecking Prototype");
        List<String> logHistory = new ArrayList<>();
        logHistory.add("First");
        logHistory.add("Second");

        Config original = new Config("Origin", logHistory);
        Config copy1 = original.clone();
        copy1.setName("clone");
        copy1.addLogHistory("Third");

        System.out.println(original);
        System.out.println(copy1);



    }
}
