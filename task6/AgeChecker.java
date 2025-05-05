package task6;

import java.util.Scanner;



class InvalidAgeException extends Exception {

    /**

	 * 

	 */

	private static final long serialVersionUID = 1L;



	public InvalidAgeException(String message) {

        super(message);

    }

}



public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try {

            System.out.print("Enter your age: ");

            int age = scanner.nextInt();



            if (age < 18) {

                throw new InvalidAgeException("Age must be 18 or older.");

            } else {

                System.out.println("Age is valid.");

            }

        } catch (InvalidAgeException e) {

            System.err.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {

            System.err.println("Error: Invalid input. Please enter a number for age.");

        } finally {

            scanner.close();

        }

    }

}