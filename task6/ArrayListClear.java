package task6;
import java.util.ArrayList;

public class ArrayListClear{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Display contents before clearing
        System.out.println("ArrayList before clearing: " + names);

        // Remove all elements from the ArrayList
        names.clear();

        // Display contents after clearing
        System.out.println("ArrayList after clearing: " + names);
    }
}
