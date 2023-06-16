package AssignmentOnOOPs;

public class Assignment3 {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
	Assignment3 assignment3=new Assignment3();
	assignment3.setName("parashuram");
	assignment3.setAge(23);
	
	System.out.println("Name : "+assignment3.getName());
	System.out.println("Age  : "+assignment3.getAge());
	
}

}
