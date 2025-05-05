package task6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("data.txt"); // Change to your filename if needed

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("File content:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure 'data.txt' exists.");
        }
    }
}
