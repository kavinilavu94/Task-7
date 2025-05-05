package task6;
import java.util.InputMismatchException;

import java.util.Scanner;



public class Division{

	

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        int numerator;

	        int denominator;

	        double result;



	        try {

	            System.out.print("Enter the numerator (integer): ");

	            numerator = scanner.nextInt();



	            System.out.print("Enter the denominator (integer): ");

	            denominator = scanner.nextInt();



	            if (denominator == 0) {

	                throw new ArithmeticException("Cannot divide by zero!");

	            }



	            result = (double) numerator / denominator;

	            System.out.println("Result of division: " + result);



	        } catch (InputMismatchException e) {

	            System.err.println("Error: Invalid input. Please enter integers only.");

	        } catch (ArithmeticException e) {

	            System.err.println("Error: " + e.getMessage());

	        } finally {

	            scanner.close();

	        }

	    }



}

