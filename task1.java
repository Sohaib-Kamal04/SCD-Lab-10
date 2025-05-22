package lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        }

        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception caught: " + e);
        }

        try {
            int age = 15;
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}

