package FunWithProgramming;

public class MathematicalTable {
public static void main(String[] args) {
	int no1=3;
	int no2=20;
	
	for (int i=no1;i<=no2;i++) {
		for (int j=1;j<=10;j++) {
			int res=i*j;
			System.out.println(i+"*"+j+"= "+res+"    ");
		}
		System.out.println(" ");
	}
}
}
