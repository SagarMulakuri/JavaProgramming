package TrainingArithmetic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be validated:");
        String isPalindrome = sc.next();
        sc.close(); // Close the scanner to avoid resource leaks.

        boolean flag = true; // Assume the string is a palindrome.

        for (int i = 0; i < isPalindrome.length() / 2; i++) {
            if (isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length() - 1 - i)) {
                flag = false; // Not a palindrome.
                break;
            }
        }

        if (flag) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}

