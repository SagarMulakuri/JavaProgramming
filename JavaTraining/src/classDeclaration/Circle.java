package classDeclaration;

class Circle1 {
	 public double radius;
	 
	 public double area() {
		 return Math.PI*radius*radius;
	 }
	 
	 public double perimeter() {
		 return 2*Math.PI*radius*radius;
	 }

	 public double circumperance() {
		 return perimeter();	 } 
}
	 
public class Circle { 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle1 c1= new Circle1();
		
		c1.radius=7;
		System.out.println("Area :"+c1.area());
		System.out.println("perimeter :"+c1.perimeter());
		System.out.println("circumperance :"+c1.circumperance());

	}

}
