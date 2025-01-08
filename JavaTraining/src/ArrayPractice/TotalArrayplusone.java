package ArrayPractice;

import java.util.Arrays;

public class TotalArrayplusone {

	public static int[] solution(int[] digits) {
		int n = digits.length;

		// Start from the last digit
		for (int i = n - 1; i >= 0; i--) {
			digits[i] = (digits[i] + 1) % 10; // Increment and handle carry using modulus
			if (digits[i] != 0) { // If no carry needed, return early
				return digits;
			}
		}

		// If we have carried over for all digits, create a new array
		int[] result = new int[n + 1];
		result[0] = 1; // The most significant digit is 1, others are 0
		return result;
	}
	
	 public static void main(String[] args) {
	        // Test cases
	        int[] digits1 = {1, 2, 3};
	        int[] digits2 = {1, 2, 9};
	        int[] digits3 = {9, 9, 9};
	        
	        System.out.println(Arrays.toString(solution(digits1))); // Output: [1, 2, 4]
	        System.out.println(Arrays.toString(solution(digits2))); // Output: [1, 3, 0]
	        System.out.println(Arrays.toString(solution(digits3))); // Output: [1, 0, 0, 0]

	 }

}
