package TrainingArithmetic;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int number = sc.nextInt();
        sc.close(); // Close the scanner.

        int originalNumber = number; // Store the original number.
        int reversedNumber = 0;

        // Reverse the number.
        while (number != 0) {
            int digit = number % 10; // Extract the last digit.
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber.
            number = number / 10; // Remove the last digit from number.
        }

        // Check if the original number is equal to the reversed number.
        if (originalNumber == reversedNumber) {
            System.out.println("The given number is a palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
