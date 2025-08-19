
public class DIP {
    interface Keyboard {
        void connect();
    }

    class WiredKeyboard implements Keyboard {
        public void connect() { System.out.println("Connected via wire."); }
    }

    class WirelessKeyboard implements Keyboard {
        public void connect() { System.out.println("Connected via Bluetooth."); }
    }

class Computer {
    Computer(Keyboard keyboard) { }

}

    public static void main(String[] args) {
        
    }
}
