package AssignmentOnOOPs;

	abstract class Vehicle {
	    public abstract void start();
	    public abstract void stop();
	}

	class Car extends Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Car started.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Car stopped.");
	    }
	}

	class Motorcycle extends Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Motorcycle started.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Motorcycle stopped.");
	    }
	}

	class Truck extends Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Truck started.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Truck stopped.");
	    }
	}

	public class Assignment13 {
	    public static void main(String[] args) {
	        Vehicle car = new Car();
	        Vehicle motorcycle = new Motorcycle();
	        Vehicle truck = new Truck();

	        car.start();
	        car.stop();

	        motorcycle.start();
	        motorcycle.stop();

	        truck.start();
	        truck.stop();
	    }
	}


