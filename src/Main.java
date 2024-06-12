public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2021);
        car.setDoors(4);
        car.setFuelType("Petrol");

        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2020);
        motorcycle.setWheels(2);
        motorcycle.setType("Sport");

        Truck truck = new Truck("Ford", "F-150", 2019);
        truck.setCargoCapacity(3);
        truck.setTransmissionType("Automatic");

        System.out.println("Car details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Doors: " + car.getDoors());
        System.out.println("Fuel type: " + car.getFuelType());

        System.out.println("\nMotorcycle details:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Wheels: " + motorcycle.getWheels());
        System.out.println("Type: " + motorcycle.getType());

        System.out.println("\nTruck details:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Cargo capacity: " + truck.getCargoCapacity() + " tons");
        System.out.println("Transmission type: " + truck.getTransmissionType());
    }
}
