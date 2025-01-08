package NestedLoops;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				count++;
//				System.out.print(count+" ");
				System.out.format("%02d ",count);				
			}
			System.out.println(" ");		
		}
	}
//Output with System.out.print(count+" ");
//1  
//2 3  
//4 5 6  
//7 8 9 10  
//11 12 13 14 15 
	
//Output with System.out.format("%02d ",count);	
//	01  
//	02 03  
//	04 05 06  
//	07 08 09 10  
//	11 12 13 14 15
}
