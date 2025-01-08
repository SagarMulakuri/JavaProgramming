package TrainingArithmetic;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n= sc.nextInt();
     int m= n;
     int rev=0;
     while(n>0) {
    	 int r= n%10;
    	 rev = rev*10+r;
    	 n=n/10;
    	 }
     if (rev==m) {
    	 System.out.println("Its a palindrome");
     }
     else {
    	 System.out.println("Its not a palindrome");
     }
	}

}
