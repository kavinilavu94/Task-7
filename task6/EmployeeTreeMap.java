package task6;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        // Create TreeMap to store employee ID and name
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee entries
        employeeMap.put(101, "Charlie");
        employeeMap.put(104, "Alice");
        employeeMap.put(102, "David");
        employeeMap.put(103, "Bob");

        // Extract names into a list
        List<String> employeeNames = new ArrayList<>(employeeMap.values());

        // Sort names alphabetically
        Collections.sort(employeeNames);

        // Print names
        System.out.println("Employee names in alphabetical order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
