public class LSP {
    public interface Bird {}
    public interface FlyingBird extends Bird {
        public void fly();
    }

    public static class Sparrow implements FlyingBird {
        @Override
        public void fly() {
            System.out.println("flying");
        }
    }

    public static class Penguin implements Bird {
        //bcz penguin can't fly
    }
    public static void main(String[] args) {
        //LSP -> subclasses should behave like their parent class without unexpected results.
        //Use Case: Preventing unexpected crashes when substituting subclasses.
    }
}
