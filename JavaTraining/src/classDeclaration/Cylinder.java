package classDeclaration;

class Cylinder1{
	public double radius;
	public double height;
	
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea() {
		return 2*lidArea()+circumference()*height;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double volume() {
		return lidArea()*height;
	}
}

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder1 c1= new Cylinder1();
		c1.radius=7;
		c1.height=10;
		
		System.out.println("lid Area :"+c1.lidArea());
		System.out.println("Total area :"+c1.totalSurfaceArea());
		System.out.println("volume :"+c1.volume());
		
	}

}
