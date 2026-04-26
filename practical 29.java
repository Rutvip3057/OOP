import java.util.ArrayList;
import java.util.Collections;

public class MarksList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(68);
        marks.add(90);
        marks.add(77);

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}