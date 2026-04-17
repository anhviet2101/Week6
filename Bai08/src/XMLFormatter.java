public class XMLFormatter implements ReportFormatter {
    @Override
    public String format(Report report) {
        return "<report>\n" + "\t<title>" + report.getTitle() +"</title>" +
                "\n\t<content>" + report.getContent() + "</content>" +"\n</report>";

    }
}
