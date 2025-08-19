public class ISP {
    interface Workable {
        void work();
    }
    interface Eatable {
        void eat();
    }

    class Human implements Workable, Eatable {
        public void work() {
            System.out.println();
        }
        public void eat() {
            System.out.println();
        }
    }

    class Robot implements Workable {
        public void work() {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //A class should not be forced to implement interfaces it does not use.
    }
}
