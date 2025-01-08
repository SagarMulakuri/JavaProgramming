package dataHiding;

class Cylinder1{
	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		height=h;
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	
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

public class FindCircleProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cylinder1 c1= new Cylinder1();
			
			c1.setRadius(7);
			c1.setHeight(10);
			
			System.out.println("lid Area :"+c1.lidArea());
			System.out.println("Total area :"+c1.totalSurfaceArea());
			System.out.println("volume :"+c1.volume());
			
		}

}
