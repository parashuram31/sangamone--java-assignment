package AssignmentOnOOPs;

 class Animal {
public void eat() {
	System.out.println("The animal is eating");
}
public void sleep() {
	System.out.println("The animal is sleeping");
}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("The dog is eating");
	}
	public void sleep() {
		System.out.println("The dog is sleeping");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("The cat is eating");
	}
	public void sleep() {
		System.out.println("The cat is sleeping");
	}
}

class Bird extends Animal {
	public void eat() {
		System.out.println("The bird is eating");
	}
	public void sleep() {
		System.out.println("The bird is sleeping");
	}
}

class Assignment10{
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.sleep();
		
		Cat cat=new Cat();
		cat.eat();
		cat.sleep();
		
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		}
}
