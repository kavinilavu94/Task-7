package task6;
import java.util.List;
import java.util.ArrayList;

public class ListToArray{
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Convert list to array
        String[] array = list.toArray(new String[0]);

        // Print the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}


