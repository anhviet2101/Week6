public class Main{
    public static void main(String[] args) {
        Report myReport = new Report("Assignment", "Installed an IDE");
        System.out.println("Json Formating");
        ReportFormatter jsonFormatter = new JsonFormatter();
        ReportService jsonService = new ReportService(jsonFormatter);
        System.out.println(jsonService.export(myReport));

        System.out.println("\nXML formating");
        ReportFormatter xmlFormater = new XMLFormatter();
        ReportService xmlService = new ReportService(xmlFormater);
        System.out.println(xmlService.export(myReport));
    }
}