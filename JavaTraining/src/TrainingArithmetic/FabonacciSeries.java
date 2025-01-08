package TrainingArithmetic;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for fabonacci series");
		System.out.println("Enter number of trems");
		int n = sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+","+b+",");
		for (int i=0;i<n-2;i++) {
			c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
		}
	}

}
