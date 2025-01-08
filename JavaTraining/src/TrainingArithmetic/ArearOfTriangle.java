package TrainingArithmetic;

import java.util.Scanner;

public class ArearOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float b = 0,h = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("get the base value");
		b = sc.nextFloat();
		System.out.println("get the Hight value");
		h = sc.nextFloat();
		float area= 1f/2f*(b*h);
		System.out.println("The the Area of the triangle is "+area);
		byDiffrentMethods();
				

	}
	
	public static void byDiffrentMethods() {
		Scanner sc01= new Scanner(System.in);
		int a = 0,b = 0, c=0;
		float s, areamethod2;
		System.out.println("get the all sides of the triangle value");
		a = sc01.nextInt();
		b = sc01.nextInt();
		c = sc01.nextInt();
		
		s= (a+b+c)/2f;
		areamethod2 =(float) Math.sqrt(s*(s-a)*s-(s-b)*(s-c));

		System.out.println("arear of triangle "+areamethod2 );
	}

}
