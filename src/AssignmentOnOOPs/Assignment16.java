package AssignmentOnOOPs;


interface Playable {
    void play();
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Child extends Person implements Playable {
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with toys.");
    }
}

class Adult extends Person implements Playable {
    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing a sport.");
    }
}

public class Assignment16 {
		    public static void main(String[] args) {
	        Child child = new Child("Parashuram", 9);
	        Adult adult = new Adult("Prajwal", 27);

	        System.out.println("Child's details:");
	        System.out.println("Name: " + child.getName());
	        System.out.println("Age: " + child.getAge());
	        child.play();

	        System.out.println();

	        System.out.println("Adult's details:");
	        System.out.println("Name: " + adult.getName());
	        System.out.println("Age: " + adult.getAge());
	        adult.play();
	    }
	

}
