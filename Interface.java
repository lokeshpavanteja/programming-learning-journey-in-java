interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Interface{
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}