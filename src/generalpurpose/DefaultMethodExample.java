package generalpurpose;
interface Vehicle {
    default public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {
     // Car gets 'start()' method by default
	/*public void start() {
        System.out.println("Car is starting...");
    }*/
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls default method
    }
}