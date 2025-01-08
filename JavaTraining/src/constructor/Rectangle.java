package constructor;

class RectangleClass
{
	private double length;
	
	private double breadth;
	
	public RectangleClass() {
		length=1;
		breadth=1;
	}
	
	public RectangleClass(double l, double b) {
		length=l;
		breadth=b;
	}
	
	public RectangleClass(double s) {
		length = breadth =s;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setLength(double l) {
		if(l>=0) {
			length=l;
		}
		else {
			length =0;
		}	
	}
	
	public void setBreadth(double b) {
		if(b>=0) {
			breadth=b;
		}
		else {
			breadth =0;
		}
	}
	
	public double area() {
		return getLength()*getBreadth();
	}
	
	public double perimeter() {
		return 2*(getLength()*getBreadth());
	}
	
	public boolean isSquare() {
		if (length == breadth) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RectangleClass r = new RectangleClass();
		
		RectangleClass r1 = new RectangleClass(12,8);
		
		RectangleClass r2 = new RectangleClass(10);
		
		System.out.println("Area "+ r.area());
	}

}
