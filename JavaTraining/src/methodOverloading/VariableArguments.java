package methodOverloading;

public class VariableArguments {

	static void show(int ...A) {
	
		for (int x:A) {
			System.out.println(x);
		}
	}
	
	static void showList(String ...s) {
		
		for (int i=0;i<s.length;i++) {
			System.out.println(i+1+". "+s[i]);
		}
	}
	
   static void showList(int start, String ...s) {
		
		for (int i=0;i<s.length;i++) {
			System.out.println(start+". "+s[i]);
			start++;
		}
	}
   
//   static void showList( String ...s,int start) {The variable argument type String of the method showList must be the last parameter
//		
//		for (int i=0;i<s.length;i++) {
//			System.out.println(start+". "+s[i]);
//			start++;
//		}
//	}
	
//   public static void main(String [] args) { possible
//   }
//   public static void main(String  ...args) { Possible
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show();
		show(10,20,30);
		show(new int[] {3,4,5,6,7,8,9,});
		
		showList("john","Smith","Ajay","Ahmed","Mark","Suresh");
		
		showList(5,"john","Smith","Ajay","Ahmed","Mark","Suresh");
	}

}
