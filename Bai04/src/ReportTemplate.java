import java.util.ArrayList;
import java.util.List;

public class ReportTemplate implements Cloneable {
    private String title;
    private String footer;
    private List<String> sections;

    public ReportTemplate(String title, String footer, List<String> sections) {
        this.title = title;
        this.footer = footer;
        this.sections = new ArrayList<>(sections);

    }
    @Override
    public ReportTemplate clone() {
        try {
            ReportTemplate cloned = (ReportTemplate) super.clone();
            cloned.sections = new ArrayList<>(this.sections);

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class does not support clone method");
        }
    }
    public void printReport(){
        System.out.println("\t" + title);
        for (String section: sections){
            System.out.println(section);
        }
        System.out.println("\t" + footer);
    }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getFooter() { return footer; }
    public void setFooter(String footer) { this.footer = footer; }

    public List<String> getSections() { return sections; }
    public void setSections(List<String> sections) { this.sections = sections; }

}
