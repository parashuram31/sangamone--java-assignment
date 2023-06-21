package AssignmentOnOOPs;

public class Assignment18 {
	public static void main(String[] args) {
		Rectangle4 rectangle=new Rectangle4(6,8);
		Circle4 circle=new Circle4(8);
		Triangle4 triangle=new Triangle4(8,5,2,4);
		
		    System.out.println("Rectangle Area: " + rectangle.calculateArea());
		    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	}
}

abstract class Shape4{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Rectangle4 extends Shape4{
	double length;
	double width;
	public Rectangle4(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double calculateArea() {
		return length*width;
	}

	double calculatePerimeter() {
		
		return 2*(length+width);
	}	
}

class Circle4 extends Shape4{
	double radius;
	
	public Circle4(double radius) {
		this.radius=radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
	}

	double calculatePerimeter() {
		
		return 2*Math.PI*radius;
	}	
}

class Triangle4 extends Shape4{
	double base;
	double height;
	double side1;
	double side2;
	public Triangle4(double base, double height, double side1, double side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	double calculateArea() {
		return 0.5*base*height;
	}

	double calculatePerimeter() {
		
		return side1+base+side2;
	}	
}