// Vehicle class is an abstract class for all vehicles.

abstract class Vehicle {
    abstract public void manufacture();
}

// Car class is a class that extends Vehicle class.

class Car extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car");
    }
    // assemble method is a method that assembles the car.
    public void assemble() {
        System.out.println("Assembled");
    }
    // produce method is a method that produces the car.
    public void produce() {
        System.out.println("Produced");
    }

}

// Bike class is a class that extends Vehicle class.
class Bike extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Bike");
    }
    // assemble method is a method that assembles the bike.
    public void assemble() {
        System.out.println("Assembled");
    }
    // produce method is a method that produces the bike.
    public void produce() {
        System.out.println("Produced");
    }
}

// App class is a class that contains main method.
public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        vehicle1.manufacture();
        Car car = new Car();
        car.produce();
        car.assemble();
        Vehicle vehicle2 = new Bike();
        vehicle2.manufacture();
        Bike bike = new Bike();
        bike.produce();
    }
}
    