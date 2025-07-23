package AdvanceOOPs;

public class abstractionII {
    interface CarInterface {
        public void start();

        //default & static
        default void noise() {
            System.out.println("Noise...");
        }
        static void numberOfWheels() { // static -> utility fxn
            System.out.println("Wheels: 4");
        }
    }
    static class ManualCar implements CarInterface {
        public void start() {
            System.out.println("Manual Car is starting.");
        }
    }
    public static void main(String[] args) {
        CarInterface mCar = new ManualCar();
        mCar.start();
        mCar.noise();

        CarInterface.numberOfWheels(); //static 
    }
}
