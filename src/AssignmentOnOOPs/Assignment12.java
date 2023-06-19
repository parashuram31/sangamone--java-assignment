package AssignmentOnOOPs;

abstract class Shape1 {
	public abstract void draw();	
}

class Circle2 extends Shape1 {
	public void draw() {
		System.out.println("Draw a Cicle");
	}	
}

class Rectangle3 extends Shape1 {
	public void draw() {
		System.out.println("Draw a Rectangle");
	}	
}

class Triangle2 extends Shape1 {
	public void draw() {
		System.out.println("Draw a Triangle");
	}
}

class Assignment12{
public static void main(String[] args) {
	Circle2 circle=new Circle2();
	Rectangle3 rectangle=new Rectangle3();
	Triangle2 triangle=new Triangle2();
	
	circle.draw();
	rectangle.draw();
	triangle.draw();
}
}