package AssignmentOnOOPs;

	abstract class Shape {
	    public abstract double calculateArea();
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;
	    
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    
	    public double calculateArea() {
	        return length * width;
	    }
	}

	class Circle extends Shape {
	    private double radius;
	    private final double PI = 3.14159;
	    
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public double calculateArea() {
	        return PI * radius * radius;
	    }
	}

	class Triangle extends Shape {
	    private double base;
	    private double height;
	    
	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }
	    
	    public double calculateArea() {
	        return 0.5 * base * height;
	    }
	}
	
	public class Assignment9 {
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 3);
	        double rectangleArea = rectangle.calculateArea();
	        System.out.println("Rectangle area: " + rectangleArea);

	        Circle circle = new Circle(4);
	        double circleArea = circle.calculateArea();
	        System.out.println("Circle area: " + circleArea);

	        Triangle triangle = new Triangle(6, 8);
	        double triangleArea = triangle.calculateArea();
	        System.out.println("Triangle area: " + triangleArea);
	    }
	}



