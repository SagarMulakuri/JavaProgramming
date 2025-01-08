package constructor;

class Circle
{
	 private double radius;
	 
	 private double height;
	 
	 public double getRadius() {
		 return radius;
	 }
	 
	 public double getHeight() {
		 return height;
	 }
	 
	 public void setHeight(double h) {
		 if(h>=0) {
			 height=h;
			}
			else {
				height =0;
			}	
	 }
	 
	 public void setRadius(double r) {
		 if(r>=0) {
			 radius=r;
			}
			else {
				radius = 0;
			}
		}

		public Circle() {
			radius = 1;
			height = 1;
		}

		public Circle(double r, double h) {
			radius = r;
			height = h;
		}

		public Circle(double s) {
			radius = height = s;
		}
		
		 public double area() {
			 return Math.PI*radius*radius;
		 }
		 
		 public double perimeter() {
			 return 2*Math.PI*radius*radius;
		 }

		 public double circumperance() {
			 return perimeter();	 } 

	}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		
		Circle c1 = new Circle(12,8);
		
		Circle c2 = new Circle(10);
		
		System.out.println("Area "+ c1.area());
	}

}
