import java.util.LinkedList;

public class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in roll numbers: " + searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Search 'Alice' in names: " + searchElement(names, "Alice"));
        System.out.println("Search 'David' in names: " + searchElement(names, "David"));
    }
}