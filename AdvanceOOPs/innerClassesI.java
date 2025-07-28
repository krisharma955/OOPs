package AdvanceOOPs;

// Static Nested Class
class OuterClass {
    static int val = 10;
    String name = "OuterClass";

    static class InnerClass {
        public void execute() {
            System.out.println("Val: " +val); //val is accesible but not name
            System.out.println("InnerClass Executed");
        }
    }

    //Access innerclass through outerclass
    public void execute() {
        InnerClass innerClass = new InnerClass();
        innerClass.execute();
    }
}

public class innerClassesI {
    public static void main(String[] args) {
        //*OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        //*innerClass.execute();

        //Access innerclass through outerclass
        OuterClass outerClass = new OuterClass();
        outerClass.execute();
    }
}
