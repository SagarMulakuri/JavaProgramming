package twoDimentionaArray;

public class DeclarationOf2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]= new int [5][5];
		
		int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
		
		int C[][];
		C= new int[5][5];
		
		int []D[]= new int [5][5];
		
		int[] E,F[];
//		int[] integer type array
//		int [] F[] Mean 2d array
		E= new int[5];
		F= new int[5][5];
		
		for (int i=0;i<B.length;i++) {
			for (int j=0;j<B[0].length;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println("");
		}
//		O/P= 1 2 3 
//			 2 4 6 
//			 1 3 5
		
		for(int x[]:B) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
//		O/P= 1 2 3 
//		 2 4 6 
//		 1 3 5
		
		System.out.println(B);
//		[[I@4d405ef7 >> [[ 2d array
		
//		Jagged Array
		int M[][];
		M= new int[3][];
		M[0]= new int[5];
		M[1]= new int[3];
		M[2]= new int[8];
		//for loop
		for (int i=0;i<M.length;i++) {
			for (int j=0;j<M[i].length;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println("");
		}
//		O/P=
//				0 0 0 0 0 
//				0 0 0 
//				0 0 0 0 0 0 0 0 
		//For each
		for(int x[]:M) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
//		O/P=
//		0 0 0 0 0 
//		0 0 0 
//		0 0 0 0 0 0 0 0 
	}

}
