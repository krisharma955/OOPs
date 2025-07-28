package AdvanceOOPs;

public class innerClassesII {
    //Non-Static Inner Class
    static class OuterClass {
        static int val = 10;
        String name = "OuterClass";

        class InnerClass {
            public void execute() {
                //both val & name are accessible
                System.out.println(val);
                System.out.println(name);
                System.out.println("Inner Class Executed");
            }
        }
    }
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.execute();
    }
}
