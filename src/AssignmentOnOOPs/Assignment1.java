package AssignmentOnOOPs;

import java.util.Scanner;

public class Assignment1 {
static void area() {
	System.out.println("Enter r value");
	Scanner scanner=new Scanner(System.in);
	int r=scanner.nextInt();
	final double pi=3.125;
	double res=pi*r*r;
	System.out.println(res);
}
public static void main(String[] args) {
	area();
}
}
