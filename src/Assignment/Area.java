package Assignment;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	System.out.println("Enter r value");
	Scanner scanner=new Scanner(System.in);
	int r=scanner.nextInt();
	final double pi=3.125;
	double res=pi*r*r;
	System.out.println(res);
	
}
}
