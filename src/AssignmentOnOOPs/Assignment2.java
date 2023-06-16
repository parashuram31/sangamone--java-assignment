package AssignmentOnOOPs;

import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
	rectangle();
}
static void rectangle() {
	System.out.println("Enter w value");
	Scanner scanner=new Scanner(System.in);
	double w=scanner.nextDouble();
	
	System.out.println("Enter l value");
	Scanner scanner2=new Scanner(System.in);
	double l=scanner2.nextDouble();
	
	double res=w*l;
	System.out.println(res);
}
}
