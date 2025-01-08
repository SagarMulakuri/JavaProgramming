package TrainingArithmetic;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 10;
		float y= 0.0012f;
		char z= 'A';
		String str = "Java Programming";
		/* Conversions- 
		 char = %c
		 int = d,o,x
		 float  = f,e,g;
		 String = s 
		*/
		System.out.printf("%1$d %1$d %1$d",x);
		System.out.printf("%1$d %2$f %1$d",x,y);
		System.out.printf("%3$s %2$f %1$d",x,y,str);
	}

}
