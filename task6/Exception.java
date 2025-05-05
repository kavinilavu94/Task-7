package task6;
public class Exception{
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException Example
        int[] array = {1, 2, 3};
        try {
            System.out.println("Accessing invalid array index: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // StringIndexOutOfBoundsException Example
        String text = "Hello";
        try {
            System.out.println("Accessing invalid string index: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
