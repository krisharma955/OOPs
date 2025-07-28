package AdvanceOOPs;

public class interfaces {
    //Abstarction implemented via interface
    interface CarInterface {
        static final int cnt = 0; //* final variable - can't be changed or modified but can be accessed
        public void start();
        public void numberOfGears();

        //default & static (for concrete methods) - they can be overridden
        default void airbags() {
            System.out.println("5 airbags.");
        }
        static void vehicleType() {
            System.out.println("Car");
        }
    }

    interface Sunroof {
        public void sunroof();
    }

    static class ManualCar implements CarInterface, Sunroof {
        public void start() {
            System.out.println("Manual Car is starting..");
            System.out.println("cnt: " +cnt);
        }
        public void numberOfGears() {
            System.out.println("Manual Car has 7 gears.");
        }
        @Override
        public void airbags() {
            System.out.println("6 airbags.");
        }
        public void sunroof() {
            System.out.println("Normal Sunroof.");
        }
    }
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar();
        manualCar.start();
        manualCar.numberOfGears();
        manualCar.sunroof();
    }
}
