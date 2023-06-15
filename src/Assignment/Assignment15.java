package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment15 {
public static void main(String[] args) {
	int arr[]=new int [5];
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	for (int i=0;i<5;i++) {
		
		arr[i]=scanner.nextInt();
	}
	Arrays.sort(arr);
	for (int i=0;i<5;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
