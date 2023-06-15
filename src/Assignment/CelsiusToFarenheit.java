package Assignment;

import java.util.Scanner;

public class CelsiusToFarenheit {
public static void main(String[] args) {
	System.out.println("Enter cesius value");
	Scanner scanner=new Scanner(System.in);
	int c=scanner.nextInt();
	double farenheit=c*9/5+32;
	System.out.println(farenheit);
}
}
