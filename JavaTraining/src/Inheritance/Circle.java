package Inheritance;

public class Circle {
	 public double radius;
	
	 public double area() {
		 return Math.PI*radius*radius;
	 }
	 
	 public double perimeter() {
		 return 2*Math.PI*radius*radius;
	 }

	 public double circumperance() {
		 return perimeter();	 }
	 
	 
	 public static void main(String arge[]) {
		 Cylinder c=new Cylinder();
		 c.radius =7;
		 c.height=10;
		 
		 System.out.println("Volume: "+c.volume());
		 System.out.println("Area: "+c.area());
	 }

}

class Cylinder extends Circle{
	public double height;
	
	public double volume() {
		return area()*height;
	}
}
