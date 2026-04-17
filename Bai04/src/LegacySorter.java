import java.util.Arrays;

public class LegacySorter {
    public int[] quickSort(int[] arr){
        System.out.println("Running sort from previous lib");
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}
