package AdvanceOOPs;

public class innerClassesIII {
    class OuterClass {
        int val = 100;
        String name = "OuterClass";

        public void execute() {
            int x = 10; //it has to be final or effectively final
            class InnerClass {
                public void execute() {
                    System.out.println(x);
                    System.out.println("Inner Class Executed");
                }
            }
            val += 100;
            InnerClass innerClass = new InnerClass();
            innerClass.execute();
        }
    }
    public static void main(String[] args) {
        innerClassesIII.OuterClass outerClass = new innerClassesIII().new OuterClass();
        outerClass.execute();
    }
}
