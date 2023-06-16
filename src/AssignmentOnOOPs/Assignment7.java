package AssignmentOnOOPs;

public class Assignment7 {
private String name;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public static void main(String[] args) {
	Assignment7 persone=new Assignment7();
	persone.setName("Parashuram");
	persone.setAddress("Rjajinagar");
	
	System.out.println("Name = "+persone.getName());
	System.out.println("Address = "+persone.getAddress());
}
}
