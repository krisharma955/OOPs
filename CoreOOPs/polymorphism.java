package CoreOOPs;

public class polymorphism {
    //! Method Overloading
    static class Calculator {
        int add(int a, int b) {
            return a+b;
        }
        double add(double a, double b) {
            return a+b;
        }
        int add(int a, int b, int c) {
            return a+b+c;
        }
    }

    //! Method Overriding
    static class Parent {
        void display() {
            System.out.println("Parent Class");
        }
    }
    static class Child extends Parent {
        @Override
        void display() {
            System.out.println("Child Class");
        }
    }

    public static void main(String[] args) {
        //static binding
        //compile poly
        Calculator obj1 = new Calculator();
        System.out.println(obj1.add(1,2)); //? when we decide when the methods & objects are gonna behave 

        //dynamic binding
        //runtime poly
        Child obj2 = new Child();
        obj2.display(); //? it is gonna call the display() method in the child class and the decision to call which method is polymorphism
    }
}
