package methodOverloading;

public class Demo {
	
	static int max(int x,int y) {
		return x>y?x:y;
	}
	
	static float max(float x,float y) {
		if (x>y)
		return x;
		else
		return y;	
	}
	
	static int max(int x,int y,int z) {
		return x>y?x:y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(max(10,15));
     System.out.println(max(100.3f,153.4f));
     System.out.println(max(100.3f,153.4f));
	}

}
