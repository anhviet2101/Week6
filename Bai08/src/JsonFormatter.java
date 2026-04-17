public class JsonFormatter implements ReportFormatter{
    @Override
    public String format(Report report) {
        return "\n" + "Title: " + report.getTitle() +
                "\nContent: \n" + report.getContent();
    }
}
