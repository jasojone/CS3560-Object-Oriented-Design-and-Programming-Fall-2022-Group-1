// Vehicle class is an abstract class for all vehicles.

abstract class Vehicle {
}

// Car class is a class that extends Vehicle class.

class Car extends Vehicle {

    // assemble method is a method that assembles the car.
    public void assembleCar() {
        System.out.println("Assemble Car");
    }

    // produce method is a method that produces the car.
    public void produceCar() {
        System.out.println("Produce Car");
    }

}

// Bike class is a class that extends Vehicle class.
class Bike extends Vehicle {

    // assemble method is a method that assembles the bike.
    public void assembleBike() {
        System.out.println("Assemble Bike");
    }

    // produce method is a method that produces the bike.
    public void produceBike() {
        System.out.println("Produce Bike");
    }
}

// if Boat was added

// Boat class
class Boat extends Vehicle {

    public void assembleBoat() {
        System.out.println("Assemble Boat");
    }

    public void produceBoat() {
        System.out.println("Produce Boat");
    }

}

// App class is a class that contains main method.
public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Car car = new Car();
        car.produceCar();
        car.assembleCar();
        Vehicle vehicle2 = new Bike();
        Bike bike = new Bike();
        bike.produceBike();
    }
}
