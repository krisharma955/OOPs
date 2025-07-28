package AdvanceOOPs;

public class interfaceInheritance {
    interface Vehicle {
        public void start();
        default void honk() {
            System.out.println("Vehicle Honking");
        }
    }
    interface Car extends Vehicle {
        public void drive();
        @Override
        default void honk() {
            System.out.println("Car Honking");
        }
    }
    static class ManualCar implements Car {
        public void start() {
            System.out.println("Starting");
        }
        public void drive() {
            System.out.println("Driving");
        }
        @Override
        public void honk() {
            System.out.println("Manual Car Honking");
        }
    }
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar();
        manualCar.start();
        manualCar.drive();
        manualCar.honk();
    }
}
