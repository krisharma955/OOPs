package AdvanceOOPs;

public class abstraction {
    abstract static class Car {
        Car() {
            System.out.println("Car constructor is called.");
        }
        abstract public void start();
        public void noise() {
            System.out.println("Noise..");
        }
    }
    abstract static class Dealer extends Car { // An abstract can extend another abstarct class. [to implement the hidden implemnetation is optional.]
        Dealer() {
            System.out.println("Dealer constrictor is called.");
        }
        Dealer(int numberOfCars) {
            System.out.println("Dealer paramertized constructor is called.");
            this.numberOfCars = numberOfCars;
        }
        int numberOfCars;
        abstract void isItOpen();
    }
    static class ManualCar extends Dealer {
        ManualCar(int n) {
            super(n);
            System.out.println("Manual Car constructor is called.");
        }
        public void start() {
            System.out.println("Manual Car is starting.");
        }
        public void isItOpen() {
            System.out.println("Yes, it is Open.");
        }
    }
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar(12); //? usually parent class is used
        manualCar.start();
        manualCar.noise();    
        //Heirarchial structure is followed
    }
}
