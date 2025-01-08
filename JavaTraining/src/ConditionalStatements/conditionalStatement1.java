package ConditionalStatements;

import java.util.Scanner;

public class conditionalStatement1 {

	/* Find number is even or Odd
	 * public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		 if (n%2==0) {
			 System.out.println("Even Number");
		 }
		 else {
			 System.out.println("Odd Number");
		 }
	}
	*/
	
	/* Find Person is Young or not Young
	14-55
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Age");
			int age= sc.nextInt();
			 if (age>=14&& age<=55) {
				 System.out.println("You are Young");
			 }
			 else {
				 System.out.println("You are Not Young");
			 }
	  }
	*/
	  
	//Find Grades for given Marks
		//14-55
		  public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
				System.out.println("Enter Your Maths Marks");
				float marks01= sc.nextFloat();
				System.out.println("Enter Your Science Marks");
				float marks02= sc.nextFloat();
				System.out.println("Enter Your Bio Marks");
				float marks03= sc.nextFloat();
				
				float avg,sum;
				
				sum = marks01+marks02+marks03;
				avg = sum/3;
	
				
				 if (avg>=70) {
					 System.out.println("You Got Distinction");
				 }
				 else if(avg>=60 && avg<=70){
					 System.out.println("You got first class");
				 }
				 
				 else if(avg>=50 && avg<=60){
					 System.out.println("You got Second  class");
				 }
				 
				 else if(avg>=40 && avg<=50){
					 System.out.println("You got passed");
				 }
				 
				 else {
					 System.out.println("You got Failed");
				 }
		  }

}
