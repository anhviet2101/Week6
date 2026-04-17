import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("4.a:");
        int[] numbers = {5,2,3,7,4,8,1};
        System.out.println("Original array: " + Arrays.toString(numbers));

        Sorter sorter = new SorterAdapter();
        int[] result = sorter.sort(numbers);
        System.out.println("Result array: " + Arrays.toString(result));

        System.out.println("\n4.b:");
        List<String> sections = new ArrayList<>();
        sections.add("Part1: Introduction");
        sections.add("Part2: Body");
        sections.add("Part3: Conclusion");

        ReportTemplate original = new ReportTemplate("Report", "Thanks", sections);

        ReportTemplate report1 = original.clone();
        report1.setTitle("Report1");

        ReportTemplate report2 = original.clone();
        report2.setTitle("Report2");

        original.printReport();
        System.out.println();
        report1.printReport();
        System.out.println();
        report2.printReport();
    }
}
