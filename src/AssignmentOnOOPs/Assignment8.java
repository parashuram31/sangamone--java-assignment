package AssignmentOnOOPs;

public class Assignment8 {
private String title;
private String author;
private double price;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


public Assignment8(String title, String author, double price) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
}

public double discount(double discount) {
	double discountAmt=price * discount/100;
	double discountPrice=price-discountAmt;
	return discount;	
}

public static void main(String[] args) {
	Assignment8 book=new Assignment8("An Autobiography", "Jawaharlal Nehru", 1500.00);
	System.out.println("Book Title :- "+book.getTitle());
	System.out.println("Book Author - "+book.getAuthor());
	System.out.println("Book Price :- "+book.getPrice());
}

}
